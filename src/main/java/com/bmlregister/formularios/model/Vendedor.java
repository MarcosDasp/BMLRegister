package com.bmlregister.formularios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendedores")
public class Vendedor extends Funcionario {

    final private Integer nivelAcesso = 1;

    // Get

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }

}
