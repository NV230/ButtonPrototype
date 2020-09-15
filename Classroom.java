import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Classroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   
     private void prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.

        /* Example */
        NibodhVallapureddy NibodhVallapureddy = new NibodhVallapureddy("Nibodh", "Vallapureddy", 1, 1);
        addObject(NibodhVallapureddy, 1, 1);
        NibodhVallapureddy.sitDown();
         
        YashBansal YashBansal = new YashBansal("Yash", "Bansal", 1, 2);
        addObject(YashBansal, 1, 2);
        YashBansal.sitDown();
        
        TameemSaydi TameemSaydi = new TameemSaydi("Tameem", "Saydi", 3, 2);
        addObject(TameemSaydi, 3, 2);
        TameemSaydi.sitDown();


    }  
}
