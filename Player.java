/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author PC
 */
public class Player {

   

    
    //Fields
    private double  posX;
    private double  posY;
    private double speedX;
    private boolean alive;

   //Constructor
   public Player(){ 
     this.posX=300; 
     this.posY=100;
     this.speedX=10;
     this.alive = true;
   
   }
   
   //Getters
   
   public double getposX()
   {
       return posX;
   }
   
   public double getposY()
   {
       return posY;
   }
   
   public double getspeedX()
   {
       return speedX;
   }
   
   public boolean isAlive()
   {
           return alive;
   }
  
   
   //Setters
   
   public void setPosX(double posX)
   {
       this.posX = posX;
   }
   
   public void setPosY(double posY)
   {
       this.posY = posY;
   }
   
   public void setSpeedX(double speedX)
   {
       this.speedX = speedX;
   }
   
   public void setAlive(boolean alive)
   {
       this.alive = alive;
   }
   
   @Override
    public String toString() {
        return "Player{" + "posX=" + posX + ", posY=" + posY + ", speedX=" + speedX + ", alive=" + alive + '}';
    }
    
   
   //Class Methods
 
   
   
   public void update(){   
       
      
      
     
          
   }
}
