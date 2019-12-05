import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    World world = new World(220,220);
    //Instantiate a turtle. Name it as you wish.
    Turtle laTortuga = new Turtle(world);

    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___|

    */

    laTortuga.penDown();
    laTortuga.turnRight();
    laTortuga.forward();
    laTortuga.turnLeft();
    laTortuga.forward();
    laTortuga.turnLeft();
    laTortuga.forward();
    laTortuga.turnLeft();
    laTortuga.forward();
    laTortuga.forward();
    laTortuga.turnRight();
    laTortuga.forward();
    laTortuga.turnRight();
    laTortuga.forward();
    laTortuga.turnRight();
    laTortuga.forward();
    laTortuga.forward();
    laTortuga.turnLeft();
    laTortuga.forward();
    laTortuga.turnLeft();
    laTortuga.forward();
    laTortuga.forward();
    laTortuga.turnLeft();
    laTortuga.forward();
    laTortuga.forward();
    laTortuga.turnLeft();
    laTortuga.forward();
    laTortuga.forward();
    laTortuga.turnLeft();
    laTortuga.forward();

      
    


    
    //Finally, set the world to be visible with a boolean. Ex: worldName.setVisible(the proper boolean);
    world.setVisible(true);
  }
}
