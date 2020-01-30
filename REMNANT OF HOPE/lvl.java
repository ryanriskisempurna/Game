import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl extends World
{

    /**
     * Constructor for objects of class lvl.
     * 
     */
    int keys=0;
    int nyawa = 3;
    public lvl()
    {    
        super(950, 439, 1); 
        addObject(new Player(),100,250);
    }

    public void act()
    {
        nyawa();
    }
    public void nyawa()
    {
        showText("Nyawa = " + nyawa,60,30);
    }
    public void kurangnyawa()
    {
        nyawa = nyawa - 1;
    }
    public void gamestop()
    {
        if(nyawa == 0)
        {
            selese();
            Greenfoot.playSound("lose.mp3");
            Greenfoot.stop();
        }
    }
    public void selese()
    {
        Greenfoot.setWorld(new gameoverr());
    }
}
