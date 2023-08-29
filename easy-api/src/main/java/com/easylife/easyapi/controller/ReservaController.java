package com.easylife.easyapi.controller;

import com.easylife.easyapi.entity.Pessoa;
import com.easylife.easyapi.entity.Reserva;
import com.easylife.easyapi.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;
    @PostMapping("/")
    public ResponseEntity<Reserva> agendar(@RequestBody Reserva reserva, HttpServletResponse response) {

        Reserva reservaSalva = reservaService.salvarAgenda(reserva);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/id")
                .buildAndExpand(reservaSalva.getId()).toUri();
        response.setHeader("Location", uri.toASCIIString());

        return ResponseEntity.created(uri).body(reservaSalva);

    }
}
