package com.easylife.easyapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
public class Estado {

    private Long codigo;
    private String nome;
    private String sigla;

    private Date dataCriacao;

    private Date dataAtualizacao;
}
