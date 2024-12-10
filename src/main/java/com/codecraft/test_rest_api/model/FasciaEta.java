package com.codecraft.test_rest_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class FasciaEta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String denominazione;
    private String descrizione;
    private int etaMin;
    private int etaMax;

//    public FasciaEta() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getDenominazione() {
//        return denominazione;
//    }
//
//    public void setDenominazione(String denominazione) {
//        this.denominazione = denominazione;
//    }
//
//    public String getDescrizione() {
//        return descrizione;
//    }
//
//    public void setDescrizione(String descrizione) {
//        this.descrizione = descrizione;
//    }
//
//    public int getEtaMin() {
//        return etaMin;
//    }
//
//    public void setEtaMin(int etaMinima) {
//        this.etaMin = etaMinima;
//    }
//
//    public int getEtaMax() {
//        return etaMax;
//    }
//
//    public void setEtaMax(int etaMassima) {
//        this.etaMax = etaMassima;
//    }
}
