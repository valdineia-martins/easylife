package com.easylife.easyapi.controller;

import com.easylife.easyapi.dto.ReservaDTO;
import com.easylife.easyapi.entity.Reserva;
import com.easylife.easyapi.service.ReservaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ModelMapper modelMapper;


    @Autowired
    private ReservaService reservaService;
    @PostMapping("/")
    public ResponseEntity<Reserva> agendar(@Valid @RequestBody ReservaDTO obj, HttpServletResponse response) {

        Reserva reservaSalva = reservaService.salvarAgenda(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/id")
                .buildAndExpand(reservaService.salvarAgenda(obj)).toUri();
        return  ResponseEntity.created(uri).body(reservaSalva);

    }
}
