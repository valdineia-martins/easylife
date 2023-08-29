package com.easylife.easyapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservaDTO implements Serializable {

    private long id;

    @NotNull(message = "Espaço comum não pode ser null")
    private EspacoComumReservaDTO espacoComum;

    @NotNull(message = "Pessoa não pode ser null")
    private PessoaReservaDTO pessoa;

    @NotNull(message = "Preencha o campo data reserva")
    private Date dataReserva;
}
