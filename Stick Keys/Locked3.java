import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Locked3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Locked3  extends Doors
{
    /**
     * Act - do whatever the Locked3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lvl m = (lvl) getWorld();
        Platform_Movement pm = (Platform_Movement) getOneObjectAtOffset(+3,0, Platform_Movement.class);
        if(pm != null && m.keys>2) 
        {
            m.keys--;
            getWorld().removeObject(this);
        }       
    }    
}
