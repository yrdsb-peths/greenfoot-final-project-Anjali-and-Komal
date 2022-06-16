import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Candy here.
 * Candy drops from sky, player needs to eat them to survive
 * @Komal Ali + Anjali Vathanakumaran  
 * @June 2022 (a version number or a date)
 */
public class Candy extends Actor
{
    //private SimpleTimer timer;
    //private int speed;
    public Candy()
    {
        //timer = new SimpleTimer();
       
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
        
        World world1 = getWorld();
        GameWorld world = (GameWorld) getWorld();
        if(getY() >= world.getHeight() -10)
        {
            world1.removeObject(this);
            world.spawnCandies();
            world.decreaseScore();
        }

    }
    /**public void setSpeed(int spd)
    {
        speed = spd;
        timer.mark();
    }**/
}
