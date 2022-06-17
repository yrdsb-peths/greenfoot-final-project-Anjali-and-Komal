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
            spawnKnives();
            timer.mark();
        }
        if(score > spawnThreshold2)
        {
            spawnImposters();
            spawnThreshold2 += score; 
        }
        if(timer.millisElapsed() > 10000)
        {
            spawnGems();
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
    
    public void summonImposters()
    {
        if(score % 10 == 0)
        {
            spawnImposters();
        }
    }
}
