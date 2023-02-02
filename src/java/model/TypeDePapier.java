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
public class TypeDePapier {
    int id;
    String TypeDePapier;
    Stock stock;

    public TypeDePapier(String TypeDePapier, Stock stock) {
        this.TypeDePapier = TypeDePapier;
        this.stock = stock;
    }

    public TypeDePapier(int id, String TypeDePapier, Stock stock) {
        this.id = id;
        this.TypeDePapier = TypeDePapier;
        this.stock = stock;
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

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    
}
