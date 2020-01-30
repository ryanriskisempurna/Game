import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class movingPlatforms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class movingPlatforms  extends solidFloors
{
    /**
     * Act - do whatever the movingPlatforms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int rangeCount=1;
    
    public void act() 
    { 
        move(); 
    }        
    
    public void move()
    {
        if (rangeCount<250)
        {
            moveRight();
            rangeCount++;
        }
        
        if (rangeCount>=250)
        {
            moveLeft();
            rangeCount++;
        }
        
        if (rangeCount>=500)
        { rangeCount=0; }
        
        
    }
    
    public void moveLeft()
    {
        setLocation(getX()-1,getY());
        rangeCount++;
    }
    
    public void moveRight()
    {
        setLocation(getX()+1,getY());
        rangeCount++;
    }
}
