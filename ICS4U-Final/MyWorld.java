import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private guy Guy;
    //amount of change in pixels that moves the hero
    private int changeX, changeY;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 800x450 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        Guy = new guy ();
        addObject(Guy, 400, 300);
    }
    
    public void act(){
        checkKeys();
    }
    
    private void checkKeys()
    {
        changeX= 0;
        changeY = 0;
        if (Greenfoot.isKeyDown("w")) {// if w is pressed
            if (Guy.getY()== 20){ // if the hero is about to pass the border of the game (Y axis, top side)
                changeY = 0;} //don't add anything to the hero's position
            else{

                changeY = changeY - 5;}}//the hero's position is projected to move 5 pixels up
        if (Greenfoot.isKeyDown("s")) {// if s is pressed
            if (Guy.getY()== 580){// if the hero is about to pass the border of the game (Y axis, bottom side)
                changeY = 0;}//don't add anything to the hero's position
            else{
                changeY = changeY + 5;}}//the hero's position is projected to move 5 pixels down
        if (Greenfoot.isKeyDown("a")) {// if a is pressed
            if (Guy.getX()== 50){// if the hero is about to pass the border of the game (X axis, left side)
                changeX = 0;}//don't add anything to the hero's position
            else{
                changeX = changeX - 5;}}//the hero's position is projected to move 5 pixels left
        if (Greenfoot.isKeyDown("d")) {// if d is pressed
            if (Guy.getX()== 780){// if the hero is about to pass the border of the game (X axis, right side)
                changeX = 0;}//don't add anything to the hero's position
            else{
                changeX = changeX + 5;}}//the hero's position is projected to move 5 pixels right
        //guy.moveMe (changeX, changeY); //move the position of the hero by changeX and changeY

    }
    
}
