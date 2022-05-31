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
        if(Greenfoot.isKeyDown("enter"))
        {
            Label amogusInstructions = new Label("amogus instructions", 35);
            addObject(amogusInstructions, 300, 200);
            Label amogusKeys = new Label("Use WASD or arrow keys to move around", 30);
            addObject(amogusKeys, 300, 200);
            
            Label threeLives = new Label("You have three lives, if you lose all of them, game over!", 25);
            addObject(threeLives, 300, 200);
            Label eatCandy = new Label("Eating candy will increase your score by one", 25);
            addObject(eatCandy, 300, 200);
            
            Label avoidGhost = new Label("Hitting a ghost will decrease your score by one", 25);
            addObject(avoidGhost, 300, 200);
            Label increaseSpeed = new Label("If your score is a multiple of 10, the speed will increase by one", 25);
            addObject(increaseSpeed, 300, 200);
            
            Label witchDecrease = new Label("Once you hit 20, a witch will appear from the left and right. If you hit one, your score decreases by 5", 15);
            addObject(witchDecrease, 200, 100);
            Label bombAppears = new Label("Every 20 seconds, a bomb will appear. Hitting one will take away one life", 20);
            addObject(bombAppears, 200, 100);
            
            Label clickGame = new Label("CLICK TO START GAME", 25);
            addObject(clickGame, 300, 150);
        }
    }
}
