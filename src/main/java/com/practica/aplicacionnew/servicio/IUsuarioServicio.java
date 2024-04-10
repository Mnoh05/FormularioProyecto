package com.practica.aplicacionnew.servicio;

import com.practica.aplicacionnew.dto.UsuarioRegistroDTO;
import com.practica.aplicacionnew.models.UsuarioModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUsuarioServicio extends UserDetailsService {

    public UsuarioModel save(UsuarioRegistroDTO registroDTO);
}
