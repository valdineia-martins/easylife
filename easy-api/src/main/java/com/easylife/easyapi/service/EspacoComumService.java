package com.easylife.easyapi.service;

import com.easylife.easyapi.entity.EspacoComum;
import com.easylife.easyapi.repository.EspacoComumRepository;
import com.easylife.easyapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspacoComumService {
    @Autowired
    private EspacoComumRepository espacoComumRepository;
    public EspacoComum salvar(EspacoComum espacoComum){
       return espacoComumRepository.save(espacoComum);
    }


}
