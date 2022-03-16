package com.example.demo.controller;

import com.example.demo.dto.UserRequestDTO;
import com.example.demo.dto.UserResponseDTO;
import com.example.demo.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl service;

    @GetMapping("/getAll")
    public List<UserResponseDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/getById/{identity}")
    public UserResponseDTO getById(@PathVariable Long identity) {
        return service.getById(identity);
    }

    @PostMapping("/save")
    public UserResponseDTO save(@RequestBody UserRequestDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/update/{identity}")
    public UserResponseDTO update(@RequestBody UserRequestDTO dto, @PathVariable Long identity) {
        return service.update(dto, identity);
    }

    @DeleteMapping("/delete/{identity}")
    public UserResponseDTO delete(@PathVariable Long identity) {
        return service.delete(identity);
    }
}