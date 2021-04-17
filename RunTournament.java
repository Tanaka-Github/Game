 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mars Martian
 */
package Game;

import java.util.Scanner;

public class RunTournament {
   
    public static void main(String[]args)
    {
    Scanner keyboard = new Scanner(System.in);    
  //Menu System
      
    int numKey; 
    boolean highScore = false;
    String name;
    String Country;
    ProjectGame myGame = new ProjectGame();
   
    
    System.out.println("Please state your name: ");
    
    name = keyboard.nextLine();
    
    if(name == null || "".equals(name))
    {  
        name = "Player";
    }
        
    System.out.println("Please state your Country: ");
    
    Country = keyboard.nextLine();
    
    if( Country == null || "".equals(Country) )
    {  
        Country = "Not Stated";
    }
       
    System.out.println("--------------------------------------------------------------------------------------------------------------");

    System.out.println("\t\t Press 1 - to play the game\t\t ");
    System.out.println("\t\t Press 2 - to display the high score\t\t " );
    System.out.println("\t\t Press 3 - to display all scores\t\t ");
    System.out.println("\t\t Press 4 - to display scores by the player\t\t ");
    System.out.println("\t\t Press 5 - to display scores by  nationality\t\t ");
    System.out.println("\t\t Press 6 - to display End time by the player\t\t ");

    System.out.println("\t\t Press 10 - to Exit");
    System.out.println("--------------------------------------------------------------------------------------------------------------");

    numKey =  keyboard.nextInt();
    keyboard.nextLine();
        
      Score score1 = new Score(name,0,Country);
      Score score2 = new Score("Jimmy",9,"USA");
      Score score3 = new Score("Xen",10,"China");
      Score score4 = new Score("Edmund",7,"UK"); 
      Score score5 = new Score("Edmund",5,"UK");
      Score[] scores = {score1,score2,score3,score4,score5};
      
     
    Tournament tournamentScore = new Tournament("Covid Tournament",100000, 3, scores, 5);
    
   // System.out.println(tournamentScore.toString());    
   // if(numKey == 1)
   // {      
   // tournamentScore.NextState();   
   //}
     
    
  while (numKey != 10) 
    {
      if (numKey == 1) 
      {
               
            
            
            
      }               
        if(numKey == 2)
        { 
            System.out.println("Top Score is: "+ tournamentScore.maxValue());                         
         }
        
        if (numKey == 3) 
        {
            System.out.println("\n--------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t RANKING" );
            System.out.println("\n--------------------------------------------------------------------------------------------------------------");

            tournamentScore.sortedValues();
        }
        
        if (numKey == 4) 
        {
          //System.out.println("    ");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t Please state the name of a player to display score: \t \t " );
            System.out.println("--------------------------------------------------------------------------------------------------------------");

            String playerName = keyboard.nextLine();
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            tournamentScore.PlayerScore(playerName);
        }
        
         if (numKey == 5) 
        {
            //System.out.println("    ");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            System.out.println("\t \t Please state the nationality to display score: \t \t " );
            System.out.println("--------------------------------------------------------------------------------------------------------------");

            String playerName = keyboard.nextLine();
            System.out.println("--------------------------------------------------------------------------------------------------------------");

            tournamentScore.nationalityScore(playerName);
            
        }
        
        
      
       if (numKey == 6){                       
           myGame.EndTime();
           
           String playerName = keyboard.nextLine();
            
          
           
        }
        
    /////////////////////////////////////////////////////////////////////    
    System.out.println("\n--------------------------------------------------------------------------------------------------------------");
    System.out.println("\n"+"Press 1 - to play the game");
    System.out.println("Press 2 - to display the high score" );
    System.out.println("Press 3 - to display all scores");
    System.out.println("Press 4 - to display scores by the player");
    System.out.println("Press 5 - to display End-time");
    System.out.println("Press 10 - to Exit"); 
    System.out.println("\n--------------------------------------------------------------------------------------------------------------");

    numKey =  keyboard.nextInt();   
    keyboard.nextLine();   
     
        
        
    }
      
      
      
      
   }
}
