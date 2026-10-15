package com.example.GameVault.repositorio;

import com.example.GameVault.model.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JuegoRepository extends JpaRepository<Juego, Long> {

    // @Query SELECT * FROM juegos WHERE titulo = :titulo
    List<Juego> findByTituloContainingIgnoreCase(String titulo);


    // List<Juego> findByGenero(String genero);


}

