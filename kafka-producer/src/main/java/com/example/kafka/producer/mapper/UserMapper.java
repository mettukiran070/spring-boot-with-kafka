package com.example.kafka.producer.mapper;

import com.example.kafka.model.User;
import com.example.kafka.producer.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

  User mapUserDtoToModel(UserDto user);

}
