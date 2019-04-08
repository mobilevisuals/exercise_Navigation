/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pac;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author eyvind
 */
@Named(value = "controller")
@SessionScoped
public class Controller implements Serializable {
    
    private boolean on;
     Random rand;

    /**
     * Creates a new instance of Controller
     */
    public Controller() {
       rand=new Random();
   
    }
    
     public void randomize()
    {
    on=rand.nextBoolean();
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    
    
    
}
