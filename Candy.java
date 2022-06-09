import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Candy here.
 * Candy drops from sky, player needs to eat them to survive
 * @Komal Ali + Anjali Vathanakumaran (your name) 
 * @June 2022 (a version number or a date)
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
