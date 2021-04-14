/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Zotya
 */
public class ProjectGame extends JPanel {
    
    //Fields
    private Player doctor;
    Covid[] covid = new Covid[5];
    public int gameState;
    String Key;
    private Object[] button;
    private boolean setActive = true;
    
    
    //Constructor
    public ProjectGame() {
        //Set up Player
       // gameState = 0;
        doctor = new Player();
  
//set up Mouse Listener
setupMouse();
        
        
        //Set up Covid
        Covid covid1 = new Covid(50, 50, 0.115,0.152);
        Covid covid2 = new Covid(50, 50, 0.192,0.123);
        Covid covid3 = new Covid(50, 50, 0.121,0.178);
        Covid covid4 = new Covid(50, 50, 0.168,0.144);
        Covid covid5 = new Covid(50, 50, 0.137,0.189);
        
        covid[0]=covid1;
        covid[1]=covid2;
        covid[2]=covid3;
        covid[3]=covid4;
        covid[4]=covid5;
        

        
         
        
    }
    
    
//    public void setupMouse()
//    {
//      addMouseListener(new MouseAdapter()
//        public void mousePressed(MouseEvent me){
//        
//        
//        checkKill(me.getX(),me.getY());
//        }
//      
//      
//      )};
//    
//    
//    }
    
//    public void checkClick(int mouseX, int mouseY)
//    {
//       
//        for (int i = 0; i < button.length; i++)
//        {
//                 if (mouseX>=button[i].getPosX() && mouseX<= button[i].getPosX()+30 && mouseY>= button[i].getPosY() && mouseY <= button[i].getPosY()+30){
//                     button[i].setActive(false);
//                 }             
//        }
//    
//    
//    }        
    
    
public void setupMouse()
	{
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				
				if(gameState==1)
				{
					gameState = 2;
					//startTime = new Date(System.currentTimeMillis());
				}
				
				
			}
		});
	}
    
    
    
    //Class Methods
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
         g.setColor(Color.black);
         g.fillRect(0, 0, 800, 500);
        
         
            if(gameState == 0)
              {
                drawStart(g);
              } 
        
            if(gameState == 1)
             {
               drawElements(g);
               update();
             }  

     
        
              repaint();
    }
    
    
    
    
    
    
    
    
    public void update() {
        for (int i = 0; i < covid.length; i++) {
            covid[i].update();
        }
    }
    
    
    
    
    
    
//    public void setUpMouse()
//    {
//   addMouseListener(new MouseAdapter() {
//    public void mousePressed(MouseEvent me)
//             
//               
//               CheckKill(me.getX(),me.getY());
//               checkEnd();
//    });    
//    
//    }
    
    
    
    public void drawStart(Graphics g)
    {
  
        
    
       
       
       g.setColor(Color.black);
       g.fillRect(0, 0, 1000, 1000);
       
       g.setFont(new Font("TimesRoman",Font.PLAIN,10));
       g.setColor(Color.red);
       g.drawString("Press Enter ",300,400);
       setupMouse();
       
       
       if("".equals(Key))
       {
          gameState = 1;
       
       }
    }
    
    
       
    public void drawElements(Graphics g) {
        
               
        String backgroundFilename = "qrgVOf.jpg";
        ImageIcon background = new ImageIcon(backgroundFilename);
        g.drawImage(background.getImage(),0,0,null);
        
        
        
        //Draw Player
        String playerFileName = "Player.png";
        ImageIcon PlayerImg = new ImageIcon(playerFileName);
        g.drawImage(PlayerImg.getImage(),(int)doctor.getposX() ,(int)doctor.getposY(), null); 
        
        //Draw Covid
        String covidImgFilename = "CovidRed.png";
        ImageIcon covidImg = new ImageIcon(covidImgFilename);
        
        for (int i = 0; i < covid.length; i++) {
            g.drawImage(covidImg.getImage(), (int)covid[i].getPosX(), (int)covid[i].getPosY(), null);
        }
    }

  
        
    }
    
    
    
    
    

