import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author (Anjali Vathanakumaran) 
 * @version (May 2022)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("Escape the Ghosts", 75);
        addObject(titleLabel, 300, 175);
        
        //PUMPKIN BOIS
        Label theme1 = new Label("Pumpkin Bois", 25);
        addObject(theme1, 150, 250);
        Label instruct1 = new Label("Press 'SPACE' to view",25);
        addObject(instruct1, 150, 275);
        Label instruct11 = new Label("instructions for Pumpkin Bois", 25);
        addObject(instruct11, 145, 300);
        //AMOGUS
        Label theme2 = new Label("Amogus", 25);
        addObject(theme2, 450, 250);
        Label instruct2 = new Label("Press 'ENTER' to view", 25);
        addObject(instruct2, 450, 275);
        Label instruct22 = new Label("instructions for Amogus", 25);
        addObject(instruct22, 445, 300);
        Label game2 = new Label("CLICK TO START AMOGUS GAME", 25);
        
    }
    // sends user back to the main world act
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Instructions1 pumpBois = new Instructions1();
            Greenfoot.setWorld(pumpBois);
        }
        else if (Greenfoot.isKeyDown("enter"))
        {
            Instructions2 amogUs = new Instructions2();
            Greenfoot.setWorld(amogUs);
        }
        if (Greenfoot.mouseClicked(this)) {
            
            Greenfoot.setWorld(new MyWorld());
        }
    }
    }

