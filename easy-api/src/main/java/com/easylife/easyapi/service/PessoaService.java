package com.easylife.easyapi.service;

import com.easylife.easyapi.entity.Pessoa;
import com.easylife.easyapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;
    public Pessoa salvar(Pessoa pessoa) {
        pessoa.setDataCriacao(new Date());
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    public Pessoa buscarPeloCodigo(Long codigo) {

        return pessoaRepository.findById(codigo).get();
    }
}
