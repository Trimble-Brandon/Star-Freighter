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
public class LaunchShipView extends View
{
    public static void promptMessage()
    {
        System.out.println("Do you want to Launch the Ship? y/n: ");
    }
    
    public boolean doAction(String value) 
    {
        switch(value)
        {
            case "Y":
                this.LaunchShipView();
                break;
            case "N":
                LocationChooserView.LocationChooserView();
                break;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }

    private LaunchShipView() 
    {
        super("\n**************************************************************"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n*                  insert of rocket launch                   *"
            + "\n*                           coming                           *"
            + "\n*                            soon                            *"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n*                                                            *"
            + "\n**************************************************************");
    }
    
}
