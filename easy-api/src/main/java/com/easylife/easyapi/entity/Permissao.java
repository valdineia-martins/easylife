package com.easylife.easyapi.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "PERMISSAO")
public class Permissao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERMISSAO_SEQ")
    @SequenceGenerator(name = "PERMISSAO_SEQ", sequenceName = "PERMISSAO_SEQ", schema = "EASY_LIFE", allocationSize = 1)
    @Column(name = "ID_PERMISSAO")
    private Long id;

    private String descricao;


}
