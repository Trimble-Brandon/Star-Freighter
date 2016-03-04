/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import java.util.Scanner;

/**
 *
 * @author Brandon
 */
public class LaunchShipView extends View
{
    private String promptMessage; //TODO Make work
    
    public LaunchShipView() {   
        super("\n********************************************************"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                  insert of rocket launch                 *"
              + "\n*                           coming                         *"
              + "\n*                            soon                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n************************************************************");
    }
    
    public boolean doAction(String value) 
    {
        switch(value)
        {
            case "Y":
                System.out.println("Yes!");
                break;
            case "N":
                System.out.println("No!");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
        return false;
    }
}
