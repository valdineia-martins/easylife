package com.easylife.easyapi.controller;

import com.easylife.easyapi.entity.EspacoComum;
import com.easylife.easyapi.entity.Pessoa;
import com.easylife.easyapi.service.EspacoComumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

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

    @GetMapping("/")
    public ResponseEntity<?> listar() {
        List<EspacoComum> espacoComums = espacoComumService.listar();
        return !espacoComums.isEmpty() ? ResponseEntity.ok(espacoComums) : ResponseEntity.noContent().build();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<EspacoComum> buscarPeloCodigo(@PathVariable Long codigo) {
        EspacoComum espacoComum =  espacoComumService.buscarPeloCodigo(codigo);

        return  espacoComum!= null ? ResponseEntity.ok(espacoComum) : ResponseEntity.notFound().build();
    }


}
