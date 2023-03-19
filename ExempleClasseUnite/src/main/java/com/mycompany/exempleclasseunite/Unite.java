/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exempleclasseunite;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class Unite {
    private String nom;
    private ArrayList<Eleve> listeEleve;

    public Unite(String nom, ArrayList<Eleve> listeEleve) {
        this.nom = nom;
        this.listeEleve = listeEleve;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Eleve> getListeEleve() {
        return listeEleve;
    }
    
}
