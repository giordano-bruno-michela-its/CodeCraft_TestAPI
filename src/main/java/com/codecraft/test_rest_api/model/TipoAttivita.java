package com.codecraft.test_rest_api.model;

import jakarta.persistence.*;

@Entity
public class TipoAttivita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String denominazione;

    @ManyToOne
    @JoinColumn(name = "fascia_eta_id")
    private FasciaEta fasciaEta;

    public TipoAttivita() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public FasciaEta getFasciaEta() {
        return fasciaEta;
    }

    public void setFasciaEta(FasciaEta fasciaEta) {
        this.fasciaEta = fasciaEta;
    }
}
