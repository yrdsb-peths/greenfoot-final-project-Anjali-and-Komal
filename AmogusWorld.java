import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * AMOGUS themed game
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May/ June 2022
 */
public class AmogusWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    private int lives = 3;
    public AmogusWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        
        //TitleScreen titlescn = new TitleScreen();
        //Greenfoot.setWorld(titlescn);
            Label amogusGame = new Label("Welcome to the Amogus themed game", 25);
            addObject(amogusGame, 300, 200);
        
    }
    //end game when the fries aren't eaten
    
    
    

    
}