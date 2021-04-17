/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author Mars Martian
 */
public class Button {
    
    //fields
    private double posX;
    private double posY;
 
    
    
    public Button(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
      
    }

   
    
    
    //Getter
    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

   

     
    
    
    //Setter
    public void setPosX(double posX) {
        this.posX = posX;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }



    @Override
    public String toString() {
        return "Button{" + "posX=" + posX + ", posY=" + posY + '}';
    } 
    
    
    

   
    }
    
    
    
    
    
    

