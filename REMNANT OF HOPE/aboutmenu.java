import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aboutmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aboutmenu extends World
{

    /**
     * Constructor for objects of class aboutmenu.
     * 
     */
    public aboutmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950,439,1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,88,55);
    }
}
