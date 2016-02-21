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
public class Disque extends Cercle implements FigureMathematique {
    
    protected String couleur;
    
    /**
     * constructor
     * @param p centre du disque
     * @param r rayon du disque
     * @param color couleur de remplissage du disque
     */
    public Disque(Point p, double r, String color){
        super(p, r);
        this.couleur = color;
    }

    /**
     *
     * @return 
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     *
     * @param couleur
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     *
     * @return message
     */
    @Override
    public String toString() {
        return "Disque:\n-Rayon:"+this.r+"\n-Centre("+this.p.getX()+","+this.p.getY()+")\nCouleur:"+this.couleur;
    }
    
    public double surface(){
        return Math.pow(this.r, 2) * Math.PI;
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

    @Override
    public boolean appartient(Point p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
