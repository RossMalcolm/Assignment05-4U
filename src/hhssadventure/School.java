/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author farrb0382
 */
public class School {
    
    private ArrayList<Screen> screens;
    private String initialHall;
    private String initialDirection;
    
    public School(String fileName){
        try {
            // make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            
            this.initialHall = input.next();
            this.initialDirection = input.next();
             
            // make the screens 
            // loop to the end of the file
            while(input.hasNext()){
                // creating the screen from the scanner
                Screen s = new Screen("Upstairs1",input);
                // add the created screen to the list
                screens.add(s);
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
