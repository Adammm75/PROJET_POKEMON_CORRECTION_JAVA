/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetdex;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class Element {
    private String nom;
    private ArrayList<Element> faiblesse;
    private ArrayList<Element> resistance;

    public Element(String nom) {
        this.nom = nom;
        this.faiblesse = new ArrayList<Element>();
        this.resistance = new ArrayList<Element>();
    }
    
    public String getNom()
    {
        return nom;
    }
    public void addFaiblesse(Element e)
    {
        this.faiblesse.add(e);
    }
    public void addResistance(Element e)
    {
        this.resistance.add(e);
    }
    public ArrayList<Element> getFaiblesse() {
        return faiblesse;
    }

    
    public ArrayList<Element> getResistance() {
        return resistance;
    }

    public void affFaiblesse() {
        for (Element e:this.getFaiblesse())
            System.out.println(e.getNom());
        }
    public void affResistance()
    {
        for (Element e:this.getResistance())
        {
            System.out.println(e.getNom());
        }
    }
}
