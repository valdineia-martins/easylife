package com.easylife.easyapi.service;

import com.easylife.easyapi.entity.EspacoComum;
import com.easylife.easyapi.exception.NegocioException;
import com.easylife.easyapi.repository.EspacoComumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspacoComumService {
    @Autowired
    private EspacoComumRepository espacoComumRepository;

    public EspacoComum salvar(EspacoComum espacoComum){
       return espacoComumRepository.save(espacoComum);
    }


    public List<EspacoComum> listar() {
        return espacoComumRepository.findAll();
    }

    public EspacoComum buscarPeloCodigo(Long codigo) {
        return espacoComumRepository.findById(codigo).orElseThrow(() -> new NegocioException("Pessoa não encontrada com o ID fornecido"));
    }

    public EspacoComum findById(Long id) {
        Optional<EspacoComum> obj = espacoComumRepository.findById(id);
        return obj.orElseThrow(() -> new NegocioException("Pessoa não encontrada com o ID fornecido"));
    }
}
