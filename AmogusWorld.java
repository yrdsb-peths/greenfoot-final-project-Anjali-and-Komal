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
    SimpleTimer timer = new SimpleTimer();
    int spawnThreshold2 = 5;

    public AmogusWorld()
    {   
        Amogus amogus = new Amogus();
        addObject(amogus, 300, 350);
        
        spawnCandies();
        spawnGhosts();
        
        timer.mark();
    }
    
    public void act()
    {
        if(timer.millisElapsed() > 20000)
        {
            //spawns knives every 20 seconds and then marks the timer again
            spawnKnives();
            timer.mark();
        }
        if(score > spawnThreshold2)
        {
            //spawns an imposter every 5th of a score(5, 10, 15, 20...)
            spawnImposters();
            spawnThreshold2 += score; 
        }
        if(timer.millisElapsed() > 30000)
        {
            //spawns a gem every 30 seconds and the marks the timer again
            spawnGems();
            timer.mark();
        }
    }

    public void spawnKnives()
    {
        //when called a knife emerges from the right of the screen
        Knife knife = new Knife();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(knife, x, y);
    }
    
    public void spawnImposters()
    {
        //when called, an imposter emerges from the right side of the screen
        Imposter imposter = new Imposter();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(imposter, x, y); 
    }
    
}
