package com.easylife.easyapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PERMISSAO_USUARIO")
public class PermissaoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERMISSAO_USUARIO_SEQ")
    @SequenceGenerator(name = "PERMISSAO_USUARIO_SEQ", sequenceName = "PERMISSAO_USUARIO_SEQ", allocationSize = 1)
    @Column(name = "ID_PERMISSAO_USUARIO")
    private Long id;

    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "ID_PERMISSAO")
    private Long idPermissao;
}
