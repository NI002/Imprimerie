/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author itu
 */
public class Materiel {
    String nom;
    double PrixUnitaire;

    public Materiel(String nom, double PrixUnitaire) {
        this.nom = nom;
        this.PrixUnitaire = PrixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixUnitaire() {
        return PrixUnitaire;
    }

    public void setPrixUnitaire(double PrixUnitaire) {
        this.PrixUnitaire = PrixUnitaire;
    }
    
}
