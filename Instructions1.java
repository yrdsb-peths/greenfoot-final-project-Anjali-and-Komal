import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions screen for the pumpkin bois theme
 * 
 * Komal Ali and Anjali Vathanakumaran
 * May/June 2022
 */
public class Instructions1 extends World
{
    public Instructions1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label pumpkinInstructions = new Label("Use WASD or arrow keys to move around", 25);
        addObject(pumpkinInstructions, 300, 100);
        Label threeLives = new Label("You have three lives, if you lose all of them, game over!", 25);
        addObject(threeLives, 300, 125);
        Label eatCandy = new Label("Eating candy will increase your score by one", 25);
        addObject(eatCandy, 300, 150);
        Label avoidGhost = new Label("Hitting a ghost will decrease your score by one", 25);
        addObject(avoidGhost, 300, 175);
        Label increaseSpeed = new Label("If your score is a multiple of 10, the speed will increase by one", 25);
        addObject(increaseSpeed, 300, 200);
        Label witchDecrease = new Label("Once you hit 20, a witch will appear from the left and right. If you hit one, your score decreases by 5", 25);
        addObject(witchDecrease, 200, 225);
        Label bombAppears = new Label("Every 20 seconds, a bomb will appear. Hitting one will take away one life", 25);
        addObject(bombAppears, 200, 250);
        Label start1 = new Label("CLICK TO START GAME", 25);
        addObject(start1, 300, 350);
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        } 
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
