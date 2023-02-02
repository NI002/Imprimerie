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
    String couleur;
    Stock stock;

    public CouleurDEcriture(String couleur, Stock stock) {
        this.couleur = couleur;
        this.stock = stock;
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
