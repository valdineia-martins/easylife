package com.easylife.easyapi.controller;

import com.easylife.easyapi.entity.Estado;
import com.easylife.easyapi.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/estado")
public class EstadoController {

    @Autowired
    private EstadoService service;

    @GetMapping("/")
    public List<Estado> buscarTodos(){
        return service.buscarTodos();
    }

    @PostMapping("/")
    public ResponseEntity<Estado> inserir(@RequestBody Estado estado){        
        return ResponseEntity.ok().body(service.inserir(estado));
    }

    @PutMapping("/")
    public ResponseEntity<Estado> alterar(Estado estado){
         return ResponseEntity.ok().body(service.alterar(estado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathParam("id") Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
