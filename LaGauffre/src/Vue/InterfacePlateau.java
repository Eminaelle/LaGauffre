/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import javafx.scene.shape.Rectangle;
import javafx.scene.Parent;
import javafx.scene.paint.Color;

/**
 *
 * @author Adeline
 */
public class InterfacePlateau extends Parent{
    public InterfacePlateau(/*Plateau P,*/ int height, int width){
        int nbL=15;
        int nbC=15;
        int largeurCarre = height/nbC;
        int hauteurCarre = width/nbL;
        int posX=80; // largeur
        int posY=80; // hauteur
        
        
        
        CarreGaufre t[][] = new CarreGaufre[nbC][nbL];
        



        for(int i=0; i<nbC; i++){
            for(int j=0;j<nbL;j++){
                t[i][j] = new CarreGaufre(posY+i*hauteurCarre,
                                posX+j*largeurCarre, 
                                largeurCarre,
                                hauteurCarre, true);
                System.out.println("posX : " + (posX+j*largeurCarre));
                System.out.println("posY : " + (posY+i*hauteurCarre));
                this.getChildren().add(t[i][j]);
            }
        }
        
        
        
        
        
        
        
    }
    
    
    
    public class CarreGaufre extends Parent{
        private int posX;
        private int posY;
        private int height;
        private int width;
        private boolean etat;
        Rectangle fond;

        public CarreGaufre(int posX, int posY, int height, int width, boolean etat) {
            this.posX = posX;
            this.posY = posY;
            this.height = height;
            this.width = width;
            this.etat = etat;
            
            if(etat){
                fond=new Rectangle();
                fond.setWidth(width);
                fond.setHeight(height);
                fond.setX(posX);
                fond.setY(posY);
                fond.setFill(Color.web("#F8C96D"));
                fond.setArcHeight(15);
                fond.setArcWidth(15);
                fond.setStrokeWidth(6);
                fond.setStroke(Color.web("#D8882B"));
                this.getChildren().add(fond);
            }
        }
        
        
        
        
        
        
    }
    
}
