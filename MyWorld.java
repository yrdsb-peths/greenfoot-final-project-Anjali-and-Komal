import java.util.ArrayList;
import greenfoot.*;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pumpkin bois themed game world
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May/ June2022
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
        if(Greenfoot.isKeyDown("space"))
        {
            Label pumpkinBois = new Label("pumpkin bois game", 25);
            addObject(pumpkinBois, 300, 200);
        }
        
        //instructions for the pumpkin bois game
         if (Greenfoot.mouseClicked(this)) {
            
            Label pumpkinBoisGame = new Label("you are at the pumpkin game", 35);
            addObject(pumpkinBoisGame, 300, 200);
        }
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
    
    
    

    
}
