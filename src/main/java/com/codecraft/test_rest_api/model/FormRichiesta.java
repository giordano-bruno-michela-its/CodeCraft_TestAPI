package com.codecraft.test_rest_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class FormRichiesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String nome;
    private String cognome;
    private String telefono;
    private Date dataContatto;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoRichiesta tipoRichiesta;
    
    private enum TipoRichiesta {
        RICHIESTA_INFORMAZIONI,
        RICHIESTA_PRENOTAZIONE
    }
    
    @ManyToOne
    @JoinColumn(name = "fasciaEta_id")
    private FasciaEta fasciaEta;
    
    @ManyToOne
    @JoinColumn(name = "tipoAttivita_id")
    private TipoAttivita tipoAttivita;
    
    
}
