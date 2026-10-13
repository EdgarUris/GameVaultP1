package com.example.GameVault.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "juegos")
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCounter;

    @Column(nullable=false)
    private String titulo;

    @Column(nullable = false)
    private String descripcion;

    @Column(name="portada_url")
    private String portadaUrl;
}
