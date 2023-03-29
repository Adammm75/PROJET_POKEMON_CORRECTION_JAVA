/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetdex;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class ProjetDex {
 
    public static void main(String[] args) {
        // Création des objets Element
        Element normal = new Element("Normal");
        Element combat = new Element("Combat");
        Element vol = new Element("Vol");
        Element poison = new Element("Poison");
        Element sol = new Element("Sol");
        Element roche = new Element("Roche");
        Element insecte = new Element("Insecte");
        Element fantome = new Element("Spectre");
        Element acier = new Element("Acier");
        Element feu = new Element("Feu");
        Element eau = new Element("Eau");
        Element plante = new Element("Plante");
        Element électrique = new Element("Électrique");
        Element psy = new Element("Psy");
        Element glace = new Element("Glace");
        Element dragon = new Element("Dragon");
        Element tenebres = new Element("Ténèbres");
        Element fee = new Element("Fée");

        // Ajout des faiblesses et résistances pour chaque élément

        // Normal
        normal.addResistance(fantome);

        // Combat
        combat.addFaiblesse(fee);
        combat.addFaiblesse(vol);
        combat.addResistance(insecte);
        combat.addResistance(roche);
        combat.addResistance(tenebres);

        // Vol
        vol.addFaiblesse(électrique);
        vol.addFaiblesse(glace);
        vol.addFaiblesse(roche);
        vol.addResistance(insecte);
        vol.addResistance(plante);
        vol.addResistance(sol);

        // Poison
        poison.addFaiblesse(sol);
        poison.addFaiblesse(sol);
        poison.addResistance(plante);
        poison.addResistance(combat);
        poison.addResistance(poison);
        poison.addResistance(insecte);
        poison.addResistance(fee);

        // Sol
        sol.addFaiblesse(eau);
        sol.addFaiblesse(plante);
        sol.addFaiblesse(glace);
        sol.addResistance(poison);
        sol.addResistance(roche);
        sol.addResistance(électrique);

        // Roche
        roche.addFaiblesse(eau);
        roche.addFaiblesse(plante);
        roche.addFaiblesse(sol);
        roche.addFaiblesse(combat);
        roche.addFaiblesse(acier);
        roche.addResistance(normal);
        roche.addResistance(feu);
        roche.addResistance(poison);
        roche.addResistance(vol);

        // Insecte
        insecte.addFaiblesse(feu);
        insecte.addFaiblesse(vol);
        insecte.addFaiblesse(roche);
        insecte.addResistance(combat);
        insecte.addResistance(plante);
        insecte.addResistance(sol);

        // Spectre
        fantome.addFaiblesse(fantome);
        fantome.addFaiblesse(tenebres);
        fantome.addResistance(normal);
        fantome.addResistance(combat);

        // Acier
        acier.addFaiblesse(feu);
        acier.addFaiblesse(sol);
        acier.addFaiblesse(combat);
        acier.addResistance(normal);
        acier.addResistance(plante);
        acier.addResistance(glace);
        acier.addResistance(psy);
        acier.addResistance(vol);
        acier.addResistance(insecte);
        acier.addResistance(fee);
        acier.addResistance(électrique);
        acier.addResistance(poison);

        // Feu
        feu.addFaiblesse(eau);
        feu.addFaiblesse(sol);
        feu.addFaiblesse(roche);
        feu.addResistance(plante);
        feu.addResistance(insecte);

        // Eau
        eau.addFaiblesse(électrique);
        eau.addFaiblesse(plante);
        eau.addResistance(eau);
        eau.addResistance(feu);
        
        // Plante
        plante.addFaiblesse(feu);
        plante.addFaiblesse(vol);
        plante.addResistance(plante);
        plante.addResistance(sol);
        plante.addResistance(roche);

        // Électrique
        électrique.addFaiblesse(sol);
        électrique.addResistance(électrique);
        électrique.addResistance(acier);
        électrique.addResistance(vol);

        // Psy
        psy.addFaiblesse(insecte);
        psy.addFaiblesse(tenebres);
        psy.addFaiblesse(fantome);
        psy.addResistance(combat);
        psy.addResistance(psy);

        // Glace
        glace.addFaiblesse(feu);
        glace.addFaiblesse(eau);
        glace.addFaiblesse(combat);
        glace.addFaiblesse(roche);
        glace.addResistance(glace);
        glace.addResistance(sol);
        glace.addResistance(vol);

        // Dragon
        dragon.addFaiblesse(glace);
        dragon.addFaiblesse(fee);
        dragon.addResistance(feu);
        dragon.addResistance(eau);
        dragon.addResistance(électrique);
        dragon.addResistance(plante);

        // Ténèbres
        tenebres.addFaiblesse(combat);
        tenebres.addFaiblesse(fee);
        tenebres.addFaiblesse(insecte);
        tenebres.addResistance(tenebres);
        tenebres.addResistance(fantome);

        // Fée
        fee.addFaiblesse(acier);
        fee.addFaiblesse(poison);
        fee.addResistance(combat);
        fee.addResistance(insecte);
        fee.addResistance(tenebres);
        fee.addResistance(dragon);

        fee.affFaiblesse();
        fee.affResistance();
        feu.affFaiblesse();
        feu.affResistance();


    }
}
