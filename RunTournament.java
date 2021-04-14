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
       
    
    System.out.println("Press 1 - to press play");
    System.out.println
        ("Press 2 - to press" );
    System.out.println("Press 3 - to press display scores");
       
    numKey =  keyboard.nextInt();
    
        
      Score score1 = new Score(name,0,Country);
      Score score2 = new Score(" Jimmy ", 9 ," USA ");
      Score score3 = new Score("Xen ",10,"China");
      Score score4 = new Score("Edmund", 7,"UK"); 
      Score[] scores = {score1,score2,score3,score4};
      
     
    Tournament tournamentScore = new Tournament("Covid Tournament",100000, 3, scores, 5);
    
    // System.out.println(tournamentScore.toString());
      
    
   // if(numKey == 1)
   // {
      
    // tournamentScore.NextState();
  
    
    
    
    //}
     
    
  while (numKey == 3 ) 
    {
        highScore = false;
        
          if (highScore == false)
          {
          System.out.println("Press 1 - to press All Scores");
          System.out.println("Press 2 - to display Top Score");
          System.out.println("Press 3 - to press to go back");
          
          numKey =  keyboard.nextInt();    
          }
        
          
    /////////////////////////////////////////////////////////////////////    
        
        if (numKey == 1) 
        {
//              Score[] sortedScores = tournamentScore.sortedValues();
//              
//              for(int i=0; i<sortedScores.length; i++)
//              {
//                  System.out.println(sortedScores[i].toString());
//              }
            tournamentScore.sortedValues();
            
            
            
            
              System.out.println("Press 3 - to press to go back");
               numKey =  keyboard.nextInt();
               
                if (numKey == 3)
               {
                highScore = false;
               }
              
              
        }
    
    /////////////////////////////////////////////////
/////////////////////
        if(numKey == 2)
        { 
           highScore = true;
             
            if (highScore == true)
             {
               System.out.println("Top Score is: " + tournamentScore.maxValue());
               System.out.println("Press 3 - to press to go back");
               numKey =  keyboard.nextInt();
               
                if (numKey == 3)
               {
                highScore = false;
               }
               
             }
            
            
            
        }
        
        
        
    /////////////////////////////////////////////////////////////////////    
        
        
        
        
     
        
        
    }
      
      
      
      
   }
}
