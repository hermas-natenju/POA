/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poa;

import interfacep.FigureMathematique;

/**
 *
 * @author W8.1
 */
public class Cercle implements FigureMathematique {
    
    /**
     * Centre du cercle
     */
    protected Point p;

    /**
     * Rayon du ceercle
     */
    protected double r;
    
    /**
     * Constructeur
     * @param r
     * @param p
     */
    public Cercle(Point p, double r){
        this.r = r;
        this.p = p;
    }

    Cercle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return p
     */
    public Point getP(){
        return this.p;
    }
    
    /**
     *
     * @return r
     */
    public double getR(){
        return this.r;
    }


    /**
     *
     * @param p
     */
    public void setP(Point p) {
        this.p = p;
    }
    
    /**
     *
     * @param r
     */
    public void setR(double r) {
        this.r = r;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cercle:\n centre(" + this.p.x + "," + this.p.y + ")\nRayon: " + this.r;
    }

    @Override
    public double aire(double r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double volume(double r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetre(double r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param q
     * @return
     */
    @Override
    public boolean appartient(Point q) {

        return this.p.distance(q) == this.r;
    }

}
