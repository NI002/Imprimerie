/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Color;

/**
 *
 * @author itu
 */
public class Papier {
    int id;
    String TypeDePapier;
    String Format;
    CouleurDEcriture CouleurDelEcriture;
    CouleurDupapier CouleurDePapier;

    public Papier(String TypeDePapier, String Format, CouleurDEcriture CouleurDelEcriture, CouleurDupapier CouleurDePapier) {
        this.TypeDePapier = TypeDePapier;
        this.Format = Format;
        this.CouleurDelEcriture = CouleurDelEcriture;
        this.CouleurDePapier = CouleurDePapier;
    }

    public Papier(int id, String TypeDePapier, String Format, CouleurDEcriture CouleurDelEcriture, CouleurDupapier CouleurDePapier) {
        this.id = id;
        this.TypeDePapier = TypeDePapier;
        this.Format = Format;
        this.CouleurDelEcriture = CouleurDelEcriture;
        this.CouleurDePapier = CouleurDePapier;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getTypeDePapier() {
        return TypeDePapier;
    }

    public void setTypeDePapier(String TypeDePapier) {
        this.TypeDePapier = TypeDePapier;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String Format) {
        this.Format = Format;
    }

    public CouleurDEcriture getCouleurDelEcriture() {
        return CouleurDelEcriture;
    }

    public void setCouleurDelEcriture(CouleurDEcriture CouleurDelEcriture) {
        this.CouleurDelEcriture = CouleurDelEcriture;
    }

    public CouleurDupapier getCouleurDePapier() {
        return CouleurDePapier;
    }

    public void setCouleurDePapier(CouleurDupapier CouleurDePapier) {
        this.CouleurDePapier = CouleurDePapier;
    }

    
}
