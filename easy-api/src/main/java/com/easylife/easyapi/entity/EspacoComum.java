package com.easylife.easyapi.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@Data
@Entity
@Table(name = "ESPACO_COMUM")
public class EspacoComum {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PESSOA_SEQ")
    @SequenceGenerator(name = "PESSOA_SEQ", sequenceName = "PESSOA_SEQ", schema = "EASY_LIFE", allocationSize = 1)
    @Column(name = "ID_ESPACO_COMUM")
    private Long id;

    @NotNull
    private String nome;
    private Boolean ativo;

    @Column(name = "DATA_INICIO")
    private Date dataInicio;
    @Column(name = "DATA_FINAL")
    private Date dataFinal;

    private String descricao;


    private String imagem;

    @Column(name = "MAXIMO_CONVIDADOS")
    private Integer maximoConvidados;
}
