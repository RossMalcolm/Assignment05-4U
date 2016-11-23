/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author preej0747
 */
public class Screen {
    //private ints 
    private String direction;
    private String room;
    private int floor;
    private BufferedImage image;
    private boolean north;
    private boolean east;
    private boolean south;
    private boolean west;
    private boolean canMoveForward;

    public Screen(Scanner input) {

        //scan in the image name
        String imageName = input.next();

        //make arrays to get room and direction you are facing
        
        //room
        String[] room = 
        
        //direction
        String[] direction = 
                
        //load image file
        try {
            File file = new File("file.txt");
            Scanner s = new Scanner(file);
            while (s.hasNext()) {
                System.out.println(s.nextInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //get directions
        canMoveForward = input.nextBoolean();

        //move to next line
        input.nextLine();
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
