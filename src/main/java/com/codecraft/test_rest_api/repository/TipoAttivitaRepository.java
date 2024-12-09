package com.codecraft.test_rest_api.repository;

import com.codecraft.test_rest_api.model.TipoAttivita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoAttivitaRepository extends JpaRepository<TipoAttivita, Long> {
}