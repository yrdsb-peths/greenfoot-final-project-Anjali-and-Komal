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
        //GreenfootSound amogusEats = new GreenfootSound("sounds/ChewingCandy.wav");
    }
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
        //the effects of touching/eating different characters within the game
        if(isTouching(Candy.class))
        {
            //touching candies increases score by 1. If you dont catch it, you lose a point
            removeTouching(Candy.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.spawnCandies();
            world1.increaseScore();
        }
        
        if(isTouching(Ghost.class))
        {
            //touching ghosts decrease score by 1
            removeTouching(Ghost.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.spawnGhosts();
            world1.decreaseScore();
        }
        
        
        if(isTouching(Imposter.class))
        {
            removeTouching(Imposter.class);
            //touching imposter decreases score by 5 and takes away a life
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.spawnImposters();
            world1.decreaseScore();
            world1.decreaseScore();
            world1.decreaseScore();
            world1.decreaseScore();
            world1.decreaseScore();
            world1.loseLives();
        }
        
        if(isTouching(Knife.class))
        {
            //touching knives costs you 1 life
            removeTouching(Knife.class);
            AmogusWorld world1 = (AmogusWorld) getWorld();
            world1.loseLives();
        }
        
        if(isTouching(Gem.class))
        {
            //touching a gem gives you a life
            removeTouching(Gem.class);
            PumpkinWorld world = (PumpkinWorld) getWorld();
            world.gainLife();
        }
    }
}