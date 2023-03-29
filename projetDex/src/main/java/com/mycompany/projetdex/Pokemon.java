/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetdex;

/**
 *
 * @author erwan
 */
public class Pokemon {
    private String nom;
    private int numeroPokedex;
    private Element element1;
    private Element element2;
    private Pokemon pokemonSupérieur;
    private Pokemon pokemonInferieur;
    
    // Constructeurs à faire (Plusieurs car un pokemon peut avoir un ou plusieurs type.
    // Un pokemon peut avoir une évolution supérieur et/ou une inférieur.
    public Pokemon(String nom, int numeroPokedex, Element element1, Element element2)
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;
        this.element2 = element2;   
    }
    
    public Pokemon(String nom, int numeroPokedex, Element element1)
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;    
    }

    public Pokemon getPokemonSupérieur() {
        return pokemonSupérieur;
    }

    public void setPokemonSupérieur(Pokemon pokemonSupérieur) {
        this.pokemonSupérieur = pokemonSupérieur;
    }

    public Pokemon getPokemonInferieur() {
        return pokemonInferieur;
    }

    public void setPokemonInferieur(Pokemon pokemonInferieur) {
        this.pokemonInferieur = pokemonInferieur;
    }
    
    public Pokemon getEvolutionSup() {
        return null; // Retourne l'évolution supérieur
    }
    public Pokemon getEvolutionInf()
    {
        return null; // Retourne l'évolution inférieur
    }
    public Element getElement1()
    {
        return null; // Retourne l'évolution supérieur
    }
    public Element getElement2()
    {
        return null; // Retourne l'évolution inférieur
    }
}
