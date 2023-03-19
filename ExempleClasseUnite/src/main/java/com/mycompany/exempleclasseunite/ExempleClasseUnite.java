/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exempleclasseunite;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class ExempleClasseUnite {

    public static void main(String[] args) {
        Eleve e1 = new Eleve(12,"E1");
        Eleve e2 = new Eleve(15,"E2");
        Eleve e3 = new Eleve(21,"E3");
        Eleve e4 = new Eleve(14,"E4");
        Eleve e5 = new Eleve(17,"E5");
        Eleve e6 = new Eleve(18,"E6");
        ArrayList<Eleve> unite1 = new ArrayList<Eleve>();
        unite1.add(e1);
        unite1.add(e2);
        ArrayList<Eleve> unite2 = new ArrayList<Eleve>();
        unite2.add(e3);
        unite2.add(e4);
        unite2.add(e5);
        unite2.add(e6);
        Unite u1 = new Unite("SLAM", unite1);
        Unite u2 = new Unite("SISR", unite2);
    }
}
