import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knife here.
 * Knife appears after every 20 seconds
 * @Komal Ali + Anjali Vathanakumaran (your name) 
 * @June 2022 (a version number or a date)
 */
public class Knife extends Actor
{
    int speed = 1;
    public Knife()
    {
        GreenfootImage myImage = getImage();
        int newHeight = (int) myImage.getHeight() / 5;
        int newWidth = (int) myImage.getWidth() / 5;
        myImage.scale(newHeight, newWidth);
    }
    /**
     * Act - do whatever the Knife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x-2, y);
        
        World world2 = getWorld();
        if(getX() <= 10)
        {
            world2.removeObject(this);
        }
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
