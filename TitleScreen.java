import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen that shows the user which directs theme to which screen
 * 
 * Anjali Vathanakumaran and Komal Ali
 * May/ June 2022
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    int control;
    boolean pushed;
    GreenfootSound MiiSound = new GreenfootSound("sounds/MiiSound.mp3");
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        control = 1;
        pushed = true;
        Label titleLabel = new Label("Escape the Ghosts", 75);
        addObject(titleLabel, 300, 175);
        titleLabel.setFillColor(Color.CYAN);
        Label labels = new Label("Pumpkin Themed Game \nHow: Pumpkin Bois \nAmogus Themed Game \nHow: Amogus", 30);
        addObject(labels, 300, 300);
        labels.setFillColor(Color.CYAN);
        
        Arrow pointer = new Arrow();
        addObject(pointer, 110, 260);
        MiiSound.play();
        
    }
    // sends user back to the main world act
    public void act()
    {
        String key = Greenfoot.getKey();
        if(("up".equals(key)))
        {
            if(control == 4)
            {
                control = 1;
            }
            else
            {
                control++;
            }
            pushed = true;
        }
        
        if(("down".equals(key)))
        {
            if(control == 1)
            {
                control = 4;
            }
            else
            {
                control--;
            }
            pushed = true;
        }
        
        if("enter".equals(key))
        {
            switch(control)
            {
                case 1:
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 2:
                    Greenfoot.setWorld(new Instructions2());
                    break;
                case 3:
                    Greenfoot.setWorld(new MyWorld2());
                    break;
                case 4: 
                    Greenfoot.setWorld(new Instructions1());
                    break;
            }
        }
        
        
       
    }
    
}

