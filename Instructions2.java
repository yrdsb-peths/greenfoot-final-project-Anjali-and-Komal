import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions for the Amogus game theme
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May/June 2022
 */
public class Instructions2 extends World
{

    /**
     * Constructor for objects of class Instructions2.
     * These are the instructions for the amogus theme 
     */
    public Instructions2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(600, 400, 1); 
            Label titleAmogus = new Label("AMOGUS INSTRUCTIONS", 30);
            addObject(titleAmogus, 300, 35);
            Label amogusInstructions = new Label("Use WASD or arrow keys to move around \nYou have three lives, if you lose all of them, \ngameover! \nEating cnady will increase your score by one. \nHitting a ghost will decrease you score by one. \nIf your score is a multiple of 10, the speed will \nincrease by one.\nOnce you hit 20, a witch will appear from the and right. \nIf you hit one, your score decreases by 5. \nEvery 20 seconds, a bomb will appear. \nHitting one will take away one life.", 25);
            addObject(amogusInstructions, 300,200);
            
            Label clickGame = new Label("PRESS 'ENTER' TO START GAME", 25);
            addObject(clickGame, 300, 375);
    }
    
    public void act()
    {
        String key = Greenfoot.getKey();
        if("enter".equals(key))
        {
            Greenfoot.setWorld(new MyWorld2());
        }
    }
}
