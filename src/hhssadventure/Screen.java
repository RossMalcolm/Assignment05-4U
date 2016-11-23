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

    //contructors
    public int getRoom() {
        return room;
    }

    public int getFloor() {
        return floor;
    }

    public boolean canMoveForward() {
        return canMoveForward;
    }

    public BufferedImage getImage() {
        return image;
    }

    //test
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Screen s = new Screen(in);

        System.out.println(s.getRoom());
        System.out.println(s.getFloor());
        System.out.println(s.canMoveForward());
        System.out.println(s.getImage());
    }
}
