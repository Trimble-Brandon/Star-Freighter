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
        super("\nTesting LocationChooserView, ShopMenuView. "
                + "\nEnter L for LocationChooserView, "
                + "\nEnter S for ShopMenuView,"
                + "\nEnter N to return");
    }
     
     public boolean doAction(String value) {
        switch(value) {
            case "L":
                LocationChooserView lChooser = new LocationChooserView();
                lChooser.display();
                break;
            case "S":
                ShopMenuView sMenu = new ShopMenuView();
                sMenu.display();
                break;
            case "N":
                return true;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
        return false;
    }
}
