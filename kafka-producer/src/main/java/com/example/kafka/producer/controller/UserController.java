package com.example.kafka.producer.controller;

import com.example.kafka.producer.dto.User;
import com.example.kafka.producer.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

  private final UserService userService;

  @PostMapping("/user")
  public ResponseEntity<String> saveUser(@RequestBody User user) {
    String response = userService.publishuserInfo(user);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

}
