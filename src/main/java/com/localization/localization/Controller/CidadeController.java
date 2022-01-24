package com.localization.localization.Controller;

import com.localization.localization.Dto.CidadeDto;
import com.localization.localization.Entities.Cidade;
import com.localization.localization.Services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public ResponseEntity<List<CidadeDto>> findAll(@RequestParam(value = "estado", defaultValue = "0") Long id_est){
        List<Cidade> listCidade = cidadeService.findAll(id_est);
        List<CidadeDto> listCidadeDto = listCidade.stream().map(CidadeDto::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listCidadeDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidade> findById(@PathVariable Long id){
        Cidade cidade = cidadeService.findById(id);
        return ResponseEntity.ok().body(cidade);
    }
}
