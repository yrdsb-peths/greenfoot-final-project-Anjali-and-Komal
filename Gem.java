import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gem extends Actor
{
    /**
     * Act - do whatever the Gem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //GreenfootImage gems = new GreenfootImage("images/gems");
    
    public void act()
    {
        //gems.scale(80, 80);
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
        
        World world1 = getWorld();
        GameWorld world = (GameWorld) getWorld();
        if(getY() >= world.getHeight() - 10)
        {
            world1.removeObject(this);
        }
    }
}
