import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Locked2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Locked2  extends Doors
{
    /**
     * Act - do whatever the Locked2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lvl m = (lvl) getWorld();
        Platform_Movement pm = (Platform_Movement) getOneObjectAtOffset(-3,0, Platform_Movement.class);
        if(pm != null && m.keys>1) 
        {
            getWorld().removeObject(this);
        }       
    }    
}
