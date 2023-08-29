package com.easylife.easyapi.service;

import com.easylife.easyapi.entity.EspacoComum;
import com.easylife.easyapi.entity.Pessoa;
import com.easylife.easyapi.exception.NegocioException;
import com.easylife.easyapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
            return pessoaRepository.findById(codigo).orElseThrow(() -> new NegocioException("Pessoa não encontrada com o ID fornecido"));
    }

    public Pessoa findById(Long codigo) {
        Optional<Pessoa> obj =  pessoaRepository.findById(codigo);
        return obj.orElseThrow(() -> new NegocioException("Pessoa não encontrada com o ID fornecido"));
    }
}
