package com.bmlregister.formularios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "analistas")
public class Analista extends Funcionario {

    final private Integer nivelAcesso = 2;

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }
}
