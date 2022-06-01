import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pumpkins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pumpkins extends Actor
{
    String facing = "right";
    public void act()
    {
        //allowing the user to control the direction of the character using WASD
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(3);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
        }
    }
}
