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
    private GreenfootImage[] images = new GreenfootImage[50];
    private int currentImage;
    public void act() 
    {        
        move();
        kurangnyawa();
        if (dir==0)
        { 
            maju(); 
        }
        if (dir==180)
        { 
            mundur();
        }
    }    
    public void kurangnyawa()
    {
        if(isTouching(Player.class))
        {
            lvl m = (lvl) getWorld();
            m.kurangnyawa();
            m.removeObjects(m.getObjects(Player.class));
            m.addObject(new Player(),100,250);
            m.gamestop();
        }
    }
    public enemy1()
    {
        images [0] = new GreenfootImage("Walk1b.png");
        images [1] = new GreenfootImage("Walk1b.png");
        images [2] = new GreenfootImage("Walk1b.png");
        images [3] = new GreenfootImage("Walk1b.png");
        images [4] = new GreenfootImage("Walk1b.png");
        images [5] = new GreenfootImage("Walk2b.png");
        images [6] = new GreenfootImage("Walk2b.png");
        images [7] = new GreenfootImage("Walk2b.png");
        images [8] = new GreenfootImage("Walk2b.png");
        images [9] = new GreenfootImage("Walk2b.png");
        images [10] = new GreenfootImage("Walk3b.png");
        images [11] = new GreenfootImage("Walk3b.png");
        images [12] = new GreenfootImage("Walk3b.png");
        images [13] = new GreenfootImage("Walk3b.png");
        images [14] = new GreenfootImage("Walk3b.png");
        images [15] = new GreenfootImage("Walk4b.png");
        images [16] = new GreenfootImage("Walk4b.png");
        images [17] = new GreenfootImage("Walk4b.png");
        images [18] = new GreenfootImage("Walk4b.png");
        images [19] = new GreenfootImage("Walk4b.png");
        images [20] = new GreenfootImage("Walk5b.png");
        images [21] = new GreenfootImage("Walk5b.png");
        images [22] = new GreenfootImage("Walk5b.png");
        images [23] = new GreenfootImage("Walk5b.png");
        images [24] = new GreenfootImage("Walk5b.png");
        images [25] = new GreenfootImage("Walk1.png");
        images [26] = new GreenfootImage("Walk1.png");
        images [27] = new GreenfootImage("Walk1.png");
        images [28] = new GreenfootImage("Walk1.png");
        images [29] = new GreenfootImage("Walk1.png");
        images [30] = new GreenfootImage("Walk2.png");
        images [31] = new GreenfootImage("Walk2.png");
        images [32] = new GreenfootImage("Walk2.png");
        images [33] = new GreenfootImage("Walk2.png");
        images [34] = new GreenfootImage("Walk2.png");
        images [35] = new GreenfootImage("Walk3.png");
        images [36] = new GreenfootImage("Walk3.png");
        images [37] = new GreenfootImage("Walk3.png");
        images [38] = new GreenfootImage("Walk3.png");
        images [39] = new GreenfootImage("Walk3.png");
        images [40] = new GreenfootImage("Walk4.png");
        images [41] = new GreenfootImage("Walk4.png");
        images [42] = new GreenfootImage("Walk4.png");
        images [43] = new GreenfootImage("Walk4.png");
        images [44] = new GreenfootImage("Walk4.png");
        images [45] = new GreenfootImage("Walk5.png");
        images [46] = new GreenfootImage("Walk5.png");
        images [47] = new GreenfootImage("Walk5.png");
        images [48] = new GreenfootImage("Walk5.png");
        images [49] = new GreenfootImage("Walk5.png");
    }
    private void maju()
    {
        if(currentImage >= 24)
        {
            currentImage = 0;
        } else 
        {
            currentImage++;
        }
        setImage(images[currentImage]);
    }
    private void mundur()
    {
        if(currentImage >= 49)
        {
            currentImage = 25;
        } else 
        {
            currentImage++;
        }
        setImage(images[currentImage]);
    }
}
