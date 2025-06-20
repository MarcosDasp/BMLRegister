package com.bmlregister.formularios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmlregister.formularios.model.Formulario;
import com.bmlregister.formularios.service.FormularioService;

@RestController
@RequestMapping("/api/formularios")
@CrossOrigin(origins = "*") // Permite que o frontend acesse a API
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @PostMapping
    public Formulario receberFormulario(@RequestBody Formulario formulario) {
        return formularioService.salvarFormulario(formulario);
    }

    @GetMapping
    public List<Formulario> listarFormularios() {
        return formularioService.listarTodos();
    }
    
}
