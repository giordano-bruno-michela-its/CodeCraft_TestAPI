package com.codecraft.test_rest_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

// Make abstract class Form with common properties and methods, then extend it with FormRichiesta and FormPrenotazione

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
    
    
    @ManyToOne
    @JoinColumn(name = "fascia_eta_id")
    private FasciaEta fasciaEta;
    
    @ManyToOne
    @JoinColumn(name = "tipo_attivita_id")
    private TipoAttivita tipoAttivita;
    
    private enum TipoRichiesta {
        RICHIESTA_INFORMAZIONI,
        RICHIESTA_PRENOTAZIONE
    }

    public FormRichiesta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getDataContatto() {
        return dataContatto;
    }

    public void setDataContatto(Date dataContatto) {
        this.dataContatto = dataContatto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoRichiesta getTipoRichiesta() {
        return tipoRichiesta;
    }

    public void setTipoRichiesta(TipoRichiesta tipoRichiesta) {
        this.tipoRichiesta = tipoRichiesta;
    }

    public FasciaEta getFasciaEta() {
        return fasciaEta;
    }

    public void setFasciaEta(FasciaEta fasciaEta) {
        this.fasciaEta = fasciaEta;
    }

    public TipoAttivita getTipoAttivita() {
        return tipoAttivita;
    }

    public void setTipoAttivita(TipoAttivita tipoAttivita) {
        this.tipoAttivita = tipoAttivita;
    }
}
