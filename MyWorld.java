import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * PUMPKIN BOIS
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May 30, 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        // Create elephant object
        
        TitleScreen titlescn = new TitleScreen();
        Greenfoot.setWorld(titlescn);
        if(Greenfoot.isKeyDown("space"))
        {
            Label yor = new Label("pumpkin bois game", 25);
            addObject(yor, 300, 200);
        }
         if (Greenfoot.mouseClicked(this)) {
            
            Label ha = new Label("you are at the pumpkin game", 25);
            addObject(ha, 300, 200);
        }
        
    }
    //end game when the fries aren't eaten
    
    
    

    
}
