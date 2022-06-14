import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Amogus here.
 * Amogus character
 * 
 * @Komal Ali + Anjali Vathanakumaran (your name) 
 * @June 200 (a version number or a date)
 */
public class Amogus extends Actor
{
    GreenfootImage[] idleRight = new GreenfootImage[1];
    GreenfootImage[] idleLeft = new GreenfootImage[1];
    
    //Direction the amogus character is facing
    String faceDirection = "left";
    public Amogus()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/Amogus/Amogus.png");
            idleRight[i].mirrorHorizontally();
            idleRight[i].scale(100, 100);
        }
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/Amogus/Amogus.png");
            idleLeft[i].scale(100, 100);
        }
        
        //initial amogus image
        setImage(idleRight[0]);
    }
    int imageIndex = 0;
    
    /**
     * Act - do whatever the Amogus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}