package com.easylife.easyapi.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class EspacoComumDTO {
    private Long id;
    private Boolean ativo;
    private LocalTime horarioInicio;
    private LocalTime horarioFinal;
    private String descricao;
    private String imagem;
    private Integer maximoConvidados;
}
