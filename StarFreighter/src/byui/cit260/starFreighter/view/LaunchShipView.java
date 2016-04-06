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
    public LaunchShipView() 
    {
        super("Do you want to Launch the Ship? y/n: ");
    }
    public void launch()
    {
        console.println("\n************************************************************"
                    + "\n*                                                            *"
                    + "\n*                                                    ,:      *"
                    + "\n*                                                   . |      *"
                    + "\n*                                                  /  :      *"
                    + "\n*                                               --'  /       *"
                    + "\n*                                             \\/ />/        *"
                    + "\n*                                              / /_\\        *"
                    + "\n*                                           __/   /          *"
                    + "\n*                                           )'-. /           *"
                    + "\n*                                           ./ :\\           *"
                    + "\n*                                            /.' '           *"
                    + "\n*                                          '/'               *"
                    + "\n*                                           +                *"
                    + "\n*                                          '                 *"
                    + "\n*                                        '.                  *"
                    + "\n*                                   .-\"-                    *"
                    + "\n*                                  (     |                   *"
                    + "\n*                               . .-'   '.                   *"
                    + "\n*                              ( (.    )8:                   *"
                    + "\n*                          .'    /  (_  )                    *"
                    + "\n*                           _. :(.    )8P '                  *"
                    + "\n*                       .  (  '-' (   '.  .                  *"
                    + "\n*                        .  :  (    .a8a)                    *"
                    + "\n*                       /_'(\"a 'a. )\"'                     *"
                    + "\n*                   (  (/  .  ' )=='                         *"
                    + "\n*                  (   (    )  .8\"   +                      *"
                    + "\n*                    (''8a.( _(  (                           *"
                    + "\n*                 ..-. '8P    ) ' )    +                     *"
                    + "\n*               -'   (      -ab: )                           *"
                    + "\n*             '    _  '    (8P\"Ya                           *"
                    + "\n*           _(    (    )b  -'.   ) +                         *"
                    + "\n*          ( 8)  (_.aP\" _a   \\(\\  *                       *"
                    + "\n*        +  )/    (8P   (88     ) )                          *"
                    + "\n*           (a:f  \"     '\"      '                          *"
                    + "\n**************************************************************"
                    + "\n*                       | THE END |                          *"
                    + "\n**************************************************************");
    }
    
    public boolean doAction(String value) 
    {
        switch(value)
        {
            case "Y":
                this.launch();
                return true;
            case "N":
                System.out.println("No!");
                return false;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }
    
}
