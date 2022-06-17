import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions for the Amogus game theme
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May/June 2022
 */
public class AmogusInstructions extends World
{

    /**
     * Constructor for objects of class AmogusInstructions
     * These are the instructions for the amogus theme 
     */
    public AmogusInstructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(600, 400, 1); 
            Label titleAmogus = new Label("AMOGUS INSTRUCTIONS", 30);
            addObject(titleAmogus, 300, 35);
            Label amogusInstructions = new Label("Use WASD or arrow keys to move around \nYou have three lives, if you lose all of them, \ngameover! \nEating candy will increase your score by one. \nHitting a ghost will decrease your score by one. \nIf your score is a multiple of 5, the speed will \nincrease by one.\nOnce you hit 5, two imposters will appear from the right. \nIf you hit one, your score decreases by 5. \nEvery 20 seconds, a knife will appear. \nEvery 30 seconds,a gem will appear. \n\nHitting one will give you one life.", 21);
            addObject(amogusInstructions, 300,200);
            
            Label clickGame = new Label("PRESS 'ENTER' TO START GAME", 25);
            addObject(clickGame, 300, 375);
    }
    
    public void act()
    {
        String key = Greenfoot.getKey();
        if("enter".equals(key))
        {
            Greenfoot.setWorld(new AmogusWorld());
        }
    }
}
