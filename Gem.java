import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gem here.
 * Spawn gems every 30 seconds and increase score by 5
 * 
 * @Komal Ali + Anjali Vathanankumaran (your name) 
 * @June 2022 (a version number or a date)
 */
public class Gem extends Actor
{
    
    public Gem()
    {
        GreenfootImage myImage = getImage();
        int newHeight = (int) myImage.getHeight() / 8;
        int newWidth = (int) myImage.getWidth() / 8;
        myImage.scale(newHeight, newWidth);
     }
     
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
