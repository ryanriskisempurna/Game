import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    GreenfootSound BGM = new GreenfootSound("bsound.mp3");
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        super(950, 439, 1);
        prepare();
    }
      public void started(){
        music();
    }
    public void music()
    {        
        if(!BGM.isPlaying()){
        BGM.playLoop();
        BGM.setVolume(80);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        play play = new play();
        addObject(play,475,349);
        about about = new about();
        addObject(about,225,366);
        help help = new help();
        addObject(help,719,366);
    }
}
