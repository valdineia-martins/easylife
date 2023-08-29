package com.easylife.easyapi.dto;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public class PessoaDTO {

    private Long id;
    private String nome;
    private Boolean ativo;
    private Date dataCriacao;
    private Date dataAtualizacao;
}
