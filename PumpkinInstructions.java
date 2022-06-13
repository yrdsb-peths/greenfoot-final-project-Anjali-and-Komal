import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions screen for the pumpkin bois theme
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May/June 2022
 */
public class PumpkinInstructions extends World
{
    public PumpkinInstructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleAmogus = new Label("PUMPKIN BOIS INSTRUCTIONS", 30);
        addObject(titleAmogus, 300, 35);
        titleAmogus.setFillColor(Color.BLACK);
        
        Label amogusInstructions = new Label("Use WASD or arrow keys to move around \nYou have three lives, if you lose all of them, \ngameover! \nEating candy will increase your score by one. \nHitting a ghost will decrease your score by one. \nIf your score is a multiple of 10, the speed will \nincrease by one.\nOnce you hit 10, a witch will appear from the right. \nIf you hit one, your score decreases by 5. \nEvery 20 seconds, a bomb will appear. \nHitting one will take away one life.", 25);
        addObject(amogusInstructions, 300,200);
        amogusInstructions.setFillColor(Color.BLACK);
        
        Label start1 = new Label("PRESS 'ENTER' TO START GAME", 25);
        addObject(start1, 300, 350);
        start1.setFillColor(Color.BLACK);
    
    }
    public void act()
    {
        String key = Greenfoot.getKey();
        if("enter".equals(key))
        {
            Greenfoot.setWorld(new PumpkinWorld());
        }
    }
}
