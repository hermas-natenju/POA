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
public class POA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double x;
        double y;
        
        Point p = new Point(2.5, 3);
        // Point q = new Point(3.5, 4);
        Disque d = new Disque(p, 2, "red");

        Cercle c = new Cercle(p, 4.5);
        // System.out.println(d.toString());
        // un tableau de Cercle
        // Cercle tab[];
        // tab = new Cercle[4];

        //Les cecles
        /*Cercle c1 = new Cercle(new Point(3, 5), 7);
        Cercle c2 = new Cercle(new Point(6, 4), 4);*/

        // les disques
        /*Disque d1 = new Disque(new Point(4, 8), 5, "#00FF00");
        Disque d2 = new Disque(new Point(2, 2), 3, "#FF0000");*/
        // fonction qui renvoi un tableau de Cercle et de disques        // fonction qui renvoi un tableau de Cercle et de disques

    }

    
}
