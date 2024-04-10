package com.practica.aplicacionnew.controlador;
import com.practica.aplicacionnew.dto.UsuarioRegistroDTO;
import com.practica.aplicacionnew.servicio.IUsuarioServicio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {
    private IUsuarioServicio usuarioServicio;

    public RegistroUsuarioControlador(IUsuarioServicio usuarioServicio) {
        super();
        this.usuarioServicio = usuarioServicio;
    }
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }

    @GetMapping
    public String mostrarFormularioDeRegistro() {
        return "registro";
    }

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
        usuarioServicio.save(registroDTO);
        return "redirect:/registro?exito";
    }

}
