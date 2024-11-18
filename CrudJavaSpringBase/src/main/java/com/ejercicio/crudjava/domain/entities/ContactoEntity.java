package com.ejercicio.crudjava.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "contactos2")
public class ContactoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contacto_id_seq2")
    @SequenceGenerator(name = "contacto_id_seq2", sequenceName = "contacto_id_seq2", allocationSize = 1)
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
}
