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
public class Valjak implements Figura, Printable {
    private double r, h;

    public Valjak(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    public String toString() {
        return "Valjak, r=" + this.r + " h=" + this.h;
    }

    @Override
    public double izracunajPovrsinu() {
        return 2 * Math.pow(r, 2) * Math.PI + 2 * r * Math.PI * h;
    }

    @Override
    public double izracunajZapreminu() {
        return Math.pow(r,2) * Math.PI * h;
    }

    @Override
    public void print() {
        System.out.println (this.toString());
    }
    
}
