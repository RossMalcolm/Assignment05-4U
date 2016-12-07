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
    private String nextHall;
    private String nextDirection;

    public Screen(String hall, Scanner input) {
        this.hall = hall;

        this.direction = input.next();

        String filename = input.next();

        this.cantmove = input.nextBoolean();

        if (cantmove == false) {
            this.nextHall = input.next();
            this.nextDirection = input.next();
        }

        //load image file
       try{
            image = ImageIO.read(new File ("images/" + filename));
        }catch(Exception e){
            e.printStackTrace();
        }

        input.nextLine();

    }

    public String getHall() {
        return this.hall;
    }

    public String getDirection() {
        return direction;
    }

    public boolean move() {
        return this.cantmove;
    }

    public BufferedImage getImage() {
        return this.image;
    }

    public String getNextHall() {
        return this.nextHall;
    }

    public String getNextDirection() {
        return this.nextDirection;
    }
    
    //test
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Screen s = new Screen("Upstairs1", in);
        System.out.println(s.getHall());
        System.out.println(s.move());
        System.out.println(s.getImage());
        System.out.println(s.getNextDirection() + s.getNextHall());
    }
    
}

    

