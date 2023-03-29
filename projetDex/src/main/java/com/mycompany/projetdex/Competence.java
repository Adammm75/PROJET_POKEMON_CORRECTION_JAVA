/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetdex;

/**
 *
 * @author erwan
 */
public class Competence {
    private String nom;
    private int niveau;
    private String typeDegat; // Physique ou Distant

    public Competence(String nom, int niveau, String typeDegat) {
        if (!(typeDegat != "Physique" & typeDegat != "Distant"))
        {
            this.nom = nom;
            this.niveau = niveau;
            this.typeDegat = typeDegat;
        }   
    }

    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public String getTypeDegat() {
        return typeDegat;
    }
    
    
    
}
