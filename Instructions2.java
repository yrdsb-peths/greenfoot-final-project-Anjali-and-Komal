import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions2 extends World
{

    /**
     * Constructor for objects of class Instructions2.
     * 
     */
    public Instructions2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        if(Greenfoot.isKeyDown("enter"))
        {
            Label yor = new Label("amogus instructions", 25);
            addObject(yor, 300, 200);
        }
    }
}
