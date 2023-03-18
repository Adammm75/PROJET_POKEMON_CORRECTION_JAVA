/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicepointcorrection;

/**
 *
 * @author erwan
 */
public class Point {
    private double x, y; 
    // attributs de la classe
    
    public Point(double abscisse, double ordonnee)
    {
        this.x = abscisse;
        this.y = ordonnee;
    } 
    // constructeur
    
    public static double alea(double inf, double sup) 
    {
        double result = inf + (sup - inf) * Math.random();
        return result;
    } 
    // rend un nombre entre inf et sup. 
    
    public void affiche()
    {
        System.out.println("(" + this.x + ", " + this.y + ")");
    } 
    // affiche le point
    
    public void affiche(Point p)
    {
        double distance = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
        System.out.println("Distance entre (" + this.x + " ; " + this.y + ") et (" + p.x + " ; " + p.y + ") : " + distance);
    }  
    // affiche la distance entre le point « ciblé » et le point en paramètre.    
}
