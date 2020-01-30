import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class helpmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class helpmenu extends World
{

    /**
     * Constructor for objects of class helpmenu.
     * 
     */
    public helpmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950,439, 1); 
        prepare();
    }
    private void prepare()
    {
        back back = new back();
        addObject(back,88,55);
    }
}
