import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keys  extends Items
{
    /**
     * Act - do whatever the Keys wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    public void check()
    {
        Platform_Movement pm = (Platform_Movement) getOneObjectAtOffset(0,0, Platform_Movement.class);
        if (pm!=null)
        {
            lvl m = (lvl) getWorld();
            m.keys++;
            getWorld().removeObject(this);
        }
    }
}
