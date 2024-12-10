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
@Inheritance(strategy = InheritanceType.JOINED)
public class FormRichiesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

//    public FormRichiesta() {
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
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getCognome() {
//        return cognome;
//    }
//
//    public void setCognome(String cognome) {
//        this.cognome = cognome;
//    }
//
//    public String getTelefono() {
//        return telefono;
//    }
//
//    public void setTelefono(String telefono) {
//        this.telefono = telefono;
//    }
//
//    public Date getDataContatto() {
//        return dataContatto;
//    }
//
//    public void setDataContatto(Date dataContatto) {
//        this.dataContatto = dataContatto;
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
//    public TipoRichiesta getTipoRichiesta() {
//        return tipoRichiesta;
//    }
//
//    public void setTipoRichiesta(TipoRichiesta tipoRichiesta) {
//        this.tipoRichiesta = tipoRichiesta;
//    }
//
//    public String getEnte() {
//        return ente;
//    }
//
//    public void setEnte(String ente) {
//        this.ente = ente;
//    }
}
