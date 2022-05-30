import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions1 extends World
{

    /**
     * Constructor for objects of class Instructions1.
     * 
     */
    public Instructions1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        if(Greenfoot.isKeyDown("space"))
        {
            Label yor = new Label("pumpkin bois instructions", 25);
            addObject(yor, 300, 200);
        }
    }
}
