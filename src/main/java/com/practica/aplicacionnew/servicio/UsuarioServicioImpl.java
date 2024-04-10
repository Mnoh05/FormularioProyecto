package com.practica.aplicacionnew.servicio;

import com.practica.aplicacionnew.dto.UsuarioRegistroDTO;
import com.practica.aplicacionnew.models.UsuarioModel;
import com.practica.aplicacionnew.repositorio.IUsuarioRepositorio;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements IUsuarioServicio {

    private IUsuarioRepositorio usuarioRepositorio;

    public UsuarioServicioImpl(IUsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public UsuarioModel save(UsuarioRegistroDTO registroDTO) {
       UsuarioModel usuario = new UsuarioModel(registroDTO.getFirstName(),
               registroDTO.getLastName(),registroDTO.getEmail(),
               registroDTO.getPassword());
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
