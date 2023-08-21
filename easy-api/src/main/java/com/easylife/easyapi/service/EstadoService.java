package com.easylife.easyapi.service;

import com.easylife.easyapi.entity.Estado;
import com.easylife.easyapi.repository.Estadorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private Estadorepository estadorepository;

    public List<Estado> buscarTodos(){
        return estadorepository.findAll();
    }

    public Estado inserir(Estado estado){
        estado.setDataCriacao(new Date());
        return estadorepository.saveAndFlush(estado);
    }

    public Estado alterar(Estado estado){
        estado.setDataAtualizacao(new Date());
        return estadorepository.saveAndFlush(estado);
    }

    public void excluir(Long id){
        Estado estado = estadorepository.findById(id).get();
        estadorepository.delete(estado);
    }

}
