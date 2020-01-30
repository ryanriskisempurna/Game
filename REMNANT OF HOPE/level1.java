import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1  extends lvl
{
    
    /**
     * Constructor for objects of class Background.
     * 
     */
    public level1()
    {    
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,469,435);
        Locked locked = new Locked();
        addObject(locked,800,346);
        Platform platform = new Platform();
        addObject(platform,892,287);
        Wall wall = new Wall();
        addObject(wall,871,110);
        Wall wall2 = new Wall();
        addObject(wall2,382,278);
        Wall wall3 = new Wall();
        addObject(wall3,432,278);
        passPlatform passPlatform = new passPlatform();
        addObject(passPlatform,484,257);
        Wall wall4 = new Wall();
        addObject(wall4,535,278);
        Wall wall5 = new Wall();
        addObject(wall5,585,278);
        Wall wall6 = new Wall();
        addObject(wall6,686,278);
        Ldetector ldetector = new Ldetector();
        addObject(ldetector,278,364);
        Rdetector rdetector = new Rdetector();
        addObject(rdetector,761,364);
        enemy1 enemy1 = new enemy1();
        addObject(enemy1,541,356);
        horizontal horizontal = new horizontal();
        addObject(horizontal,740,178);
        key key = new key();
        addObject(key,866,63);
        portal portal = new portal();
        addObject(portal,910,353);
    }
}
