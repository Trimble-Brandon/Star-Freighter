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
public class SaveMenuView 
{
    private final String menu;
    private final String saveGameText;
    private final String loadGameText;
    private final String backText;
    private final String quit2MainText;
    
    public SaveMenuView() 
    {
        this.menu = "\n"
                    + "\n--------------------------------------------------------------"
                    + "\n| Save Menu                                                  |"
                    + "\nS - Save game                                                |"
                    + "\nL - Load game                                                |"
                    + "\nB - Back to game menu                                        |"
                    + "\nQ - Quit to main menu                                        |"
                    + "\n--------------------------------------------------------------";

        this.saveGameText = "\nSave game has been called";
        this.loadGameText = "\nLoad game has been called";
        this.backText = "\nBack to game menu has been called";
        this.quit2MainText = "\nQuit to main menu has been called";
    }
    
    public void displayMenu() 
    {
        boolean done = false;
        do {
            System.out.println(menu);
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) 
            {
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    public String getMenuOption() 
    {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        
        boolean valid = false;
        while(!valid)
        {
            System.out.println("Select menu item");
            value = keyboard.nextLine().toUpperCase();
            value = value.trim();
            
            if(value.length() < 1)
            {
                System.out.println("What you have entered is invalid."
                        + "\nPlease try again");
                continue;
            }
            valid = true;
        }
        return value;
    }

    private boolean doAction(String menuOption) 
    {
        switch(menuOption)
        {
            case "S":
                this.displayInfo(saveGameText);
                break;
            case "L":
                this.displayInfo(loadGameText);
                break;
            case "B":
                this.displayInfo(backText);
                break;
            case "Q":
                this.displayInfo(quit2MainText);
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
        return false;
    }
    
    private void displayInfo(String text) 
    {
        System.out.println(text);
        System.out.println("\n\nPress Enter to go to help menu");
        
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
    }
    
}
