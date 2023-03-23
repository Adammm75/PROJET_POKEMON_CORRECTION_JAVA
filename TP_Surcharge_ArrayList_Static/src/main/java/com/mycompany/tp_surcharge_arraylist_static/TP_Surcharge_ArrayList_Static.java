/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_surcharge_arraylist_static;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class TP_Surcharge_ArrayList_Static {

    public static void main(String[] args) {
        Personnage personnage1 = new Personnage("KevinDu93", 10, 100, "Feu");
        Personnage personnage2 = new Personnage("Xx-DarkSasuke-xX", 20, 200, "DestinSombre");
        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(personnage1);
        personnages.add(personnage2);

        Objet objet1 = new Objet("Epée Diatre", 10, "Force");
        Objet objet2 = new Objet("Bouclier Yé", 20);

        personnage1.ajouterObjet(objet1);
        personnage1.ajouterObjet(objet2);
        personnage2.ajouterObjet(objet2);
        personnage2.ajouterObjet(objet1);
        
        System.out.println("Nombre total d'objets : " + Personnage.nombreTotalObjets(personnages));
        personnage1.afficherAttributs();
        personnage1.retirerObjet(objet1);
        personnage1.afficherAttributs();
        personnage2.afficherAttributs();
        System.out.println("Nombre total d'objets après retrait : " + Personnage.nombreTotalObjets(personnages));
        
        personnage1.afficherInventaire();
        personnage2.afficherInventaire();
    }
    
}
