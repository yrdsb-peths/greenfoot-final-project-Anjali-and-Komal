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
    public PumpkinWorld()
    {    
        Pumpkins pumpkin = new Pumpkins();
        addObject(pumpkin, 300, 350);
        
        spawnCandies();
        spawnGhosts();
    }
    
    /**public void act()
    {
        if(timer.millisElapsed()> 20000)
        {
            spawnBombs();
            timer.mark();
        }
    }**/

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
    
    public void summonWitches()
    {
        while(score % 10 == 0)
        {
            spawnWitches();
        }
    }
    
}
