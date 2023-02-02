/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 *
 * @author itu
 */
public class Employer {
    int id;
    String Nom;
    String Prenom;
    String Adresse;
    String Numero;
    Date DateEmployer;
    String Genre;

    public Employer(String Nom, String Prenom, String Adresse, String Numero, Date DateEmployer, String Genre) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.Numero = Numero;
        this.DateEmployer = DateEmployer;
        this.Genre = Genre;
    }

    public Employer(int id, String Nom, String Prenom, String Adresse, String Numero, Date DateEmployer, String Genre) {
        this.id = id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.Numero = Numero;
        this.DateEmployer = DateEmployer;
        this.Genre = Genre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public Date getDateEmployer() {
        return DateEmployer;
    }

    public void setDateEmployer(Date DateEmployer) {
        this.DateEmployer = DateEmployer;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    
}
