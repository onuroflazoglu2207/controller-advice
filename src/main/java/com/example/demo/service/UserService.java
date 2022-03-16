package com.example.demo.service;

import com.example.demo.dto.UserRequestDTO;
import com.example.demo.dto.UserResponseDTO;

import java.util.List;

public interface UserService {

    public List<UserResponseDTO> getAll();

    public UserResponseDTO getById(Long identity);

    public UserResponseDTO save(UserRequestDTO dto);

    public UserResponseDTO update(UserRequestDTO dto, Long identity);

    public UserResponseDTO delete(Long identity);
}
