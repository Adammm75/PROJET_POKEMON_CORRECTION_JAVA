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

        // Création des objets Pokémon pour les 100 premiers du Pokédex
        Pokemon bulbizarre = new Pokemon("Bulbizarre", 1, plante, poison);
        Pokemon herbizarre = new Pokemon("Herbizarre", 2, plante, poison);
        Pokemon florizarre = new Pokemon("Florizarre", 3, plante, poison);
        bulbizarre.setPokemonSupérieur(herbizarre);
        herbizarre.setPokemonInferieur(bulbizarre);
        herbizarre.setPokemonSupérieur(florizarre);
        florizarre.setPokemonInferieur(herbizarre);
        
        Pokemon salameche = new Pokemon("Salamèche", 4, feu);
        Pokemon reptincel = new Pokemon("Reptincel", 5, feu);
        Pokemon dracaufeu = new Pokemon("Dracaufeu", 6, feu, vol);
        salameche.setPokemonSupérieur(reptincel);
        reptincel.setPokemonInferieur(salameche);
        reptincel.setPokemonSupérieur(dracaufeu);
        dracaufeu.setPokemonInferieur(reptincel);
        
        Pokemon carapuce = new Pokemon("Carapuce", 7, eau);
        Pokemon carabaffe = new Pokemon("Carabaffe", 8, eau);
        Pokemon tortank = new Pokemon("Tortank", 9, eau);
        carapuce.setPokemonSupérieur(carabaffe);
        carabaffe.setPokemonInferieur(carapuce);
        carabaffe.setPokemonSupérieur(tortank);
        tortank.setPokemonInferieur(carabaffe);
        
        Pokemon chenipan = new Pokemon("Chenipan", 10, insecte);
        Pokemon chrysacier = new Pokemon("Chrysacier", 11, insecte);
        Pokemon papilusion = new Pokemon("Papilusion", 12, insecte, vol);
        chenipan.setPokemonSupérieur(chrysacier);
        chrysacier.setPokemonInferieur(chenipan);
        chrysacier.setPokemonSupérieur(papilusion);
        papilusion.setPokemonInferieur(chrysacier);
        
        Pokemon aspicot = new Pokemon("Aspicot", 13, insecte, poison);
        Pokemon coconfort = new Pokemon("Coconfort", 14, insecte, poison);
        Pokemon dardargnan = new Pokemon("Dardargnan", 15, insecte, poison);
        aspicot.setPokemonSupérieur(coconfort);
        coconfort.setPokemonInferieur(aspicot);
        coconfort.setPokemonSupérieur(dardargnan);
        dardargnan.setPokemonInferieur(coconfort);
        
        Pokemon roucool = new Pokemon("Roucool", 16, normal, vol);
        Pokemon roucoups = new Pokemon("Roucoups", 17, normal, vol);
        Pokemon roucarnage = new Pokemon("Roucarnage", 18, normal, vol);
        roucool.setPokemonSupérieur(roucoups);
        roucoups.setPokemonInferieur(roucool);
        roucoups.setPokemonSupérieur(roucarnage);
        roucarnage.setPokemonInferieur(roucoups);
        
        Pokemon rattata = new Pokemon("Rattata", 19, normal);
        Pokemon rattatac = new Pokemon("Rattatac", 20, normal);
        rattata.setPokemonSupérieur(rattatac);
        rattatac.setPokemonInferieur(rattata);
        
        Pokemon piafabec = new Pokemon("Piafabec", 21, normal, vol);
        Pokemon rapasdepic = new Pokemon("Rapasdepic", 22, normal, vol);
        piafabec.setPokemonSupérieur(rapasdepic);
        rapasdepic.setPokemonInferieur(piafabec);
        
        Pokemon abo = new Pokemon("Abo", 23, poison);
        Pokemon arbok = new Pokemon("Arbok", 24, poison);
        abo.setPokemonSupérieur(arbok);
        arbok.setPokemonInferieur(abo);
        
        Pokemon pikachu = new Pokemon("Pikachu", 25, électrique);
        Pokemon raichu = new Pokemon("Raichu", 26, électrique);
        pikachu.setPokemonSupérieur(raichu);
        raichu.setPokemonInferieur(pikachu);
        
        Pokemon sabelette = new Pokemon("Sabelette", 27, sol);
        Pokemon sablaireau = new Pokemon("Sablaireau", 28, sol);
        sabelette.setPokemonSupérieur(sablaireau);
        sablaireau.setPokemonInferieur(sabelette);
        
        Pokemon nidoranF = new Pokemon("Nidoran♀", 29, poison);
        Pokemon nidorina = new Pokemon("Nidorina", 30, poison);
        Pokemon nidoqueen = new Pokemon("Nidoqueen", 31, poison, sol);
        nidoranF.setPokemonSupérieur(nidorina);
        nidorina.setPokemonInferieur(nidoranF);
        nidorina.setPokemonSupérieur(nidoqueen);
        nidoqueen.setPokemonInferieur(nidorina);
        
        Pokemon nidoranM = new Pokemon("Nidoran♂", 32, poison);
        Pokemon nidorino = new Pokemon("Nidorino", 33, poison);
        Pokemon nidoking = new Pokemon("Nidoking", 34, poison, sol);
        nidoranM.setPokemonSupérieur(nidorino);
        nidorino.setPokemonInferieur(nidoranM);
        nidorino.setPokemonSupérieur(nidoking);
        nidoking.setPokemonInferieur(nidorino);
        
        Pokemon melodelfe = new Pokemon("Mélodelfe", 35, normal, fee);
        
        Pokemon goupix = new Pokemon("Goupix", 37, feu);
        Pokemon feunard = new Pokemon("Feunard", 38, feu);
        goupix.setPokemonSupérieur(feunard);
        feunard.setPokemonInferieur(goupix);

        


    }
}
