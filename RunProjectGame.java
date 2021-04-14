/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Zotya
 */
public class RunProjectGame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Project");

        frame.setSize(800, 900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.setBackground(Color.black);

        ProjectGame myGame = new ProjectGame();
        frame.getContentPane().add(myGame);

        // String filepath = "GameSong.wav";
        // PlayMusic musicObject = new PlayMusic();
        // musicObject.playMusic(filepath);
    }
}
