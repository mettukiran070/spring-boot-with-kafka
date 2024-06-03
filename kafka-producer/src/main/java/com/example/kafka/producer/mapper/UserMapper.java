package com.example.kafka.producer.mapper;

import com.example.kafka.producer.dto.UserDto;
import com.example.kafka.producer.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

  User mapUserDtoToModel(UserDto user);

}
