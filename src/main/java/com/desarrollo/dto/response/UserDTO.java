package com.desarrollo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data public class UserDTO {

    private String cedula;

    private String nombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private Boolean activado;
}
