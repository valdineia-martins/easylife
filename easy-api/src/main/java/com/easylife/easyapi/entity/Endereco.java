package com.easylife.easyapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Embeddable
public class Endereco {
    private Long codigo;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

}
