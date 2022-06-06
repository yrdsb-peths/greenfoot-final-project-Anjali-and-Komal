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
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.loseLives();
            world.spawnCandies();
        }

    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
