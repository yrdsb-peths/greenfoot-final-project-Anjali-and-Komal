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
    GreenfootImage[] optionImages = new GreenfootImage[4];
    World[] worlds = new World[4];
    int curOption = 0;

    int control;
    boolean pushed;
    GreenfootSound MiiSound = new GreenfootSound("sounds/MiiSound.mp3");
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        for(int i = 0; i < optionImages.length; i++){
            optionImages[i] = new GreenfootImage("images/titlescreen/start" + i + ".png");
            optionImages[i].scale(getWidth(), getHeight());
        }
        worlds[0] = new PumpkinWorld();
        worlds[1] = new  PumpkinInstructions();
        worlds[2] = new AmogusWorld();
        worlds[3] = new AmogusInstructions();
        setBackground(optionImages[curOption]);

        control = 1;
        pushed = true;
        // Label titleLabel = new Label("Escape the Ghosts", 75);
        // addObject(titleLabel, 300, 175);
        // titleLabel.setFillColor(Color.CYAN);
        // Label labels = new Label("Pumpkin Themed Game \nHow: Pumpkin Bois \nAmogus Themed Game \nHow: Amogus", 30);
        // addObject(labels, 300, 300);
        // labels.setFillColor(Color.CYAN);
        // Arrow pointer = new Arrow();
        // addObject(pointer, 110, 260);
    }

    // sends user back to the main world act
    public void act()
    {
        MiiSound.play();
        String key = Greenfoot.getKey();
        if(key == null) return;
        
        if((key.equals("up")))
        {
            if(curOption > 0){
                curOption--;
                setBackground(optionImages[curOption]);
            }
            pushed = true;
        }

        if((key.equals("down")))
        {
            if(curOption < optionImages.length - 1){
                curOption++;
                setBackground(optionImages[curOption]);
            }
            pushed = true;
        }

        if(key.equals("enter"))
        {
            Greenfoot.setWorld(worlds[curOption]);
        }

    }
}
