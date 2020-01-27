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
        addObject(new Ldetector(),6,30);
        addObject(new Rdetector(),50,30);
        addObject(new enemy1(),20,30);
        portal portal = new portal();
        addObject(portal,63,30);
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

        addObject(new Platform(),61,9);
        addObject(new Platform(),40,19);
        addObject(new key(),61,6);
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

        
    }
}
