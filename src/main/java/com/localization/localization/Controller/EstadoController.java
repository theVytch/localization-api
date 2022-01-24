package com.localization.localization.Controller;

import com.localization.localization.Dto.CidadeDto;
import com.localization.localization.Dto.EstadoDto;
import com.localization.localization.Entities.Cidade;
import com.localization.localization.Entities.Estado;
import com.localization.localization.Services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public ResponseEntity<List<EstadoDto>> findAll(){
        List<Estado> listEstado = estadoService.findAll();
        List<EstadoDto> listEstadoDto = listEstado.stream().map(EstadoDto::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listEstadoDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estado> findById(@PathVariable Long id){
        Estado estado = estadoService.findById(id);
        return ResponseEntity.ok().body(estado);
    }

    @GetMapping("/filter")
    public ResponseEntity<List<EstadoDto>> findByName(@RequestParam("nome") String name){
        List<Estado> listEstado = estadoService.findByNomeEstado(name);
        List<EstadoDto> listEstadoDto = listEstado.stream().map(EstadoDto::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listEstadoDto);
    }
}
