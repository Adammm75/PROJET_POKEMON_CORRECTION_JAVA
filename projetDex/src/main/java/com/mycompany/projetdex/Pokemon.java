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
    String nom;
    int numeroPokedex;
    Element element1;
    Element element2;
    Pokemon pokemonSupérieur;
    Pokemon pokemonInferieur;
    
    // Constructeurs à faire (Plusieurs car un pokemon peut avoir un ou plusieurs type.
    // Un pokemon peut avoir une évolution supérieur et/ou une inférieur.
    
    public Pokemon getEvolutionSup()
    {
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
