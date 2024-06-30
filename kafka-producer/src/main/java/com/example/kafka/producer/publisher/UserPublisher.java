package com.example.kafka.producer.publisher;

import com.example.kafka.model.User;
import java.util.concurrent.CompletableFuture;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserPublisher {

  private final KafkaTemplate<String, User> kafkaTemplate;
  @Value("${user.producer.topic.name}")
  private String USER_TOPIC;

  public void sendUser(User user) {
    CompletableFuture<SendResult<String, User>> resFuture = this.kafkaTemplate.send(USER_TOPIC, user);
    resFuture.whenComplete((result, ex) -> {
      if (ex == null ) {
        log.info("sent message {} with offset {}", user, result.getRecordMetadata().offset());
      } else {
        log.error("Unable to send message {} due to {}", user, ex.getMessage());
      }
    });

  }

}
