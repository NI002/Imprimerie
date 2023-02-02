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
public class Affiliation {
    int id;
    Employer employer;
    Poste poste;

    public Affiliation(Employer employer, Poste poste) {
        this.employer = employer;
        this.poste = poste;
    }
 
    public Affiliation(int id, Employer employer, Poste poste) {
        this.id = id;
        this.employer = employer;
        this.poste = poste;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }
    
}
