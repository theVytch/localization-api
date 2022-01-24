package com.localization.localization.Services;

import com.localization.localization.Entities.Cidade;
import com.localization.localization.Entities.Estado;
import com.localization.localization.Repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Estado> findAll(){
        return estadoRepository.findAll();
    }

    public Estado findById(Long id){
        Optional<Estado> estado = estadoRepository.findById(id);
        return estado.orElseThrow(IllegalStateException::new);
    }
}
