/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poa;

/**
 *
 * @author W8.1
 */
public class Point {

    /**
     * coodonnée en abscisse
     */
    protected double x;

    /**
     * Coorddonnée en ordonnée
     */
    protected double y;

    /**
     * nom du point
     */
    protected String nom;
    
    /**
     *
     * @param x abscisse
     * @param y ordonnée
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    /**
     *
     * @param x cordonnée du point en abcisse
     * @param y coordonnée du point en ordonée
     * @param nom appellation du point 
     */
    public Point(double x, double y, String nom){
        this(x, y);
        this.nom = nom;
    }
    
    /**
     *
     * @return
     */
    public double getX(){
        return this.x;
    }
    
    /**
     *
     * @return
     */
    public double getY(){
        return this.y;
    }
    // Setters

    /**
     *
     * @param x
     */
    public void setX(double x){
        this.x = x;
    }
    
    /**
     *
     * @param y
     */
    public void setY(double y){
        this.y = y;
    }
    
    /**
     *
     * @return a point coords
     */
    public String afficheCoord(){
        return "Coordonnées:\nAbscisse: "+this.x+"\nOrdonnée: "+this.y;
    }
    
    /**
     *
     * @param p deuxième point, le premier étant l'actuel
     * @return le milieu de deux points
     */
    public Point milieu(Point p){
        return new Point((this.x + p.x)/2, (this.y + p.y)/2);
    }

    /**
     *
     * @param k
     * @return
     */
    public double distance(Point k) {
        return Math.sqrt(Math.pow(this.x - k.x, 2) + Math.pow(this.y - k.y, 2));
    }


}
