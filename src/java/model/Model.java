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
    int id;
    String RectoVerso;
    double prix;

    public Model(String RectoVerso, double prix) {
        this.RectoVerso = RectoVerso;
        this.prix = prix;
    }

    public Model(int id, String RectoVerso, double prix) {
        this.id = id;
        this.RectoVerso = RectoVerso;
        this.prix = prix;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
