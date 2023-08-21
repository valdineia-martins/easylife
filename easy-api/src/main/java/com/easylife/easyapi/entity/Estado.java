package com.easylife.easyapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private String nome;
    private String sigla;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
}
