import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Imposter here.
 * Imposter appears after score of 10 and decreases score by 5
 * @Komal Ali + Anjali Vathanakumaran (your name) 
 * @June 2022 (a version number or a date)
 */
public class Imposter extends Actor
{
    int speed = 1;
    GreenfootImage[] goRight = new GreenfootImage[6];
    GreenfootImage[] goLeft = new GreenfootImage[6];
    
    //Direction witch faces
    String facing = "right";
    private SimpleTimer animationTimer = new SimpleTimer();
    public Imposter()
    {
        for(int i = 0; i < goLeft.length; i++)
        {
            goRight[i] = new GreenfootImage("images/Imposter/Imposter" + i + ".gif");
            goRight[i].mirrorHorizontally();
            goRight[i].scale(80, 80);
        }
        
        for(int i = 0; i < goRight.length; i++)
        {
            goLeft[i] = new GreenfootImage("images/Imposter/Imposter" + i + ".gif");
            goLeft[i].scale(80, 80);
        }
        
        animationTimer.mark();
        //Inital witch image
        setImage(goLeft[0]);
    }
    int imageIndex = 0;
    public void animateImposter()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(goRight[imageIndex]);
            imageIndex = (imageIndex + 1) % goLeft.length;
        }
        else
        {
            setImage(goRight[imageIndex]);
            imageIndex = (imageIndex + 1) % goLeft.length;
        }
    }
    
    /**
     * Act - do whatever the Imposter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animateImposter();
        int x = getX();
        int y = getY();
        setLocation(x-2, y);
        AmogusWorld world2 = (AmogusWorld)getWorld();
        if(getY() >= world2.getHeight())
        {
            world2.removeObject(this);
        }
    }
}
