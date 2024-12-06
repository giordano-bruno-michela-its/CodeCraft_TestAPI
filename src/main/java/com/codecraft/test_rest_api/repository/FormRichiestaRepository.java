package com.codecraft.test_rest_api.repository;

import com.codecraft.test_rest_api.model.FormRichiesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRichiestaRepository extends JpaRepository<FormRichiesta, Long> {
}
