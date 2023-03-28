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
    public Pokemon(String nom, int numeroPokedex, Element element1, Element element2, Pokemon pokemonSupérieur)
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;
        this.element2 = element2;
        this.pokemonSupérieur = pokemonSupérieur;
    } // Cas Bulbizarre
    
    public Pokemon(String nom, int numeroPokedex, Element element1, Element element2, Pokemon pokemonSupérieur, Pokemon pokemonInferieur)
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;
        this.element2 = element2;
        this.pokemonSupérieur = pokemonSupérieur;
        this.pokemonInferieur = pokemonInferieur;
    } // Cas Herbizarre
   
    public Pokemon(String nom, int numeroPokedex, Element element1, Pokemon pokemonInferieur, Element element2)
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;
        this.element2 = element2;
        this.pokemonInferieur = pokemonInferieur;
    } // Cas Florizarre
    public Pokemon(String nom, int numeroPokedex, Element element1, Pokemon pokemonSupérieur, Pokemon pokemonInferieur)
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;
        this.pokemonSupérieur = pokemonSupérieur;
        this.pokemonInferieur = pokemonInferieur;
    } // Cas Reptincelle
    
    public Pokemon(String nom, int numeroPokedex, Element element1, Pokemon pokemonSupérieur)
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;
        this.pokemonSupérieur = pokemonSupérieur;
    } // Cas Salameche
    
    public Pokemon(String nom, int numeroPokedex, Pokemon pokemonInferieur, Element element1 )
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;
        this.pokemonInferieur = pokemonInferieur;
    } // Cas Dracaufeu
    
    public Pokemon(String nom, int numeroPokedex, Element element1, Element element2 )
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;
        this.element2 = element2;
    } // Cas Locklass
    
    public Pokemon(String nom, int numeroPokedex, Element element1)
    {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.element1 = element1;
    } // Cas Insolourdo
    
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
