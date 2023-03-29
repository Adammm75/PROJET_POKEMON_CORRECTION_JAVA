/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetdex;

/**
 *
 * @author erwan
 */
public class PokemonUnique {
    private Pokemon typePokemon;
    private String nom;
    private int niveau;   
    private int experience;
    private int experienceMax;
    // Constructeur

    public PokemonUnique(Pokemon typePokemon, String nom, int niveau, int experienceMax) {
        this.typePokemon = typePokemon;
        this.nom = nom;
        this.niveau = niveau;
        this.experience = 0;
        this.experienceMax = experienceMax;
    }
    
    public void gainXp(int xp)
    {
        // augmenter l'xp du pokemon. Si il a atteint l'xp max, il gagne un niveau et l'xp max à atteindre augmente de 20 %
    }
    
}
