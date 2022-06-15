import java.util.ArrayList;
import greenfoot.*;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pumpkin bois themed game world
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May / June2022
 */
public class AmogusWorld extends GameWorld
{
    public AmogusWorld()
    {    
        Amogus amogus = new Amogus();
        addObject(amogus, 300, 350);
        
        spawnCandies();
        spawnGhosts();

    }
    public void act()
    {
        if(timer.millisElapsed()> 20000)
        {
            spawnKnives();
            timer.mark();
        }
    }

    public void spawnKnives()
    {
        Knife knife = new Knife();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(knife, x, y);
    }
    public void spawnImposters()
    {
        Imposter imposter = new Imposter();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(imposter, x, y); 
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        //level increases by one when the score is a multiple of 5
        if(score % 5 == 0)
        {
            level+=2;
        }
        
        if(score % 10== 0)
        {
            spawnImposters();
        }
    }
}
