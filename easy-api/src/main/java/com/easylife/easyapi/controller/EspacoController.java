package com.easylife.easyapi.controller;

import com.easylife.easyapi.entity.EspacoComum;
import com.easylife.easyapi.service.EspacoComumService;
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
@RequestMapping("/espacos")
public class EspacoController {

    @Autowired
    private EspacoComumService espacoComumService;

    @PostMapping("/")
    public ResponseEntity<EspacoComum> salvar(@RequestBody EspacoComum espacoComum, HttpServletResponse response) {
        EspacoComum espacoComumSalva = espacoComumService.salvar(espacoComum);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/id")
                .buildAndExpand(espacoComum.getId()).toUri();
        response.setHeader("Location", uri.toASCIIString());

        return ResponseEntity.created(uri).body(espacoComumSalva);

    }


}
