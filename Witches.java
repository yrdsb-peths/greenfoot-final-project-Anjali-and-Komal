import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns witch after score of 20
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
            flyRight[i] = new GreenfootImage("images/WitchGifFrames.png/WitchGifFrames" + i + ".png");
            flyRight[i].mirrorHorizontally();
            flyRight[i].scale(100, 50);
            
        }
        
        for(int i = 0; i < flyLeft.length; i++)
        {
            flyLeft[i] = new GreenfootImage("images/WitchGifFrames.png/WitchGifFrames" + i + ".png");
            flyLeft[i].scale(100, 50);
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
    /**
     * Act - do whatever the Witches wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Calling the animateWitch method
        animateWitch();
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
        PumpkinWorld world = (PumpkinWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.spawnWitches();
            world.loseLives();
        }
    }
}
