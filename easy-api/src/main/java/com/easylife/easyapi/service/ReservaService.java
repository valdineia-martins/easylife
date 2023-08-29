package com.easylife.easyapi.service;

import com.easylife.easyapi.dto.*;
import com.easylife.easyapi.entity.EspacoComum;
import com.easylife.easyapi.entity.Pessoa;
import com.easylife.easyapi.entity.Reserva;
import com.easylife.easyapi.exception.NegocioException;
import com.easylife.easyapi.repository.ReservaRepository;
import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper mapper;

    public Reserva salvarAgenda(ReservaDTO reserva)  {

        if (reserva == null) {
            throw new NegocioException("A reserva não pode ser nula");
        }

        PessoaReservaDTO pessoaDTO = mapper.map(pessoaService.findById(reserva.getPessoa().getId()), PessoaReservaDTO.class);

        EspacoComumReservaDTO espacoComumDTO =
                mapper.map(espacoComumService.findById(reserva.getEspacoComum().getId()), EspacoComumReservaDTO.class);

        ReservaDTO novaReserva = ReservaDTO.builder()
                .dataReserva(reserva.getDataReserva())
                .espacoComum(espacoComumDTO)
                .pessoa(pessoaDTO)
                .build();

        return reservaRepository.save(mapper.map(novaReserva, Reserva.class));
    }

}
