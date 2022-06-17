import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pumpkins here.
 * Pumpkin character
 * @Komal Ali + Anjali Vathanakumaran (your name) 
 * @June 2022 (a version number or a date)
 */
public class Pumpkins extends Actor
{
    private String facing = "right";
    
    public Pumpkins()
    {
        GreenfootImage myImage = getImage();
        int newHeight = (int) myImage.getHeight() / 8;
        int newWidth = (int) myImage.getWidth() / 8;
        myImage.scale(newHeight, newWidth);    
    }
    GreenfootSound pumpkinEats = new GreenfootSound("EatingCandy.mp3");
    public void act()
    {
        //enables the user to use W.A.S.D to control the character in all 4 directions
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(3);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
        }
        
        //enables user to use arrow keys to control the character in all 4 directions
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
        }
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Candy.class))
        {
            //touching a candy increases score by 1 but failing to catch one decreases score by 1
            removeTouching(Candy.class);
            PumpkinWorld world = (PumpkinWorld) getWorld();
            world.spawnCandies();
            world.increaseScore();
            pumpkinEats.play();
        }
        
        if(isTouching(Ghost.class))
        {
            //touching a ghost decreases score by 1
            removeTouching(Ghost.class);
            PumpkinWorld world = (PumpkinWorld) getWorld();
            world.spawnGhosts();
            world.decreaseScore();
        }
        
        if(isTouching(Witches.class))
        {
            //touching a witch decreases score by 5 and costs you a life
            removeTouching(Witches.class);
            PumpkinWorld world = (PumpkinWorld) getWorld();
            world.spawnWitch();
            world.decreaseScore();
            world.decreaseScore();
            world.decreaseScore();
            world.decreaseScore();
            world.decreaseScore();
            world.loseLives();
        }
        
        if(isTouching(Bombs.class))
        {
            //touching a bomb costs you a life
            removeTouching(Bombs.class);
            PumpkinWorld world = (PumpkinWorld)getWorld();
            world.loseLives();
        }
        
        if(isTouching(Gem.class))
        {
            //touching a gem gives you an extra life
            removeTouching(Gem.class);
            PumpkinWorld world = (PumpkinWorld) getWorld();
            world.gainLife();
        }
         
    }
}
