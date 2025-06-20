package com.bmlregister.formularios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "gerentes")
public class Gerente extends Funcionario {


    final private Integer nivelAcesso = 3;

    // Get e Set

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }
}
