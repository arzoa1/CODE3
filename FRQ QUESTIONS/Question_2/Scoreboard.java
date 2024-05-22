public class Scoreboard {
  private int score1; 
  private int score2; 
  private String team1;
  private String team2; 
  private boolean active; 
  
  

  public Scoreboard (String t1, String t2){
    team1 =t1;
    team2= t2;
    score1= 0;
    score2= 0;
    active = true; 
    
  }


  
  public void recordPlay (int score){
    if (int score == 0){
      active = !active; 
    }
    else{
      if (active)
        score1+= ;
    }
  }
  

public String getScore(){
  if(active){
    return score1 + "-"+ score2+ "-"+ team1;
  } 
  else {
    return score1 + "-"+ score2 +"-"+team2;
  }
}




  
  
}
