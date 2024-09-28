package com.v1.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConsulta;

    private String diagnostico;

    @Lob
    private String evolucion;

    // Relación con Paciente
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    // Relación con Médico
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;
}
