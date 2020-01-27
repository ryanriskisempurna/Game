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
        addObject(new Locked(),53,29);

        addObject(new Platform(),63,9);
        addObject(new Platform(),40,19);
        addObject(new key(),63,6);
        addObject(new passPlatform(),28,21);
        addObject(new Platform(),23,22);

        addObject(new horizontal(),40,15);
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
        addObject(platform,6,9);
        Platform platform2 = new Platform();
        addObject(platform2,11,9);
        Platform platform3 = new Platform();
        addObject(platform3,16,9);
        Locked3 locked3 = new Locked3();
        addObject(locked3,17,4);
        Platform platform4 = new Platform();
        addObject(platform4,43,7);
        Platform platform5 = new Platform();
        addObject(platform5,38,7);
        Platform platform6 = new Platform();
        addObject(platform6,33,7);
        Platform platform7 = new Platform();
        addObject(platform7,33,4);
        Platform platform8 = new Platform();
        addObject(platform8,33,1);
        key key2 = new key();
        addObject(key2,61,31);
        key key3 = new key();
        addObject(key3,38,4);
        Locked4 locked4 = new Locked4();
        addObject(locked4,44,2);
        Platform platform9 = new Platform();
        addObject(platform9,20,15);
        Rdetector rdetector = new Rdetector();
        addObject(rdetector,65,20);
        Ldetector ldetector = new Ldetector();
        addObject(ldetector,49,20);
        enemy1 enemy1 = new enemy1();
        addObject(enemy1,54,20);
        Ldetector ldetector2 = new Ldetector();
        addObject(ldetector2,32,30);
        Rdetector rdetector2 = new Rdetector();
        addObject(rdetector2,29,30);
        enemy1 enemy12 = new enemy1();
        addObject(enemy12,36,30);
        portal3 portal3 = new portal3();
        addObject(portal3,6,5);
    }
}
