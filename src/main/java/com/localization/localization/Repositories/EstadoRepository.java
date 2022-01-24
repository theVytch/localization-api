package com.localization.localization.Repositories;

import com.localization.localization.Entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Long> {

    List<Estado> findByNomeEstado(String name);

}
