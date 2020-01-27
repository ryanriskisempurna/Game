import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy1  extends Enemy
{
    /**
     * Act - do whatever the enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage right = new GreenfootImage("monster.png");
    GreenfootImage left = new GreenfootImage("monsterb.png");
    
    public void act() 
    {        
        move();
        kurangnyawa();
        if (dir==0)
        { setImage(right); }
        if (dir==180)
        { setImage(left); }
    }    
    public void kurangnyawa()
    {
        if(isTouching(Player.class))
        {
            lvl m = (lvl) getWorld();
            m.kurangnyawa();
            m.removeObjects(m.getObjects(Player.class));
            m.addObject(new Player(),10,10);
            m.gamestop();
        }
    }
}
