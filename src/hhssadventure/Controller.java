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

    public Controller(GUI gui, School school) {
    this.gui = gui;
    this.school = school;
    this.direction = school.getInitialDirection();
    this.hall = school.getInitialHall();
    
    gui.setController(this);
    
    Screen start = school.getScreen(hall, direction);
    gui.setImage(start.getImage());
    }

    public void goNorth(){
    Screen current = school.getScreen(hall, direction);
    //ask if we can go north
    if(current.cantmove() == false && direction.equals("N")){              
    Screen newScreen = school.getScreen(hall, direction);
    gui.setImage(newScreen.getImage());
    }
}
    }

