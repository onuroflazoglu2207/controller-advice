package com.example.demo.mapper;

import com.example.demo.dto.UserRequestDTO;
import com.example.demo.model.UserModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserRequestMapper {

    UserRequestDTO toUserRequestDTO(UserModel user);

    List<UserRequestDTO> toUserRequestDTOs(List<UserModel> users);

    UserModel toUserModel(UserRequestDTO dto);

    List<UserModel> toUserModels(List<UserRequestDTO> dtos);
}
