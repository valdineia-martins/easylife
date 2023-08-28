package com.easylife.easyapi.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;
@NoArgsConstructor
@Data
@Entity
@Table(name = "ESPACO_COMUM")
public class EspacoComum {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESPACO_COMUM_SEQ")
    @SequenceGenerator(name = "ESPACO_COMUM_SEQ", sequenceName = "ESPACO_COMUM_SEQ", allocationSize = 1)
    @Column(name = "ID_ESPACO_COMUM")
    private Long id;

    @NotNull
    private String nome;
    private Boolean ativo;

    @Column(name = "HORARIO_INICIO")
    private LocalTime horarioInicio;

    @Column(name = "HORARIO_FINAL")
    private LocalTime horarioFinal;

    private String descricao;

    @Column(name = "IMAGEM_UL")
    private String imagem;

    @Column(name = "MAXIMO_CONVIDADOS")
    private Integer maximoConvidados;
}
