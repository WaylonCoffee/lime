package com.qing.owl.auth.infra.repository.user.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.qing.owl.auth.domain.user.entity.User;
import com.qing.owl.auth.infra.repository.user.persistence.UserDo;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    UserDo userToUserDo(User user);
}