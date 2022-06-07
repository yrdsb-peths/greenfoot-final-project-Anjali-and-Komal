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
    
    public Pumpkins()
    {
        
    }
    
    public void act()
    {
        //allowing the user to control the direction of the character using WASD
        //WASD
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
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
        }
        //Arrow keys
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
        }
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Candy.class))
        {
            removeTouching(Candy.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnCandies();
            world.increaseScore();
            
        }
        if(isTouching(Ghost.class))
        {
            removeTouching(Ghost.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnGhosts();
            world.decreaseScore();
        }
        /*if(isTouching(Bombs.class))
        {
            removeTouching(Bombs.class);
            MyWorld world = (MyWorld)getWorld();
            //remove a life
        }*/
    }
}
