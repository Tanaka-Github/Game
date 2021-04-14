/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

/**
 *
 * @author Mars Martian
 */
public class Score implements Comparable <Score> {
    
    private String playerName;
    public int score;
    private String playerNationality;
    private String scoreString = "";
 
   
   
  //  private int GameplayDuration;
   
    public Score(String playerName, int score, String playerNationality) {
        
        this.playerName = playerName;
        this.score = score;
        this.playerNationality = playerNationality;
        
    }

    public Score() {
    }

    
    
    public String getScoreString() {
        
     
        return scoreString;
    }
    
    

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    public String getPlayerNationality() {
        return playerNationality;
    }

    
    //Setter    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPlayerNationality(String playerNationality) {
        this.playerNationality = playerNationality;
    }

    @Override
    public String toString() {
      
       scoreString ="Score{" + "playerName=" + playerName + ", score=" + score + ", playerNationality=" + playerNationality + '}';
        return scoreString.toString();
    }
    
    
    public int compareTo(Score sc)
    {
    if(this.score < sc.score)
    {
      return -1;
  
    }
    
    else if( this.score >  sc.score )
     {
          return 1;
     }
  
    else
     {
         return 0;
     }
    
  }
    
}
    
         
            
    
    
    
   
    
    
    
   
    

