package com.easylife.easyapi.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
public class PermissaoUsuario {

    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "ID_PERMISSAO")
    private Long idPermissao;
}
