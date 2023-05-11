package com.desarrollo.controllers;

import com.desarrollo.dto.ApiResponseDTO;
import com.desarrollo.dto.response.UserDTO;
import com.desarrollo.service.UserService;
import com.desarrollo.util.Meta;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/all")
    public ResponseEntity<ApiResponseDTO<List<UserDTO>>> consultarTodosUsuarios(){
        final Meta meta = new Meta("OK", 200);
        return new ResponseEntity<>(new ApiResponseDTO<>(meta, service.consultarUsuarios()),HttpStatus.OK);
    }
}
