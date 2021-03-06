import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Spawns witch after score of 3 and decrease score by 5
 * 
 * @Komal Ali and Anjali Vathanakumaran (your name) 
 * @June 2022 (a version number or a date)
 */

public class Witches extends Actor
{
    int speed = 1;
    GreenfootImage[] flyRight = new GreenfootImage[8];
    GreenfootImage[] flyLeft = new GreenfootImage[8];
    
    //Direction witch faces
    String facing = "left";
    private SimpleTimer animationTimer = new SimpleTimer();
    public Witches()
    {
        for(int i = 0; i < flyRight.length; i++)
        {
            flyRight[i] = new GreenfootImage("images/Witches/Witches" + i + ".gif");
            flyRight[i].mirrorHorizontally();
            flyRight[i].scale(80, 80);
        }
        
        for(int i = 0; i < flyLeft.length; i++)
        {
            flyLeft[i] = new GreenfootImage("images/Witches/Witches" + i + ".gif");
            flyLeft[i].scale(80, 80);
        }
        
        animationTimer.mark();
        //Inital witch image
        setImage(flyRight[0]);
    }
    int imageIndex = 0;
    public void animateWitch()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("left"))
        {
            setImage(flyLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % flyLeft.length;
        }
        else
        {
            setImage(flyLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % flyLeft.length;
        }
    }
    
    public void act()
    {
        // Calling the animateWitch method
        animateWitch();
        int x = getX();
        int y = getY();
        setLocation(x-2, y);
        
        World world1 = getWorld();
        //PumpkinWorld world = (PumpkinWorld) getWorld();
        if(getX() <= 10)
        {
            world1.removeObject(this);
        }
    }
}
