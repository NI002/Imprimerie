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
public class CouleurDEcriture {
    int id;
    String couleur;
    Stock stock;

    public CouleurDEcriture(String couleur, Stock stock) {
        this.couleur = couleur;
        this.stock = stock;
    }

    public CouleurDEcriture(int id, String couleur, Stock stock) {
        this.id = id;
        this.couleur = couleur;
        this.stock = stock;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    
}
