package com.example.kafka.producer.service;

import com.example.kafka.producer.dto.User;
import com.example.kafka.producer.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

  private final UserMapper userMapper;
  private final KafkaTemplate<String, com.example.kafka.producer.model.User> kafkaTemplate;

  public String publishuserInfo(User user) {
    com.example.kafka.producer.model.User userModel = userMapper.mapUserDtoToModel(user);
    log.info("User information {}", userModel);
    return "Published Successfully";
  }

}
