/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author Zotya
 */
public class Covid {
    
    //Fields
    private double posX;
    private double posY;
    private double speedX;
    private double speedY;
    private boolean alive;
    
    
    //Constructor
    public Covid(double posX, double posY, double speedX, double speedY) {
        this.posX = posX;
        this.posY = posY;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public Covid(double posX, double posY, double speedX, double speedY, boolean alive) {
        this.posX = posX;
        this.posY = posY;
        this.speedX = speedX;
        this.speedY = speedY;
        this.alive = alive;
    }

    //Getters
    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double getSpeedX() {
        return speedX;
    }

    public double getSpeedY() {
        return speedY;
    }

    public boolean isAlive() {
        return alive;
    }
    
    
    //Setters
    public void setPosX(double posX) {
        this.posX = posX;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }

    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    
    
    //Methods
    public void update(){
        posX=posX+speedX;
        posY=posY+speedY;
        
        if(posX>=860 || posX<=0)
        {
            speedX=-speedX;
        }
        
        if(posY>=860|| posY<=0)
        {
            speedY=-speedY;
        }
    }
    
    
    //ToString Method
    @Override
    public String toString() {
        return "Covid{" + "posX=" + posX + ", posY=" + posY + ", speedX=" + speedX + ", speedY=" + speedY + ", alive=" + alive + '}';
    }
    
    
}

   