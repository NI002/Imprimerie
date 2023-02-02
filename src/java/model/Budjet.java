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
public class Budjet {
    int id;
    Date DateBudjet;
    double loyer;
    Stock stock;
    Papier papier;
    double Benefice;
    double total;

    public Budjet(Date DateBudjet, double loyer, Stock stock, Papier papier, double Benefice, double total) {
        this.DateBudjet = DateBudjet;
        this.loyer = loyer;
        this.stock = stock;
        this.papier = papier;
        this.Benefice = Benefice;
        this.total = total;
    }

    public Budjet(int id, Date DateBudjet, double loyer, Stock stock, Papier papier, double Benefice, double total) {
        this.id = id;
        this.DateBudjet = DateBudjet;
        this.loyer = loyer;
        this.stock = stock;
        this.papier = papier;
        this.Benefice = Benefice;
        this.total = total;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getDateBudjet() {
        return DateBudjet;
    }

    public void setDateBudjet(Date DateBudjet) {
        this.DateBudjet = DateBudjet;
    }

    public double getLoyer() {
        return loyer;
    }

    public void setLoyer(double loyer) {
        this.loyer = loyer;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Papier getPapier() {
        return papier;
    }

    public void setPapier(Papier papier) {
        this.papier = papier;
    }

    public double getBenefice() {
        return Benefice;
    }

    public void setBenefice(double Benefice) {
        this.Benefice = Benefice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
