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
public class Stock {
    Materiel materiel;
    double Quantite;
    double Prix;

    public Stock(Materiel materiel, double Quantite) {
        this.materiel = materiel;
        this.Quantite = Quantite;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public double getQuantite() {
        return Quantite;
    }

    public void setQuantite(double Quantite) {
        this.Quantite = Quantite;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double Prix) {
        this.Prix = Prix;
    }
    public void PrixParNombreDeMateriel(){
       this.setPrix(this.getMateriel().getPrixUnitaire()*this.getQuantite());
    }
}
