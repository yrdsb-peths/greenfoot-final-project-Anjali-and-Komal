import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions1 here.
 * 
 * @Komal + Anjali (your name) 
 * @May 2022 (a version number or a date)
 */
public class Instructions1 extends World
{

    /**
     * Constructor for objects of class Instructions1.
     * These are the instructions for the pumpkin boi world
     */
    public Instructions1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        if(Greenfoot.isKeyDown("space"))
        {
            Label yor = new Label("pumpkin bois instructions", 35);
            addObject(yor, 300, 200);
            Label pumpkinInstructions = new Label("Use WASD or arrow keys to move around", 30);
            addObject(pumpkinInstructions, 300, 200);
            
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
            Label hah = new Label("CLICK TO START GAME", 25);
            addObject(hah, 300, 150);
        }
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
