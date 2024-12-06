package com.codecraft.test_rest_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

//@NoArgsConstructor
//@Getter
//@Setter
@Entity
public class FormPrenotazione extends FormRichiesta {
    
    private Date dataInizio;
    private Date dataFine;
    private int numPartecipanti;

    public FormPrenotazione() {
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }

    public int getNumPartecipanti() {
        return numPartecipanti;
    }

    public void setNumPartecipanti(int numPartecipanti) {
        this.numPartecipanti = numPartecipanti;
    }
}
