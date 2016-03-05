/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

/**
 *
 * @author Brandon
 */
class GameMenuView extends View
{    
    public GameMenuView() {
        super("\nTesting LocationChooserView. Press Y to continue, N to return");
    }
     
     public boolean doAction(String value) {
        switch(value) {
            case "Y":
                LocationChooserView lChooser = new LocationChooserView();
                lChooser.display();
                break;
            case "N":
                return true;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
        return false;
    }
}
