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
public class Poste {
    Date DateSalaire;
    String Metier;
    double Salaire;

    public Poste(Date DateSalaire, String Metier, double Salaire) {
        this.DateSalaire = DateSalaire;
        this.Metier = Metier;
        this.Salaire = Salaire;
    }

    public Date getDateSalaire() {
        return DateSalaire;
    }

    public void setDateSalaire(Date DateSalaire) {
        this.DateSalaire = DateSalaire;
    }

    public String getMetier() {
        return Metier;
    }

    public void setMetier(String Metier) {
        this.Metier = Metier;
    }

    public double getSalaire() {
        return Salaire;
    }

    public void setSalaire(double Salaire) {
        this.Salaire = Salaire;
    }
    
}
