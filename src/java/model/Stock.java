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
    int id;
    Materiel materiel;
    double Quantite;
    double Prix;

    public Stock(Materiel materiel, double Quantite) {
        this.materiel = materiel;
        this.Quantite = Quantite;
    }

    public Stock(int id, Materiel materiel, double Quantite, double Prix) {
        this.id = id;
        this.materiel = materiel;
        this.Quantite = Quantite;
        this.Prix = Prix;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
