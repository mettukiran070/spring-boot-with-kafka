package com.example.kafka.producer.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class KafkaConfig {

  @Value("${user.producer.topic.name}")
  private String TOPIC;

  @Bean
  public NewTopic createTopic() {
    return new NewTopic(TOPIC, 2, (short) 1);
  }

}
