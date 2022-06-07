import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 2;
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
        PumpkinWorld world = (PumpkinWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.spawnGhosts();
        }
    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
