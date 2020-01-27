import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.lang.*;

/**
 * Write a description of class You here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform_Movement  extends Actor
{
    /**
     * Act - do whatever the You wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    double gravity=0;
    int timer=0;
    boolean pass=false;
    int jumpCount=0;
    int animCount=0;
    int dir=0;
    
    
    GreenfootImage walkLeft1 = new GreenfootImage("walkLeft_1.png");
    GreenfootImage walkLeft2 = new GreenfootImage("walkLeft_2.png");
    GreenfootImage walkLeft3 = new GreenfootImage("walkLeft_3.png");
    
    GreenfootImage walkRight1 = new GreenfootImage("walkRight_1.png");
    GreenfootImage walkRight2 = new GreenfootImage("walkRight_2.png");
    GreenfootImage walkRight3 = new GreenfootImage("walkRight_3.png");
    
    GreenfootImage stopLeft1 = new GreenfootImage("stopLeft.png");
    GreenfootImage stopRight1 = new GreenfootImage("stopRight.png");
   
    public void act() 
    {
        movementChecks();
        animation();
        checkworld();
    }
    
    public void Gravity(double revolutions)
    {
        for(int control=0; control<revolutions; control++)
        {
            
            if (gravity>0)
            { setLocation(getX(),getY()+1); }
        
            if (gravity<0)
            { setLocation(getX(),getY()-1); }
        
            if (getOneObjectAtOffset(0,-2,Obstacle.class)!=null && gravity>0 && pass==false || getOneObjectAtOffset(0,2,Obstacle.class)!=null && gravity>0  && pass==false)
            {
                setLocation(getX(),getY()-1);
                gravity=0;
                jumpCount=0;
            }
        
            if (getOneObjectAtOffset(0,-2,solidFloors.class)!=null && gravity<0 || getOneObjectAtOffset(0,2,solidFloors.class)!=null && gravity<0)
            {
                setLocation(getX(),getY()+1);
                gravity=0;
            }
        }
    }
    public void movementChecks()
    {
        if (gravity<10)
        { gravity+=0.5; }
        
        
        if (getOneObjectAtOffset(0,3,solidFloors.class)!=null)
        { pass=false; }
        
        if (gravity!=0)
        { Gravity(Math.abs(gravity)); }
        
        if (Greenfoot.isKeyDown("up") && jumpCount==1 && gravity>-2 && gravity<5)
        {
            jumpCount++;
            gravity=-2;
        }
        
        if (Greenfoot.isKeyDown("up") && gravity<=0 && jumpCount==0)
        {
            jumpCount++;
            gravity=-3.25;
        }
        
        if (Greenfoot.isKeyDown("right") && getOneObjectAtOffset(3,0,solidFloors.class)==null)
        { 
            setLocation(getX()+1,getY()); 
            dir=0;
            animCount++;
        }
        else if (Greenfoot.isKeyDown("left") && getOneObjectAtOffset(-3,0,solidFloors.class)==null)
        { 
            setLocation(getX()-1,getY()); 
            dir=180;
            animCount++;
        }  
        else
        { animCount=0; }
            
        
        if (Greenfoot.isKeyDown("down") && getOneObjectAtOffset(0,3,passThroughFloors.class)!=null && gravity>=0)
        { pass=true; }
        
        corrections();
        
        movingPlatforms MovingPlatforms = (movingPlatforms) getOneObjectAtOffset(0, 3, movingPlatforms.class);
        if(MovingPlatforms != null) 
        {
            setLocation(MovingPlatforms.getX(),MovingPlatforms.getY()-3);
        }
        
    }
    
    public void corrections()
    {
        if (getOneObjectAtOffset(2,0,passThroughFloors.class)!=null && gravity>0)
        { setLocation(getX()-1,getY()); }
        
        if (getOneObjectAtOffset(-2,0,passThroughFloors.class)!=null && gravity>0)
        { setLocation(getX()+1,getY()); }
        
        if (getOneObjectAtOffset(0,2,passThroughFloors.class)!=null && gravity>=0)
        { setLocation(getX(),getY()-1); }        
        
        if (getOneObjectAtOffset(2,0,solidFloors.class)!=null)
        { setLocation(getX()-1,getY()); }
        
        if (getOneObjectAtOffset(-2,0,solidFloors.class)!=null)
        { setLocation(getX()+1,getY()); }
        
        if (getOneObjectAtOffset(0,2,solidFloors.class)!=null)
        { setLocation(getX(),getY()-1); }   
        
        if (getOneObjectAtOffset(0,-2,solidFloors.class)!=null)
        { setLocation(getX(),getY()+1); } 
    }
    public void animation()
    {
        if (dir==0)
        {
            if (animCount==0)
            { setImage(stopRight1); }   
            else if (animCount>0 && animCount<3)
            { setImage(walkRight1); }
            else if (animCount>2 && animCount<5)
            { setImage(walkRight2); }
            else if (animCount>4 && animCount<7)
            { setImage(walkRight3); }
            else if (animCount>7)
            { animCount=1; }   
        }
        
        if (dir==180)
        {
            if (animCount==0)
            { setImage(stopLeft1); }   
            else if (animCount>0 && animCount<3)
            { setImage(walkLeft1); }
            else if (animCount>2 && animCount<5)
            { setImage(walkLeft2); }
            else if (animCount>4 && animCount<7)
            { setImage(walkLeft3); }
            else if (animCount>7)
            { animCount=1; }   
        }
    }
    public void checkworld()
    {
        lvl m = (lvl) getWorld();
        if(isTouching(portal.class))
        Greenfoot.setWorld(new level2());
        if(isTouching(portal2.class))
        Greenfoot.setWorld(new level3());
        if(isTouching(portal3.class)){
           m.win();
           Greenfoot.stop();
        }
    }    
}
