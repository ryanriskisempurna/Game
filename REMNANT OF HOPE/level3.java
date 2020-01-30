import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3  extends lvl
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public level3()
    {    
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground3 ground = new Ground3();
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
        addObject(horizontal,710,178);
        key key = new key();
        addObject(key,866,63);
        portal3 portal = new portal3();
        addObject(portal,150,75);
        Rdetector rdetector2 = new Rdetector();
        addObject(rdetector2,945,246);
        Ldetector ldetector2 = new Ldetector();
        addObject(ldetector2,772,250);
        enemy1 enemy12 = new enemy1();
        addObject(enemy12,885,240);
        Platform platform2 = new Platform();
        addObject(platform2,556,100);
        Platform2 platform22 = new Platform2();
        addObject(platform22,475,0);
        Locked4 locked4 = new Locked4();
        addObject(locked4,644,39);
        key key2 = new key();
        addObject(key2,559,60);
        Platform platform3 = new Platform();
        addObject(platform3,162,124);
        Platform platform4 = new Platform();
        addObject(platform4,161,0);
        Locked3 locked3 = new Locked3();
        addObject(locked3,252,67);
        Platform2 platform23 = new Platform2();
        addObject(platform23,80,42);
        Wall wall7 = new Wall();
        addObject(wall7,280,230);
        key key3 = new key();
        addObject(key3,869,366);
    }
}
