package com.localization.localization.Services;

import com.localization.localization.Entities.Cidade;
import com.localization.localization.Repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;
    @Autowired
    private EstadoService estadoService;

    public List<Cidade> findAll(Long id_est){
        estadoService.findById(id_est);
        return cidadeRepository.findAllByEstado(id_est);
    }

    public Cidade findById(Long id){
        Optional<Cidade> cidade = cidadeRepository.findById(id);
        return cidade.orElseThrow(IllegalStateException::new);
    }

    public List<Cidade> findByNome(String nome){
        return cidadeRepository.findByNome(nome);
    }
}
