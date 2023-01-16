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
public class CouleurDupapier {
    String CouleurDuPapier;
    Stock stock;

    public CouleurDupapier(String CouleurDuPapier, Stock stock) {
        this.CouleurDuPapier = CouleurDuPapier;
        this.stock = stock;
    }

    public String getCouleurDuPapier() {
        return CouleurDuPapier;
    }

    public void setCouleurDuPapier(String CouleurDuPapier) {
        this.CouleurDuPapier = CouleurDuPapier;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    
}
