/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starfreighter;

import byui.cit260.starFreighter.model.*;

/**
 *
 * @author Joseph
 */
public class StarFreighter 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Game Object
        Game game = new Game();
        
        game.setNoPeople(1);
        
        game.setTotalTime(0.00);
        
        String gameInfo = game.toString();
        
        System.out.println(gameInfo);
        
        //Map Object
        Map map = new Map();
        
        map.setLocation("Paradise!");
        
        String mapInfo = map.toString();
        
        System.out.println(mapInfo);
        
    }
    
}
