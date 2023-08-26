package com.easylife.easyapi.controller;

import com.easylife.easyapi.entity.Pessoa;
import com.easylife.easyapi.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/")
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa, HttpServletResponse response) {
        Pessoa pessoaSalva = pessoaService.salvar(pessoa);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/id")
                .buildAndExpand(pessoa.getId()).toUri();
        response.setHeader("Location", uri.toASCIIString());

        return ResponseEntity.created(uri).body(pessoaSalva);

    }

    @GetMapping("/")
    public ResponseEntity<?> listar() {
        List<Pessoa> pessoas = pessoaService.listar();
        return !pessoas.isEmpty() ? ResponseEntity.ok(pessoas) : ResponseEntity.noContent().build();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Pessoa> buscarPeloCodigo(@PathVariable Long codigo) {
        Pessoa pessoa =  pessoaService.buscarPeloCodigo(codigo);
        return pessoa != null ? ResponseEntity.ok(pessoa) : ResponseEntity.notFound().build();
    }

}
