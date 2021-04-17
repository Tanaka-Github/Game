/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Zotya
 */
public class ProjectGame extends JPanel {
    
    //Fields
    private Player doctor;
    Covid[] covid = new Covid[5];
    private int gameState;
    private Date startTime;
    private double gameTimeSeconds;
    String Key;
    private double resultTime;
  
    private boolean setActive = true;
    Button[] button = new Button[2];
           
    private JLabel hover;
    
    
    
    //Constructor
    public ProjectGame() {
        gameState = 0;
        
        setUpMouse();
        
        //Set up Player
        doctor = new Player();
            
        //Set up Covid
        Covid covid1 = new Covid(50, 50, 0.015,0.052);
        Covid covid2 = new Covid(50, 50, 0.092,0.023);
        Covid covid3 = new Covid(50, 50, 0.021,0.078);
        Covid covid4 = new Covid(50, 50, 0.068,0.044);
        Covid covid5 = new Covid(50, 50, 0.037,0.089);
        
        covid[0]=covid1;
        covid[1]=covid2;
        covid[2]=covid3;
        covid[3]=covid4;
        covid[4]=covid5;
        
        Button button2 = new Button(900,900);
        button[1] = button2;
        
        
//      Score score1 = new Score(name,0,Country);
//      Score score2 = new Score(" Jimmy ", 9 ," USA ");
//      Score score3 = new Score("Xen ",10,"China");
//      Score score4 = new Score("Edmund", 7,"UK"); 
//        
        for (int i = 0; i < button.length; i++)  // The  button amount of the array is the limit
        {
            
             
           button[i] = new Button(450, 300 +(100 * i));// X-pos|Y-pos + distance to the next button
           
            }                             
        
    }
   
     
    
    //Class Methods
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
//        g.setColor(Color.blue);
//        g.fillRect(0, 0, 1000, 750);

           
        String backgroundFilename = "blurred-background-vector.jpg"; //Declares a name for the variable of the image name
        ImageIcon background = new ImageIcon(backgroundFilename); // Sets a variable of imageIcon which then looks for the file to find the image name   
        g.drawImage(background.getImage(),0,0,null); // takes the image and displays it on screen depending on the postion and size
      
        if(gameState==0)
        {
            drawStart(g);
        }
        else if(gameState==1)
        {
            drawElements(g);
            update();
        }
        else if(gameState==3)
        {
            drawEnd(g);
        }
  
        else if(gameState < 0)
        {
           System.exit(0);
        }
        
        repaint();
    }
    
    public void drawStart(Graphics g)
    {
//         g.setColor(Color.DARK_GRAY);
//         g.fillRect(0, 0, 1000, 750);
        
         String MenuFileName = "MenuBackground.jpg";
         ImageIcon MenuImage = new ImageIcon(MenuFileName);
         g.drawImage(MenuImage.getImage(),0,0,null); 
        
        
    
       
       //g.drawRect(340, 350, 350, 75);//draws rectange with the first 2 being: Y and X position , the next two being the height and width 
       
        for (int i = 0; i < button.length; i++) { 
          
            
       String buttonFileName =  "playButton.png";
       ImageIcon buttonImg = new ImageIcon(buttonFileName);
       
       
       
       g.drawImage(buttonImg.getImage(),(int)button[0].getPosX() ,(int)button[0].getPosY(),160, 120, null);
       
       String buttonFileName2 =  "exitButton.png";
       ImageIcon buttonImg2 = new ImageIcon(buttonFileName2);
        
       g.drawImage(buttonImg2.getImage(),(int)button[1].getPosX() ,(int)button[1].getPosY(),160, 120, null);
        
        
        }
//      
//       g.setFont(new Font("Arial",Font.PLAIN,50));
//       g.setColor(Color.green);
//       g.drawString("Click to begin!",350,400);
      
      
       //g.drawRect(WIDTH, WIDTH, WIDTH, HEIGHT);
       //g.fillRect(2, WIDTH, WIDTH, HEIGHT);
       
        
       if("".equals(Key))
       {
          gameState = 1;
       
       }
        
        
    }
    
    public void drawEnd(Graphics g)
    {
        
    }
    
    
    
    public void update() {
        
        //Update Covid
        for (int i = 0; i < covid.length; i++) {
            covid[i].update();
        }
        
           //Collision
        for (int i = 0; i < covid.length; i++) {
           
            boolean collision = false;
            
            if(covid[i].getPosX()>doctor.getposX()&&covid[i].getPosX()<doctor.getposX()+100 && covid[i].getPosY()<doctor.getposY()&&covid[i].getPosY()>doctor.getposY()+100)
            {
                collision = true;
            }
            
            if(collision)
            {
                doctor.setAlive(false);
            }
            
        }
        
         //Draw Time
  
        Date currentTime = new Date(System.currentTimeMillis());
        gameTimeSeconds = ((int)currentTime.getTime() - (int)startTime.getTime()) / 1000.0;
        resultTime = gameTimeSeconds;
       
        
    }
    
    
    
    public void EndTime()
    {
      System.out.println(gameTimeSeconds);
    
    
    }
    
    public void setUpKeyboard()
    {
        this.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == e.VK_RIGHT)
                {
                    if(doctor.getposX() < 800)
                    {
                        doctor.setPosX(doctor.getposX() + doctor.getspeedX());
                    }
                }

                if(e.getKeyCode() == e.VK_LEFT)
                {
                    if(doctor.getposX() > 0)
                    {
                        doctor.setPosX(doctor.getposX() - doctor.getspeedX());
                    }
                }
                
                if(e.getKeyCode() == e.VK_UP)
                {
                    if(doctor.getposY() > 0)
                    {
                        doctor.setPosY(doctor.getposY() - doctor.getspeedY());
                    }
                }
                
                if(e.getKeyCode() == e.VK_DOWN)
                {
                    if(doctor.getposY() < 550)
                    {
                        doctor.setPosY(doctor.getposY() + doctor.getspeedY());
                    }
                }
            }
        });
        
        this.setFocusable(true);
        this.requestFocusInWindow();
    }
//       
    
    public void setUpMouse(){
        addMouseListener(new java.awt.event.MouseAdapter(){
          //Mouse Entered
            
            
            public void MouseEntered(java.awt.event.MouseEvent evt){
              hover.setText("Your cursor entered!");
              CheckHover(evt.getX(),evt.getY());
             
               }  
          
           //Mouse Exited
           public void MouseExited(java.awt.event.MouseEvent evt){
           hover.setText("Your cursor just exited!");
           CheckHover(evt.getX(),evt.getY());
           }

           
         
            
            public void mousePressed(MouseEvent me)
            {
                
                
                if(gameState == 0)
                {   
                    CheckClick(me.getX(),me.getY());
                    startTime = new Date(System.currentTimeMillis());
                }
                
                
           }
        });
    }
    
    public void CheckClick (int mouseX, int mouseY)
    {
 
        
        
        
        for (int i = 0; i < button.length; i++) 
        {
            
             //check if mouseclick coordinates are within the button
             if(mouseX>=button[0].getPosX() && mouseX<=button[0].getPosX()+170 && mouseY>=button[0].getPosY() && mouseY<=button[0].getPosY()+170)
             {               
	         gameState = 1;	    
             }
             
             if(mouseX>=button[1].getPosX() && mouseX<=button[1].getPosX()+170 && mouseY>=button[1].getPosY() && mouseY<=button[1].getPosY()+170)
             {               
	        gameState = -1;
             }
             
//               if(mouseX>=button[2].getPosX() && mouseX<=button[2].getPosX()+170 && mouseY>=button[2].getPosY() && mouseY<=button[2].getPosY()+170)
//             {               
//	        gameState = 2;
//             }
        }
    }
    
    public void CheckHover (int mouseX, int mouseY)
    {
       
        
        
        for (int i = 0; i < button.length; i++) 
        {
            
             //check if mouseclick coordinates are within the button
             if(mouseX>=button[0].getPosX() && mouseX<=button[0].getPosX()+170 && mouseY>=button[0].getPosY() && mouseY<=button[0].getPosY()+170)
             {               
	         gameState = 1;	    
                 System.out.println("Play Button is hovered");
             }
             
             if(mouseX>=button[1].getPosX() && mouseX<=button[1].getPosX()+170 && mouseY>=button[1].getPosY() && mouseY<=button[1].getPosY()+170)
             {               
	        gameState = -1;
                System.out.println("exit Button is hovered");

             }
             
//               if(mouseX>=button[2].getPosX() && mouseX<=button[2].getPosX()+170 && mouseY>=button[2].getPosY() && mouseY<=button[2].getPosY()+170)
//             {               
//	        gameState = 2;
//             }
        }
    }


public void drawElements(Graphics g) {
        
        //Draw Player
        String playerFileName = "Player.png";
        ImageIcon PlayerImg = new ImageIcon(playerFileName);
        if(doctor.isAlive())
        {
            g.drawImage(PlayerImg.getImage(),(int)doctor.getposX() ,(int)doctor.getposY(), null); 
        }
        
        //Draw Covid
        String covidImgFilename = "CovidRed.png";
        ImageIcon covidImg = new ImageIcon(covidImgFilename);
        
        
        
        
        for (int i = 0; i < covid.length; i++) {
            g.drawImage(covidImg.getImage(), (int)covid[i].getPosX(), (int)covid[i].getPosY(), null);
        }
        
        //Draw Time
        g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        g.setColor(Color.white);
        Date currentTime = new Date(System.currentTimeMillis());
        gameTimeSeconds = ((int)currentTime.getTime() - (int)startTime.getTime()) / 1000.0;
        g.drawString(""+(int)gameTimeSeconds, 850, 100);
        
    }
}
		
      
        
