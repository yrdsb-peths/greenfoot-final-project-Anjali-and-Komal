import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * Ghost decreases life by one
 * 
 * @Komal Ali + Anjali Vathanakumaran (your name) 
 * @June 2022 (a version number or a date)
 */
public class Ghost extends Actor
{
    int speed = 2;

    GreenfootImage[] faceRight = new GreenfootImage[4];
    GreenfootImage[] faceLeft = new GreenfootImage[4];

    //Direction witch faces
    String facing = "right";
    private SimpleTimer animationTimer = new SimpleTimer();

    public Ghost()
    {
        for(int i = 0; i < faceRight.length; i++)
        {
            faceRight[i] = new GreenfootImage("images/Ghost/Ghost" + i + ".gif");
            faceRight[i].mirrorHorizontally();
            faceRight[i].scale(65, 65);
        }
        for(int i = 0; i < faceLeft.length; i++)
        {
            faceLeft[i] = new GreenfootImage("images/Ghost/Ghost" + i + ".gif");
            faceLeft[i].scale(65, 65);
        }
        animationTimer.mark();

        //Initial ghost image
        setImage(faceRight[0]);   
    }
    int imageIndex = 0;
    public void animateGhost()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();

        if(facing.equals("left"))
        {
            setImage(faceLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % faceLeft.length;
        }
        else
        {
            setImage(faceRight[imageIndex]);
            imageIndex = (imageIndex + 1) % faceRight.length;
        }
    } 

    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y+2);

        World world = getWorld();
        if(getY() >= world.getHeight()-10)
        {
            //world.spawnGhosts();
            world.removeObject(this);
        }
    }

    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
