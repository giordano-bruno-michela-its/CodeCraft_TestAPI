package com.codecraft.test_rest_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class FormPrenotazione extends FormRichiesta {
    
    private Date dataInizio;
    private Date dataFine;
    private int numPartecipanti;
    
}
