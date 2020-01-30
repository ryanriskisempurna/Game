
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Platform_Movement
{
    private static final int jumpStrength = 16;
    private GreenfootImage[] images = new GreenfootImage[50];
    private int currentImage;
    private static final int speed = 2;
    public boolean jumping;
    private int direction = 1; 
    private int shootingCounter = 10;
    private int vSpeed = 0;  
    private static final int acceleration = 1;
    public void act() 
    {
        checkKeys();        
        checkFall();
        shootingCounter --;
        checkRightWalls();
        checkLeftWalls();
        platformAbove();
        checkworld();
    }
    public Player()
    {
        images [0] = new GreenfootImage("Runb1.png");
        images [1] = new GreenfootImage("Runb1.png");
        images [2] = new GreenfootImage("Runb1.png");
        images [3] = new GreenfootImage("Runb1.png");
        images [4] = new GreenfootImage("Runb1.png");
        images [5] = new GreenfootImage("Runb2.png");
        images [6] = new GreenfootImage("Runb2.png");
        images [7] = new GreenfootImage("Runb2.png");
        images [8] = new GreenfootImage("Runb2.png");
        images [9] = new GreenfootImage("Runb2.png");
        images [10] = new GreenfootImage("Runb3.png");
        images [11] = new GreenfootImage("Runb3.png");
        images [12] = new GreenfootImage("Runb3.png");
        images [13] = new GreenfootImage("Runb3.png");
        images [14] = new GreenfootImage("Runb3.png");
        images [15] = new GreenfootImage("Runb4.png");
        images [16] = new GreenfootImage("Runb4.png");
        images [17] = new GreenfootImage("Runb4.png");
        images [18] = new GreenfootImage("Runb4.png");
        images [19] = new GreenfootImage("Runb4.png");
        images [20] = new GreenfootImage("Runb5.png");
        images [21] = new GreenfootImage("Runb5.png");
        images [22] = new GreenfootImage("Runb5.png");
        images [23] = new GreenfootImage("Runb5.png");
        images [24] = new GreenfootImage("Runb5.png");
        images [25] = new GreenfootImage("Run1.png");
        images [26] = new GreenfootImage("Run1.png");
        images [27] = new GreenfootImage("Run1.png");
        images [28] = new GreenfootImage("Run1.png");
        images [29] = new GreenfootImage("Run1.png");
        images [30] = new GreenfootImage("Run2.png");
        images [31] = new GreenfootImage("Run2.png");
        images [32] = new GreenfootImage("Run2.png");
        images [33] = new GreenfootImage("Run2.png");
        images [34] = new GreenfootImage("Run2.png");
        images [35] = new GreenfootImage("Run3.png");
        images [36] = new GreenfootImage("Run3.png");
        images [37] = new GreenfootImage("Run3.png");
        images [38] = new GreenfootImage("Run3.png");
        images [39] = new GreenfootImage("Run3.png");           
        images [40] = new GreenfootImage("Run4.png");
        images [41] = new GreenfootImage("Run4.png");
        images [42] = new GreenfootImage("Run4.png");
        images [43] = new GreenfootImage("Run4.png");
        images [44] = new GreenfootImage("Run4.png");
        images [45] = new GreenfootImage("Run5.png");
        images [46] = new GreenfootImage("Run5.png");
        images [47] = new GreenfootImage("Run5.png");
        images [48] = new GreenfootImage("Run5.png");
        images [49] = new GreenfootImage("Run5.png");
    }
    public void checkworld()
    {
        lvl m = (lvl) getWorld();
        if(isTouching(portal.class))
        Greenfoot.setWorld(new level2());
        if(isTouching(portal2.class))
        Greenfoot.setWorld(new level3());
        if(isTouching(portal3.class)){
            Greenfoot.setWorld(new winn());
        }
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
    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
        direction = 1;
    }
    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
        direction = -1;
    }
    public void selese1()
    {
        Greenfoot.setWorld(new gameoverr());
    }
    public void selese()
    {
        Greenfoot.setWorld(new gameoverr());
        getWorld().removeObject(this);
    }
    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    }
    public void fall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        jumping = true;
        if (getY() == getWorld().getHeight()-1)
        {
            selese1();
        }
    }
    public boolean shooting()
    {
        if(shootingCounter <= 0 && direction ==1)
        {
            //getWorld().addObject(new pelor1(), getX()+15, getY());
            //setImage("sht.png");
            shootingCounter = 30;
            return true;
        }
        
        if(shootingCounter <= 0 && direction ==-1)
        {
            //getWorld().addObject(new pelor2(), getX()+15, getY());
            //setImage("shtb.png");
            shootingCounter = 30;
            return true;
        }
        return false;
    }
    private void checkKeys()
    {
         if (Greenfoot.isKeyDown("a"))
        {
            mundur();
            moveLeft();
        }
         if (Greenfoot.isKeyDown("d") )
        {
            maju();
            moveRight();
        }
         if (Greenfoot.isKeyDown("w") )
        {
            if (onGround())
            {
                jump();
            }
        }
        if (Greenfoot.isKeyDown("s") )
        {
            if(direction == 1){
                setImage("Crouchb.png");
            }
            if(direction == -1){
                setImage("Crouch.png");
            }
        }
        if(Greenfoot.isKeyDown("space")) 
        {
            shooting();
        }
    }    
    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, solidFloors.class);
        if(rightWall == null)
        {
            return false;
        }
        else
        {
            stopByRightWall(rightWall);
            return true;
        }
    }
    public void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 1, getY());
    }
    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, solidFloors.class);
        if(leftWall == null)
        {
            return false;
        }
        else
        {
            stopByLeftWall(leftWall);
            return true;
        }
    }
    public void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 2, getY());
    }
    public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0, yDistance, solidFloors.class);
        if(ceiling != null)
        {
            vSpeed = 1;
            bopHead(ceiling);
            return true;
        }
        else
        {
            return false;
        }
    }
    public void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
    public void jump()
    { 
        //Greenfoot.playSound("jump.wav");
        jumping = true;
        setVSpeed(-jumpStrength);
        fall(); 
    }
    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }
    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 10;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, solidFloors.class);
        if(ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }
    private void checkFall()
    {
        if (onGround()) {
            setVSpeed(0);
        }
        else {
            fall();
        }
    }
}
