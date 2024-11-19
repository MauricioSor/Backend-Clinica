package com.sw24.clinicaapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nroHistoriaClinica;

    private Date fechaCreacion;

    @OneToOne(mappedBy = "historiaClinica")
    @JsonBackReference
    private Paciente paciente;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "historia_clinica_diagnostico",
            joinColumns = @JoinColumn(name = "nro_historia_clinica"),
            inverseJoinColumns = @JoinColumn(name = "id_diagnostico")
    )
    @JsonManagedReference
    private List<Diagnostico> diagnosticos;

    public HistoriaClinica() {
        this.fechaCreacion = new Date();
        this.diagnosticos = new ArrayList<>();
    }

    public void agregarDiagnostico(Diagnostico diagnostico) {
        diagnosticos.add(diagnostico);
    }
}