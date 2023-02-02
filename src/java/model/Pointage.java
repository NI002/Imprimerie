/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.time.LocalDateTime;

/**
 *
 * @author itu
 */
public class Pointage {
    int id;
    Employer employer;
    LocalDateTime DateEntree;
    LocalDateTime DateSortie;

    public Pointage(Employer employer, LocalDateTime DateEntree, LocalDateTime DateSortie) {
        this.employer = employer;
        this.DateEntree = DateEntree;
        this.DateSortie = DateSortie;
    }

    public Pointage(int id, Employer employer, LocalDateTime DateEntree, LocalDateTime DateSortie) {
        this.id = id;
        this.employer = employer;
        this.DateEntree = DateEntree;
        this.DateSortie = DateSortie;
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

    public LocalDateTime getDateEntree() {
        return DateEntree;
    }

    public void setDateEntree(LocalDateTime DateEntree) {
        this.DateEntree = DateEntree;
    }

    public LocalDateTime getDateSortie() {
        return DateSortie;
    }

    public void setDateSortie(LocalDateTime DateSortie) {
        this.DateSortie = DateSortie;
    }
    
    
}
