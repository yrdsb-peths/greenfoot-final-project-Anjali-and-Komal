import greenfoot.*;
import java.awt.Color;
 
public class Scoreboard extends Actor
{
   static int score = 0;
     
    public Scoreboard()
    {
        updateBoard(); //Tells the board to update when called
    }
     
    private void updateBoard()
    {
        Label scoreLabel = new Label(0, 100);
    }
     
    public void add(int addVal)
    {
        score += addVal; updateBoard(); //Calculate the score
    }
     
    public static int getScore()
    {
        return score;
    }
}