/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author malcr1272
 */
public class Image extends JComponent {
    private BufferedImage image;
    
    public Image(){
        image = null;
    }
    
    @Override
    public void paintComponent(Graphics g){
        if (image != null){
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
    
    public void setImage(BufferedImage img){
        image = img;
        repaint(); // so we can see the change
    }    
}


