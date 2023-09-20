import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ikan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ikan extends Actor
{
    /**
     * Act - do whatever the ikan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTrun();
        eat();
    }
    
    public void moveAndTrun()
    {
        move(2);
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void eat()
    {
        Actor pizza;
        pizza = getOneObjectAtOffset(0,0,pizza.class);
        if(pizza != null)
        {
            World world;
            world = getWorld();
            world.removeObject(pizza);
        }
    }
}
