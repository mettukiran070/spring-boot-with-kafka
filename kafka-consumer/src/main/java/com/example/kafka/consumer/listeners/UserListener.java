package com.example.kafka.consumer.listeners;

import com.example.kafka.consumer.service.UserService;
import com.example.kafka.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserListener {

  private final UserService userService;

  @KafkaListener(topics = "user-topic", groupId = "usergrp")
  public void userMessageListener(User user) {
    log.info("recieved the user info from topic {}", user);
    this.userService.save(user);
  }

}
