/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_surcharge_arraylist_static;

/**
 *
 * @author erwan
 */
public class Objet {
    String nom;
    int bonusPointDeVie;
    String pouvoir;

    public Objet(String nom, int bonusPointDeVie, String pouvoir) {
        this.nom = nom;
        this.bonusPointDeVie = bonusPointDeVie;
        this.pouvoir = pouvoir;
    }

    public Objet(String nom, int bonusPointDeVie) {
        this.nom = nom;
        this.bonusPointDeVie = bonusPointDeVie;
        this.pouvoir = "";
    }

    public Objet(String nom, String pouvoir) {
        this.nom = nom;
        this.bonusPointDeVie = 0;
        this.pouvoir = pouvoir;
    }

    public String getNom() {
        return nom;
    }

    public int getBonusPointDeVie() {
        return bonusPointDeVie;
    }

    public String getPouvoir() {
        return pouvoir;
    }
    
    
}
