package com.desarrollo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data public class User {

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "cedula")
    @Size(max = 10)
    private String cedula;

    @Column(name = "nombre")
    @Basic(optional = false)
    private String nombre;

    @Column(name = "apellido_paterno")
    @Basic(optional = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    @Basic(optional = false)
    private String apellidoMaterno;

    @Column(name = "activado")
    @Basic(optional = false)
    private Boolean activado;
}
