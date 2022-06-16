import java.util.ArrayList;
import greenfoot.*;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pumpkin bois themed game world
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May / June2022
 */
public class PumpkinWorld extends GameWorld
{
    SimpleTimer timer = new SimpleTimer();
    int spawnThreshold = 10;
    public PumpkinWorld()
    {    
        Pumpkins pumpkin = new Pumpkins();
        addObject(pumpkin, 300, 350);

        spawnCandies();
        spawnGhosts();
        timer.mark();
    }

    public void act()
    {
        if(timer.millisElapsed()> 20000)
        {
            spawnBombs();
            timer.mark();
        }
        if(score > 10){
            spawnWitches();
            spawnThreshold+=10;
        }
    }

    public void spawnBombs()
    {
        Bombs bomb = new Bombs();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(bomb, x, y);
    }

    public void spawnWitches()
    {

        Witches witch = new Witches();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(witch, x, y);

    }

}
