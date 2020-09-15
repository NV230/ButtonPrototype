import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    
    private boolean clicked;
    
    
    
    private GreenfootImage button_period_2 = new GreenfootImage("period-2.jpg");
    private GreenfootImage button_period_3 = new GreenfootImage("period-3.jpg");
        
    
    public Button(int r, int s) {
        int myRow=r;
        int mySeat=s;
    }
    public Button() {
        int myRow=5;
        int mySeat=5;
        //setImage(button_period_2);
        clicked = false;
        
        
    }
    
    public void togglePeriod() {
        if (getImage() == button_period_2) {
            setImage(button_period_3);
            ((Classroom)getWorld()).setPeriod(3);
        }
        else if (getImage() == button_period_3) {
            setImage(button_period_2);
            ((Classroom)getWorld()).setPeriod(2);
        }
        
    }
    
    public void act() 
    {
       
       if (Greenfoot.mousePressed(this)){
            setImage(button_period_3);
            togglePeriod();
           
        }
        if (Greenfoot.mouseClicked(this)){
            setImage(button_period_2);
            togglePeriod();
        }
       
    }
}
