/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicepointcorrection;

/**
 *
 * @author erwan
 */
public class ExercicePointCorrection {

    public static void main(String[] args) {
        Point p1 = new Point(Point.alea(-5, 6), Point.alea(-11, 16));
        Point p2 = new Point(Point.alea(-5, 6), Point.alea(-11, 16));
        
        p1.affiche(p2);
        
        p1.affiche();
        p2.affiche();
    }
}
