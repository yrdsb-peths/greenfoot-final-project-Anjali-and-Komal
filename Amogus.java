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
    //Direction the amogus character is facing
    private String facing = "left";
    public Amogus()
    {
        GreenfootImage myImage = getImage();
        int newHeight = (int) myImage.getHeight() / 8;
        int newWidth = (int) myImage.getWidth() / 8;
        myImage.scale(newHeight, newWidth);
        
    }
    GreenfootSound amogusEats = new GreenfootSound("sounds/MunchingCandy.mp3");
    int imageIndex = 0;
    public void act()
    {
        //enables the user to either use W.A.S.D or the keys to control the character in all 4 directions. 
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(3);
            facing = "right";
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
        //eating candy increases score by one but not eating it decreases the score by one
        if(isTouching(Candy.class))
        {
            //touching candies increases score by 1. If you dont catch it, you lose a point
            removeTouching(Candy.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.spawnCandies();
            world1.increaseScore();
            amogusEats.play();
        }
        
        //Decreases score by one
        if(isTouching(Ghost.class))
        {
            //touching ghosts decrease score by 1
            removeTouching(Ghost.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.spawnGhosts();
            world1.decreaseScore();
        }
        
        //touching imposter decreases score by 5 and takes away a life
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
        
        //touching knives costs you 1 life
        if(isTouching(Knife.class))
        {
            removeTouching(Knife.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.loseLives();
        }
        
        //touching a gem gives you a life
        if(isTouching(Gem.class))
        {
            removeTouching(Gem.class);
            PumpkinWorld world = (PumpkinWorld) getWorld();
            world.gainLife();
        }
    }
}