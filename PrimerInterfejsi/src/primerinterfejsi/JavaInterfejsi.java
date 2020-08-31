/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerinterfejsi;

import java.util.Arrays;

/**
 *
 * @author Vladan Cupric
 */
public class JavaInterfejsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kocka k1 = new Kocka (5);
        Valjak v1 = new Valjak (2,5);
        Kocka k2 = new Kocka (3);
        Kocka k3 = new Kocka (6);
        
        Figura[] niz = {k1, v1, k2, k3};
        
        for (Figura f : niz){
            System.out.println(f.toString());
            System.out.println ("Zapremina = " + f.izracunajZapreminu());
            System.out.println("Povrsina = " + f.izracunajPovrsinu());
        }
        
        Printable[] p = {k1, v1, k2, k3};
        printNizPrintableObjekata (p);
        
        Kocka[] nizk = {k1, k2, k3};
        Arrays.sort(nizk);
        
        System.out.println ("Poredimo " + k2.toString() + " i " + v1.toString());
        Figura veca = uporedi (k2, v1);
        System.out.println ("Veca figura je " + veca.toString());
    }
    
    public static Figura uporedi (Figura f1, Figura f2) {
        if (f1.izracunajZapreminu()>f2.izracunajZapreminu())
            return f1;
        else
            return f2;
    }
    
    public static void printNizPrintableObjekata (Printable[] niz){
        System.out.println ("Stampanje printable niza");
        for (Printable p : niz){
            p.print();
        }
    }
    
    
}
