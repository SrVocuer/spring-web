package com.desarrollo.service.impl;

import com.desarrollo.dto.response.UserDTO;
import com.desarrollo.entities.User;
import com.desarrollo.repository.UserRepository;
import com.desarrollo.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final ObjectMapper mapper = new ObjectMapper();
    @Autowired
    private UserRepository repository;

    @Override
    public List<UserDTO> consultarUsuarios() {

        return repository.findAll()
                .stream()
                .map(usuer -> mapper.convertValue(usuer, UserDTO.class))
                .collect(Collectors.toList());
    }
}
