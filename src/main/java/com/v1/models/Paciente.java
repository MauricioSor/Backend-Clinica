package com.v1.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String dni;
    private String cuil;
    private String email;
    private String telefono;
    private String direccion;
    private String localidad;
    private String provincia;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    // Relaciones
    @OneToMany(mappedBy = "paciente")
    private List<HistoriaClinica> historiasClinicas;
}
