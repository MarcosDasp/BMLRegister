package com.bmlregister.formularios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmlregister.formularios.model.Formulario;
import com.bmlregister.formularios.repository.FormularioRepository;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository repository;

    public Formulario salvarFormulario(Formulario formulario) {
        // Aqui podemos futuramente adicionar regras ou validações
        return repository.save(formulario);
    }

    public List<Formulario> listarTodos() {
        return repository.findAll();
    }
}
