package com.desarrollo.service;

import com.desarrollo.dto.response.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> consultarUsuarios();
}
