package com.easylife.easyapi.service;

import com.easylife.easyapi.entity.EspacoComum;
import com.easylife.easyapi.entity.Pessoa;
import com.easylife.easyapi.entity.Reserva;
import com.easylife.easyapi.exception.NegocioException;
import com.easylife.easyapi.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private EspacoComumService espacoComumService;

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva salvarAgenda(Reserva reserva)  {

        if (reserva == null) {
            throw new NegocioException("A reserva não pode ser nula");
        }

        Pessoa pessoa = pessoaService.buscarPeloCodigo(reserva.getPessoa().getId());

        EspacoComum espacoComum = espacoComumService.buscarPeloCodigo(reserva.getEspacoComum().getId());

        Reserva novaReserva = Reserva.builder()
                .dataReserva(reserva.getDataReserva())
                .espacoComum(espacoComum)
                .pessoa(pessoa)
                .build();

        return reservaRepository.save(novaReserva);
    }

}
