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
public class Achat {
    Date DateAchat;
    Client client;
    Papier papier;
    Model model;
    double prix;

    public Achat(Date DateAchat, Client client, Papier papier, Model model) {
        this.DateAchat = DateAchat;
        this.client = client;
        this.papier = papier;
        this.model = model;
    }

    public Date getDateAchat() {
        return DateAchat;
    }

    public void setDateAchat(Date DateAchat) {
        this.DateAchat = DateAchat;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Papier getPapier() {
        return papier;
    }

    public void setPapier(Papier papier) {
        this.papier = papier;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
   
}
