import java.util.ArrayList;
import greenfoot.*;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pumpkin bois themed game world
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May / June2022
 */
public class MyWorld extends World
{
    public int score = 0;
    private SimpleTimer timer;
    Label scoreLabel;
    int level = 1;
    private int life = 3;
    private ArrayList<Heart> hearts;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //TitleScreen titlescn = new TitleScreen();
        //Greenfoot.setWorld(titlescn);
        Pumpkins pumpkin = new Pumpkins();
        addObject(pumpkin, 300, 350);
        spawnCandies();
        spawnGhosts();
        
        timer = new SimpleTimer();
        hearts = new ArrayList<Heart>();
        addLife();
        
        scoreLabel = new Label(score, 75);
        addObject(scoreLabel, 550, 50);
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
    }
    
    public void spawnGhosts()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Ghost ghost = new Ghost();
        addObject(ghost, x, y);
    }
    /**public void spawnBombs()
    {
        Bombs bomb = new Bombs();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(bomb, x, y);
    }*/
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
    }
}
