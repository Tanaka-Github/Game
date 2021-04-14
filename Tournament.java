/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  Game;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Mars Martian
 */



public class Tournament {
  //Display the scores from highest to lowest including player name, nationality and age.

    private String tournamentName; 
    private int prizefund;  
    private int NumberOfLevels;
    private Score[]scores;
    private int numberOfTrys;


  
   
    public Tournament() {
    }

    public Tournament(Score[] scores) {
        this.scores = scores;
    }

    public Tournament(String tournamentName, int prizefund, int NumberOfLevels, Score[] scores, int numberOfTrys) {
        this.tournamentName = tournamentName;
        this.prizefund = prizefund;
        this.NumberOfLevels = NumberOfLevels;
        this.scores = scores;
        this.numberOfTrys = numberOfTrys;
    }



 
    
    
    
    
    ///Getter
    
    public int getNumberOfTrys() {
        return numberOfTrys;
    }

    public String getTournamentName() {
        return tournamentName;
    }
    
    public int getPrizefund() {
        return prizefund;
    }

    public int getNumberOfLevels() {
        return NumberOfLevels;
    }

    public Score[] getScores() {
        return scores;
    }

   
   //Setter

    public void setNumberOfTrys(int numberOfTrys) {
        this.numberOfTrys = numberOfTrys;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    
    
    

    public void setPrizefund(int prizefund) {
        this.prizefund = prizefund;
    }

    public void setNumberOfLevels(int NumberOfLevels) {
        this.NumberOfLevels = NumberOfLevels;
    }

    public void setScores(Score[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        
        String scoresString = "";
        
        for(int i=0; i < scores.length; i++)
        {
          scoresString += scores[i].toString() + "";
        }
        
        return "Tournament{" + " tournamentName = " + tournamentName + ", prizefund = " + prizefund + ", NumberOfLevels = " + NumberOfLevels + ", scores = " + scoresString + ", numberOfTrys = " + numberOfTrys + '}';
    }
 
    
     //Q5b
      public double maxValue()
    {
      double maxVal = 0;
      
      for (int i = 0; i < scores.length; i++){
          
         if (scores[i].getScore() > maxVal) {
              maxVal = scores[i].getScore();
          }
         
      }
      return maxVal;
    }
      
      /////////////////////////////////////////////////////////////////////////
      
      public void sortedValues()
      {
//        int i = 0;
//         
         
           Arrays.sort(scores);
          for (int i = 0; i < scores.length; i++) {
                
        
            System.out.println(scores.toString());
          }
//       
//         return scores;
          
          
        //  Collections.reverse(scores);
      }
                   
     
     

    
    
   
     public int[] getTopScore (int[] values)
    {

       {  
          int[] arrayTemp = values.clone();
          Arrays.sort(arrayTemp); //Lowest to Highest

          int[] arrayOut= new int[arrayTemp.length];

          for(int i=arrayTemp.length-1; i>=0; i--)
          {
              arrayOut[arrayTemp.length-i-1]=arrayTemp[i];
          }

          return arrayOut;



        }
    }
    
    
    
}
