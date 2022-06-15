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
    public void act()
    {
        if(timer.millisElapsed()> 20000)
        {
            spawnBombs();
            timer.mark();
        }
    }

    
    public void currentScore(int addition)
    {
        score += addition;
        scoreLabel.setValue(score);
    }

    public void addLife() {
        for (int i = 0; i < life; i++) {
            Heart heart = new Heart();
            hearts.add(heart);
            addObject(heart, 50 + i * 70, 50);
        }
    }

    public void loseLives()
    {
        life--;
        if(life <=0)
        {
            Greenfoot.setWorld(new GameOver());
        }
        removeObjects(hearts);
        hearts.clear();
        addLife();
    }

    public void spawnCandies()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Candy candy = new Candy();
        addObject(candy, x, y);
        candy.setSpeed(level);
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
            spawnWitches();
        }
    }

    
}
