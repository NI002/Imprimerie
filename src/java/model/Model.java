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
public class Model {
    String RectoVerso;
    double prix;

    public Model(String RectoVerso, double prix) {
        this.RectoVerso = RectoVerso;
        this.prix = prix;
    }

    public String getRectoVerso() {
        return RectoVerso;
    }

    public void setRectoVerso(String RectoVerso) {
        this.RectoVerso = RectoVerso;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
