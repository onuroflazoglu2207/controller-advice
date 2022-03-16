package com.example.demo.mapper;

import com.example.demo.decorator.UserResponseMapperDecorator;
import com.example.demo.dto.UserResponseDTO;
import com.example.demo.model.UserModel;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
@DecoratedWith(UserResponseMapperDecorator.class)
public interface UserResponseMapper {
    UserResponseDTO toUserResponseDTO(UserModel user);

    List<UserResponseDTO> toUserResponseDTOs(List<UserModel> users);

    UserModel toUserModel(UserResponseDTO dto);

    List<UserModel> toUserModels(List<UserResponseDTO> dtos);
}
