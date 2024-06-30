package com.example.kafka.consumer.service;

import com.example.kafka.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

  public User save(User user) {
    log.info("saved the user");
    return user;
  }



}
