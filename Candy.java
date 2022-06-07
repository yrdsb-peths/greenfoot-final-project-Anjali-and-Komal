import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Candy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Candy extends Actor
{
    int speed = 1;
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
        PumpkinWorld world = (PumpkinWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.spawnCandies();
            world.decreaseScore();
        }

    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
