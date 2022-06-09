import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Screen that shows when the game is over (when the character has died)
 * 
 * Anjali Vathanakumaran and Komal Ali
 * May/ June 2022
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label gameOverLabel = new Label("Game Over :(", 100);
        addObject(gameOverLabel, 300, 150);
        gameOverLabel.setFillColor(Color.CYAN);
        Label goBack = new Label("Press 'SPACE' to try again", 30);
        addObject(goBack, 300, 300);
        goBack.setFillColor(Color.CYAN);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            TitleScreen goback = new TitleScreen();
            Greenfoot.setWorld(goback);
        }
    }
}
