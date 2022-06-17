import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bombs here.
 * Bomb appears every 20 secs and takes a way a life
 * 
 * @Komal Ali + Anjali Vathanakumaran
 * @June 2022
 */
public class Bombs extends Actor
{
    int speed = 1;
    public Bombs()
    {
        GreenfootImage myImage = getImage();
        int newHeight = (int) myImage.getHeight() / 5;
        int newWidth = (int) myImage.getWidth() / 5;
        myImage.scale(newHeight, newWidth);
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x-2, y);
        
        World world1 = getWorld();
        PumpkinWorld world = (PumpkinWorld) getWorld();
        if(getX() <= 10)
        {
            world.removeObject(this);
        }
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
