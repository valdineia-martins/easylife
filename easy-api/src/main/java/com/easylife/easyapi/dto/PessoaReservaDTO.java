package com.easylife.easyapi.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
@Data
public class PessoaReservaDTO {
    @NotNull(message = "Preencha o campo id")
    private Long id;
}
