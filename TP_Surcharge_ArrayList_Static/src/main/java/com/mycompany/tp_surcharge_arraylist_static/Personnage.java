/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_surcharge_arraylist_static;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class Personnage {
    String nom;
    int niveau;
    int pointDeVie;
    String pouvoir;
    ArrayList<Objet> inventaire;

    public Personnage(String nom, int niveau, int pointDeVie, String pouvoir) {
        this.nom = nom;
        this.niveau = niveau;
        this.pointDeVie = pointDeVie;
        this.pouvoir = pouvoir;
        this.inventaire = new ArrayList<Objet>();
    }

    public void ajouterObjet(Objet objet) {
        this.inventaire.add(objet);
        this.pointDeVie += objet.bonusPointDeVie;
        if (objet.getPouvoir() != "")
            this.pouvoir += " " + objet.getPouvoir();
    }

    public void ajouterObjet(String nom, int bonusPointDeVie) {
        Objet objet = new Objet(nom, bonusPointDeVie);
        this.inventaire.add(objet);
        this.pointDeVie += objet.bonusPointDeVie;
    }
    
    public void ajouterObjet(String nom, String pouvoir) {
        Objet objet = new Objet(nom, pouvoir);
        this.inventaire.add(objet);
        if (objet.getPouvoir() != "")
            this.pouvoir += " " + objet.getPouvoir();
    }

    public void retirerObjet(Objet objet) {
        this.inventaire.remove(objet);
        this.pointDeVie -= objet.bonusPointDeVie;
        if (objet.getPouvoir() != "")
            this.pouvoir = enleverPouvoir(objet.getPouvoir());
    }

    public static int nombreTotalObjets(ArrayList<Personnage> personnages) {
        int total = 0;
        for (Personnage personnage : personnages) {
            total += personnage.inventaire.size();
        }
        return total;
    }
    
    public String enleverPouvoir(String pouvoirRetire) {
        String[] words = this.pouvoir.split(" ");
        String result = "";

        for (String word : words) {
            if (!word.equals(pouvoirRetire)) {
                result += word + " ";
            }
        }
        return result.trim();
    }
    public void afficherInventaire() {
        System.out.println("Inventaire de " + nom + " :");
        if (inventaire.isEmpty()) {
            System.out.println("  L'inventaire est vide.");
        } else {
            for (Objet objet : inventaire) {
                System.out.println("  - " + objet.nom + " (Bonus de Points de Vie: " + objet.bonusPointDeVie + ", Pouvoir: " + (objet.pouvoir.isEmpty() ? "Aucun" : objet.pouvoir) + ")");
            }
        }
    }
    public void afficherAttributs() {
        System.out.println("----------------------------------------");
        System.out.println("Nom       : " + nom);
        System.out.println("Niveau    : " + niveau);
        System.out.println("Points de Vie : " + pointDeVie);
        System.out.println("Pouvoir   : " + pouvoir);
        System.out.println("----------------------------------------");
    }

}
