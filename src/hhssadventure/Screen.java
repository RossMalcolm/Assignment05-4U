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
    private int direction;
    private int room;
    private BufferedImage image;
    private boolean canMoveForward;

    public Screen(Scanner input) {

        //scan in the image name
        String imageName = input.next();

        //split string to get direction and room
        String[] split = imageName.split(" ");

        //save room
        room = Integer.parseInt(split[0]);

        //save direction
        direction = Integer.parseInt(split[1]);

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
    
        public int getRoom(){
            return room;
        }
        
}

