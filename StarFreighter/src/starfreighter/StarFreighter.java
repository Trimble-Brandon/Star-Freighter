/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starfreighter;

import byui.cit260.starFreighter.model.*;
import byui.cit260.starFreighter.view.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joseph
 */
public class StarFreighter 
{
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter logFile = null;
    
    private static Job currentJob = null;

    public static Job getCurrentJob() {
        return currentJob;
    }

    public static void setCurrentJob(Job job) {
        StarFreighter.currentJob = job;
    }

    public static Game getCurrentGame() 
    {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) 
    {
        StarFreighter.currentGame = currentGame;
    }

    public static Player getPlayer() 
    {
        return player;
    }

    public static void setPlayer(Player player) 
    {
        StarFreighter.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outfile) {
        StarFreighter.outFile = outfile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader infile) {
        StarFreighter.inFile = infile;
    }    

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        StarFreighter.logFile = logFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            StarFreighter.inFile = new BufferedReader(new InputStreamReader(System.in));
            StarFreighter.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            StarFreighter.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView(); 
            startProgramView.display();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString() + 
                                "\nCause: " + e.getCause() + 
                                "\nMessage " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                if(StarFreighter.inFile != null) {
                    StarFreighter.inFile.close();
                }
                if(StarFreighter.outFile != null) {
                    StarFreighter.outFile.close();
                }
                if (StarFreighter.logFile != null) {
                    StarFreighter.logFile.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(StarFreighter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
