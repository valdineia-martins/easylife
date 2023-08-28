package com.easylife.easyapi.service;

import com.easylife.easyapi.entity.EspacoComum;
import com.easylife.easyapi.entity.Pessoa;
import com.easylife.easyapi.repository.EspacoComumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return espacoComumRepository.findById(codigo).orElse(null);
    }
}
