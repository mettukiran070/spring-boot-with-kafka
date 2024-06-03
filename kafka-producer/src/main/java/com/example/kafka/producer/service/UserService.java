package com.example.kafka.producer.service;

import com.example.kafka.producer.dto.UserDto;
import com.example.kafka.producer.mapper.UserMapper;
import com.example.kafka.producer.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

  private final UserMapper userMapper;
  private final KafkaTemplate<String, User> kafkaTemplate;

  private final String USER_TOPIC = "user-topic";

  public String publishuserInfo(UserDto userDto) {
    User user = userMapper.mapUserDtoToModel(userDto);
    log.info("User information {}", user);
    this.kafkaTemplate.send(USER_TOPIC, user);
    return "Published Successfully";
  }

}
