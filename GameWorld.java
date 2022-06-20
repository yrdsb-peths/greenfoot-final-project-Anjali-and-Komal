import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class GameWorld here.
 * Superclass of PumpkinWorld and AmogusWorld
 * @aKomal Ali + Anjali Vathanakumaran (your name) 
 * June 2022 (a version number or a date)
 */
public class GameWorld extends World
{
    public int score = 0;
    Label scoreLabel;

    SimpleTimer timer = new SimpleTimer();
    int speed = 5;
    int level = 1;
    
    public int life = 3;
    public ArrayList<Heart> hearts;
    
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        timer.mark();
        
        hearts = new ArrayList<Heart>();
        addLife();

        scoreLabel = new Label(score, 75);
        addObject(scoreLabel, 550, 50);
    }
    
    public void act()
    {
        
    }
    
    public int getScore()
    {
        return this.score;
    }
    
    public void currentScore(int addition)
    {
        score += addition;
        scoreLabel.setValue(score);
    }
    
    public void addLife() 
    {
        for (int i = 0; i < life; i++) 
        {
            Heart heart = new Heart();
            hearts.add(heart);
            addObject(heart, 50 + i * 70, 50);
        }
    }
    
    public void gainLife()
    {
        life++;
        for (int i = 0; i < life; i++) 
        {
            Heart heart = new Heart();
            hearts.add(heart);
            addObject(heart, 50 + i * 70, 50);
        }   
    }
    
    
    public void loseLives()
    {
        //decreases the number of lives by one and removes a heart
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
        //when called, a candy falls from the top of the screen
        Candy candy = new Candy();
        candy.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(candy, x, y);
        
    }
    
    public void spawnGhosts()
    {
        //when called a ghost falls from the top of the screen
        Ghost ghost = new Ghost();
        ghost.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(ghost, x, y);
    }
    
    public void spawnGems()
    {
        //when called, a gem falls from the top of the screen
        Gem gem = new Gem();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(gem, x, y);
    }
    
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
        //When score is -1, a life is lost. when there are no remaining lives, it takes the user to the gameover screen
        if(score == -1)
        {
            score = 0;
            life--;
            if(life <=0)
            {
                Greenfoot.setWorld(new GameOver());
            }
            removeObjects(hearts);
            hearts.clear();
            addLife();
        }
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        //level increases by two when the score is a multiple of 5
        if(score % 5 == 0)
        {
            level+=1;
        }
    }
}
