package com.codecraft.test_rest_api.controller;

import com.codecraft.test_rest_api.model.FormRichiesta;
import com.codecraft.test_rest_api.repository.FormRichiestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/formreq")
public class FormRichiestaController {
    
    @Autowired
    private FormRichiestaRepository formRichiestaRepository;
    
    @GetMapping("/all")
    public List<FormRichiesta> getAllFormRichiesta() {
        return formRichiestaRepository.findAll();
    }
    
}
