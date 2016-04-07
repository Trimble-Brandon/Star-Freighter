/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.model.Game;
import byui.cit260.starFreighter.model.Ship;
import starfreighter.StarFreighter;

/**
 *
 * @author Brandon
 */
public class LaunchShipView extends View
{
    public LaunchShipView() 
    {
        super("Do you want to Launch the Ship? y/n: ");
    }
    public void launch()
    {
        console.println("\n************************************************************"
                    + "\n*                                                            *"
                    + "\n*                                                  ,:      *"
                    + "\n*                                                 . |      *"
                    + "\n*                                                /  :      *"
                    + "\n*                                             --'  /       *"
                    + "\n*                                           \\/ />/         *"
                    + "\n*                                            / /_\\         *"
                    + "\n*                                         __/   /          *"
                    + "\n*                                         )'-. /           *"
                    + "\n*                                         ./ :\\            *"
                    + "\n*                                          /.' '           *"
                    + "\n*                                        '/'               *"
                    + "\n*                                         +                *"
                    + "\n*                                        '                 *"
                    + "\n*                                      '.                  *"
                    + "\n*                                 .-\"-                     *"
                    + "\n*                                (     |                   *"
                    + "\n*                             . .-'   '.                   *"
                    + "\n*                            ( (.    )8:                   *"
                    + "\n*                        .'    /  (_  )                    *"
                    + "\n*                         _. :(.    )8P '                  *"
                    + "\n*                     .  (  '-' (   '.  .                  *"
                    + "\n*                      .  :  (    .a8a)                    *"
                    + "\n*                     /_'(\"a 'a. )\"'                       *"
                    + "\n*                 (  (/  .  ' )=='                         *"
                    + "\n*                (   (    )  .8\"   +                       *"
                    + "\n*                  (''8a.( _(  (                           *"
                    + "\n*               ..-. '8P    ) ' )    +                     *"
                    + "\n*             -'   (      -ab: )                           *"
                    + "\n*           '    _  '    (8P\"Ya                            *"
                    + "\n*         _(    (    )b  -'.   ) +                         *"
                    + "\n*        ( 8)  (_.aP\" _a   \\(\\  *                          *"
                    + "\n*      +  )/    (8P   (88     ) )                          *"
                    + "\n*         (a:f  \"     '\"      '                            *"
                    + "\n**************************************************************"
                    + "\n*                       | THE END |                          *"
                    + "\n**************************************************************");
    }
    
    public boolean doAction(String value) {
        Game curGame = StarFreighter.getCurrentGame();
        Ship ship = curGame.getShip();
        switch(value)
        {
            case "Y":
                if (ship.getFuelLevel() > 0 
                        && ship.getHull() >= 90 
                        && ship.getEngine() >= 90 
                        && ship.getElectrical() >= 90 
                        && ship.getLifeSupport() >= 90) {
                    this.launch();
                    System.exit(0);
                }
                else
                {
                    System.out.println("\nThe ship is not ready for flight. Please"
                                     + "\nbe sure the repairs are complete.");
                }
            case "N":
                System.out.println("No!");
                return true;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }
    
}
