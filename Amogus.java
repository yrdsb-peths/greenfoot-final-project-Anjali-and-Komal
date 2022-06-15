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
    private String facing = "left";
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
        //GreenfootSound amogusEats = new GreenfootSound("ChewingCandy.wav");
    }
    int imageIndex = 0;
    
    /**
     * Act - do whatever the Amogus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
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
        //Arrow keys
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing= "right";
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
    
    private void eat()
    {
        if(isTouching(Imposter.class))
        {
            removeTouching(Imposter.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.spawnImposters();
            world1.decreaseScore();
            world1.decreaseScore();
            world1.decreaseScore();
            world1.decreaseScore();
            world1.decreaseScore();
            world1.loseLives();
        }
        if(isTouching(Candy.class))
        {
            removeTouching(Candy.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.spawnCandies();
            world1.increaseScore();
        }
        if(isTouching(Ghost.class))
        {
            removeTouching(Ghost.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.spawnGhosts();
            world1.decreaseScore();
        }
        if(isTouching(Knife.class))
        {
            removeTouching(Knife.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.loseLives();
        }
    }
    
    
}