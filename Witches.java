import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns witch after score of 20
 * 
 * @Komal Ali and Anjali Vathanakumaran (your name) 
 * @June 2022 (a version number or a date)
 */
public class Witches extends Actor
{
    GreenfootImage[] flyRight = new GreenfootImage[8];
    GreenfootImage[] flyLeft = new GreenfootImage[8];
    
    //Direction witch faces
    String facing = "left";
    private SimpleTimer animationTimer = new SimpleTimer();
    public Witches()
    {
        for(int i = 0; i < flyRight.length; i++)
        {
            flyRight[i] = new GreenfootImage("images/WitchGifFrames.png/
        }
    }
    /**
     * Act - do whatever the Witches wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
