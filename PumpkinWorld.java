import java.util.ArrayList;
import greenfoot.*;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pumpkin bois themed game world
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May / June2022
 */
public class PumpkinWorld extends World
{
    private int score = 0;
    private SimpleTimer timer;
    Label scoreLabel;
    int level = 1;
    private int life = 3;
    private ArrayList<Heart> hearts;

    public PumpkinWorld()
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
        timer.mark();
        hearts = new ArrayList<Heart>();
        addLife();

        scoreLabel = new Label(score, 75);
        addObject(scoreLabel, 550, 50);

    }
    public void act()
    {
        if(timer.millisElapsed()> 20000)
        {
            spawnBombs();
            timer.mark();
        }
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
            Greenfoot.setWorld(new GameOver(Scoreboard.getScore()));
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

    public void spawnGhosts()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Ghost ghost = new Ghost();
        addObject(ghost, x, y);
        ghost.setSpeed(level);
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

    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
        //When score is -1, go to GameOver screen
        if(score == -1)
        {
            GameOver done = new GameOver(Scoreboard.getScore());
            Greenfoot.setWorld(done);
        }
    }
}
