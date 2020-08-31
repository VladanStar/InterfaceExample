/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerinterfejsi;

/**
 *
 * @author Vladan Cupric
 */
public class Kocka implements Figura, Printable, Comparable{
    
    private double a;

    public Kocka(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public String toString(){
        return "Kocka, a=" + this.a;
    }

    
    public double izracunajPovrsinu() {
        return 6 * Math.pow(a, 2);
    }

    
    public double izracunajZapreminu() {
        return Math.pow(a, 3);
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Object o) {
        Kocka druga = (Kocka) o;
        if (this.izracunajZapreminu()<druga.izracunajZapreminu()) return -1;
        if (this.izracunajZapreminu()>druga.izracunajZapreminu()) return 1;
        return 0;
    }
    
}
