import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
    int speed = 2;
    GreenfootImage[] faceFront = new GreenfootImage[4];
    
    //Direction witch faces
    String facing = "front";
    private SimpleTimer animationTimer = new SimpleTimer();
    
    public Ghost()
    {
        for(int i = 0; i < faceFront.length; i++)
        {
            faceFront[i] = new GreenfootImage("images/Ghost/Ghost" + i + ".gif");
            faceFront[i].scale(50, 50);
        }
        animationTimer.mark();
        
        //Initial ghost image
        setImage(faceFront[0]);   
    }
    int imageIndex = 0;
    public void animateGhost()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }   
        animationTimer.mark();
        if(facing.equals("front"))
        {
            setImage(faceFront[imageIndex]);
            imageIndex = (imageIndex + 1) % faceFront.length;
        }
    } 
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
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
