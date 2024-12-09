package com.codecraft.test_rest_api.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
public class FormPrenotazione extends FormRichiesta {
    
    private Date dataInizio;
    private Date dataFine;
    private int numPartecipanti;
    private int numInsegnanti;

    @ManyToOne
    @JoinColumn(name = "fascia_eta_id")
    private FasciaEta fasciaEta;

    @ManyToOne
    @JoinColumn(name = "tipo_attivita_id")
    private TipoAttivita tipoAttivita;

    public FormPrenotazione() {
        super();
        this.setTipoRichiesta(TipoRichiesta.RICHIESTA_PRENOTAZIONE);
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
