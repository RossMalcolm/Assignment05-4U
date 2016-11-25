/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author malcr1272
 */
public class Controller {

    private GUI gui;
    private School school;
    private String hall;
    private String direction;

    public Controller(GUI gui, School school, String direction, String hall) {
    this.gui = gui;
    this.school = school;
    this.direction = direction;
    this.hall = hall;
    
    gui.setController(this);
    
    Screen start = school.
    }
}