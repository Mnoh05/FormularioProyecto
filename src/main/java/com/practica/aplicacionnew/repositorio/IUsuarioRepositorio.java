package com.practica.aplicacionnew.repositorio;

import com.practica.aplicacionnew.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepositorio extends JpaRepository<UsuarioModel, Long> {
}
