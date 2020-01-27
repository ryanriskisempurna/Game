import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class passPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class passPlatform  extends Actor
{
    /**
     * Act - do whatever the passPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        hilang();
    } 
    public void hilang()
    {
        if(isTouching(Player.class))
        {
            lvl m = (lvl) getWorld();
            m.removeObject(this);
        }
    }
}
