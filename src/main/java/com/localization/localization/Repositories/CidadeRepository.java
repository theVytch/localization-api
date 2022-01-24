package com.localization.localization.Repositories;

import com.localization.localization.Entities.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    @Query("SELECT obj FROM cidade obj WHERE obj.estado.codEstado = :id_est ORDER BY nom_cidade")
    List<Cidade> findAllByEstado(@Param(value = "id_est") Long id_est);

    List<Cidade> findByNome(String nome);
}
