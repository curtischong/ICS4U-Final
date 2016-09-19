import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class guy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class guy extends Actor
{
    private MyWorld world;
    /**
     * Act - do whatever the guy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }    
    
    public void moveMe (int xMove, int yMove)//moves the hero
    {
        setLocation (getX()+ xMove, getY() + yMove);
       
       } 
}
