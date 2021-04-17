/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Zotya
 */
public class RunProjectGame {
    
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Project");
       
        //            width height
        frame.setSize(1000, 750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setResizable(false);
        frame.setBackground(Color.black);
        
        ProjectGame myGame = new ProjectGame();
        frame.getContentPane().add(myGame);
      //int state = myGame.gameState;
        
        RunTournament game = new RunTournament();
        String filepath = "GameSong.wav";
        PlayMusic musicObject = new PlayMusic();
        musicObject.playMusic(filepath);
      
        myGame.setUpMouse();
        myGame.setUpKeyboard();
     
        
        
        
        
    } 
}
