package com.example.kafka.producer.service;

import com.example.kafka.model.User;
import com.example.kafka.producer.dto.UserDto;
import com.example.kafka.producer.mapper.UserMapper;
import com.example.kafka.producer.publisher.UserPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

  private final UserMapper userMapper;
  private final UserPublisher userPublisher;

  public String publishuserInfo(UserDto userDto) {
    User user = userMapper.mapUserDtoToModel(userDto);
    log.info("User information {}", user);
    this.userPublisher.sendUser(user);
    return "Published Successfully";
  }

}
