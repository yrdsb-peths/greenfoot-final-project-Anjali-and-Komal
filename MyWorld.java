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
    Label scoreLabel;
    int level = 1;
    private int lives = 3;
    private ArrayList<Heart> hearts;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        TitleScreen titlescn = new TitleScreen();
        Greenfoot.setWorld(titlescn);
        //instructions for the pumpkin bois game
            Pumpkins pumpkin = new Pumpkins();
            addObject(pumpkin, 300, 350);
            spawnCandies();
            //spawnBombs();
        hearts = new ArrayList<Heart>();
        addHearts();
    }
    
    private void addHearts() {
        for (int i = 0; i < lives; i++) {
            Heart heart = new Heart();
            hearts.add(heart);
            addObject(heart, 50 + i * 70, 50);
        }
    }
    
    public void spawnCandies()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Candy candy = new Candy();
        addObject(candy, x, y);
    }
    /**public void spawnBombs()
    {
        Bombs bomb = new Bombs();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(bomb, x, y);
    **/
}
