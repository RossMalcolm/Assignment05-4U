/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author preej0747
 */
public class Screen {
    //private ints 
    private String direction;
    private String hall;
    private BufferedImage image;
    private boolean cantmove; 
    private String nexthall;

    public Screen(String hall, Scanner input) {
        this.hall = hall;
        
        this.direction = input.next();
        
        String filename = input.next();
        
        this.cantmove = input.nextBoolean();
        
        if(cantmove == false){
            
        }

        //load image file
       try{
            image = ImageIO.read(new File ("pics/" + filename));
        }catch(Exception e){
            e.printStackTrace();
        }
        cantmove = input.nextBoolean();
    }
    
        public int getHall(){
            return hall;
        }
        
}

