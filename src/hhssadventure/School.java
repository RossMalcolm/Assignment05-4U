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
            
            this.initialHall = input.nextLine();
            this.initialDirection = input.nextLine();
            // make the screens 
            // loop to the end of the file
            while(input.hasNext()){
                String hall = input.nextLine();
                for(int i = 0; i < 4; i ++){
                // creating the screen from the scanner
                Screen s = new Screen(hall ,input);
                // add the created screen to the list
                screens.add(s);
                }
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public Screen getScreen(String hall, String direction){
        // go through each screen
        for(Screen s: screens){
            // see if the row and column match
            if(s.getHall().equals(hall)  && s.getDirection().equals(direction)){
                // I found the screen
                return s;
            }
        }
        return null;
    }   
}
