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
    private double speedY;
    private boolean alive;

   //Constructor

    public Player(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    
    
   public Player(){ 
     this.posX=375;
     this.posY=100;
     this.speedX=35;
     this.speedY=35;
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

   public double getspeedY() 
   {
       return speedY;
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

   public void setspeedY(double speedY)
   {
       this.speedY = speedY;
   }
   
   public void setAlive(boolean alive)
   {
       this.alive = alive;
   }

    @Override
    public String toString() {
        return "Player{" + "posX=" + posX + ", posY=" + posY + ", speedX=" + speedX + ", speedY=" + speedY + ", alive=" + alive + '}';
    }
   
  
   
    
   
   //Class Methods
 
   
   
   public void update(){   
       
      
      
     
          
   }

    
}
