import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2  extends lvl
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public level2()
    {    

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground2 ground2 = new Ground2();
        addObject(ground2,483,436);
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
        addObject(wall6,685,278);
        Ldetector ldetector = new Ldetector();
        addObject(ldetector,278,364);
        Rdetector rdetector = new Rdetector();
        addObject(rdetector,761,364);
        enemy1 enemy1 = new enemy1();
        addObject(enemy1,541,356);
        horizontal horizontal = new horizontal();
        addObject(horizontal,610,178);
        key key = new key();
        addObject(key,866,63);
        portal2 portal = new portal2();
        addObject(portal,910,236);
        Wall wall7 = new Wall();
        addObject(wall7,635,278);
        Ldetector ldetector2 = new Ldetector();
        addObject(ldetector2,519,230);
        Rdetector rdetector2 = new Rdetector();
        addObject(rdetector2,700,230);
        enemy1 enemy12 = new enemy1();
        addObject(enemy12,615,224);
        Platform platform2 = new Platform();
        addObject(platform2,892,176);
        Locked2 locked2 = new Locked2();
        addObject(locked2,800,232);
        key key2 = new key();
        addObject(key2,831,367);
    }
}
