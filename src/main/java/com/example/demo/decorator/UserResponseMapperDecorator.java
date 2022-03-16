package com.example.demo.decorator;

import com.example.demo.controller.UserController;
import com.example.demo.dto.UserResponseDTO;
import com.example.demo.mapper.UserResponseMapper;
import com.example.demo.model.UserModel;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;


public class UserResponseMapperDecorator implements UserResponseMapper {

    @Setter(onMethod = @__({@Autowired}))
    private UserResponseMapper mapper;

    @Override
    public UserResponseDTO toUserResponseDTO(UserModel user) {
        return setLink(user);
    }

    @Override
    public List<UserResponseDTO> toUserResponseDTOs(List<UserModel> users) {
        List<UserResponseDTO> list = new ArrayList<>();
        for (UserModel model : users) {
            list.add(setLink(model));
        }
        return list;
    }

    public UserResponseDTO setLink(UserModel model) {
        UserResponseDTO dto = mapper.toUserResponseDTO(model);
        dto.setGetLink(MvcUriComponentsBuilder.fromMethodName(UserController.class,
                "getById", model.getIdentity()).build().toString());
        return dto;
    }

    @Override
    public UserModel toUserModel(UserResponseDTO dto) {
        return mapper.toUserModel(dto);
    }

    @Override
    public List<UserModel> toUserModels(List<UserResponseDTO> dtos) {
        return mapper.toUserModels(dtos);
    }
}
