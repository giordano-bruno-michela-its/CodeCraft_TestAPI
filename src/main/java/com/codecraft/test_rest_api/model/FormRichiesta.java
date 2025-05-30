package com.codecraft.test_rest_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
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
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    private String email;
    private String nome;
    private String cognome;
    private String ente;
    private String telefono;
    private Date dataContatto;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoRichiesta tipoRichiesta;
}
