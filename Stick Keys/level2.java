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
        addObject(new Ground(),5,38);
        addObject(new Ground(),15,38);
        addObject(new Ground(),25,38);
        addObject(new Ground(),35,38);
        addObject(new Ground(),45,38);
        addObject(new Ground(),55,38);
        addObject(new Ground(),65,38);

        addObject(new Platform(),63,24);
        addObject(new Platform(),58,24);
        addObject(new Platform(),53,24);

        addObject(new Platform(),61,9);
        addObject(new Platform(),38,22);

        addObject(new Platform(),23,22);

        addObject(new horizontal(),28,14);
        addObject(new Platform(),33,22);

        addObject(new Wall(),0,3);
        addObject(new Wall(),0,10);
        addObject(new Wall(),0,16);
        addObject(new Wall(),0,22);
        addObject(new Wall(),0,29);  

        addObject(new Wall(),70,3);
        addObject(new Wall(),70,10);
        addObject(new Wall(),70,16);
        addObject(new Wall(),70,22);
        addObject(new Wall(),70,29); 

        addObject(new Ldetector(),6,30);
        addObject(new Rdetector(),50,30);
        addObject(new enemy1(),20,30);

       
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,53,14);
        Platform platform2 = new Platform();
        addObject(platform2,58,14);
        Platform platform3 = new Platform();
        addObject(platform3,63,14);
        Locked locked = new Locked();
        addObject(locked,53,29);
        Platform platform4 = new Platform();
        addObject(platform4,43,22);
        Ldetector ldetector = new Ldetector();
        addObject(ldetector,29,18);
        Rdetector rdetector = new Rdetector();
        addObject(rdetector,47,18);
        enemy1 enemy1 = new enemy1();
        addObject(enemy1,36,18);
        Locked2 locked2 = new Locked2();
        addObject(locked2,53,19);
        key key2 = new key();
        addObject(key2,57,31);
        portal2 portal2 = new portal2();
        addObject(portal2,63,20);
        key key = new key();
        addObject(key,61,6);
    }
}
