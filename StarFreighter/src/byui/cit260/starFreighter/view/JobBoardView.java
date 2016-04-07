/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.JobControl;
import byui.cit260.starFreighter.exceptions.JobControlException;
import byui.cit260.starFreighter.model.Game;
import byui.cit260.starFreighter.model.InventoryItem;
import byui.cit260.starFreighter.model.Job;
import byui.cit260.starFreighter.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;
import starfreighter.StarFreighter;

/**
 *
 * @author Joseph
 */
public class JobBoardView extends View {
    private String description;
    private int difficulty;
    private InventoryItem currencyReward;
    private InventoryItem itemReward;
    
    public JobBoardView() {
        super("\n"
                + "\n----------------------------------------------------------"
                + "\n|  Available Jobs  |                                      |"
                + "\n1  - Body work apprentice                                 |"
                + "\n2  - Electrition apprentice                               |" 
                + "\n3  - Mechanic apprentice                                  |"
                + "\n4  - physisists apprentice                                |"  
                + "\n----------------------------------------------------------|"
                + "\n5  - Body work intermediate                               |"
                + "\n6  - Electrition intermediate                             |" 
                + "\n7  - Mechanic intermediate                                |"
                + "\n8  - physisist intermediate                               |"  
                + "\n----------------------------------------------------------|"
                + "\n9  - Body work master                                     |"
                + "\n10 - Electrition master                                   |" 
                + "\n11 - Mechanic master                                      |"
                + "\n12 - physisist master                                     |" 
                + "\n----------------------------------------------------------|");
    }
     
    public boolean doAction(String value) {
        try {
            JobControl jc = new JobControl();
            Game curGame = StarFreighter.getCurrentGame();
            Player p = curGame.getPlayer();
            switch(value) {
                case "1":
                    description = "Beginner body work, repairing dents and scrapes in ships";
                    difficulty = jc.calcCorrectDiff(5, p.getHullSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setHullSkill(p.getHullSkill() + 1);
                    break;
                case "2":
                    description = "Beginner electrical work, repairing faulty wiring";
                    difficulty = jc.calcCorrectDiff(5, p.getElectricalSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setElectricalSkill(p.getElectricalSkill() + 1);
                    break;
                case "3":
                    description = "Beginner mechanical work, repairing failing actuators";
                    difficulty = jc.calcCorrectDiff(5, p.getMechanicalSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setMechanicalSkill(p.getMechanicalSkill() + 1);
                    break;
                case "4":
                    description = "Beginner physisist work, repairing faulty food synthesizers";
                    difficulty = jc.calcCorrectDiff(5, p.getLifeSupportSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setLifeSupportSkill(p.getLifeSupportSkill() + 1);
                    break;
                case "5":
                    description = "intermediate body work, weilding new sections";
                    difficulty = jc.calcCorrectDiff(10, p.getHullSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setHullSkill(p.getHullSkill() + 2);
                    break;
                case "6":
                    description = "intermediate electrical work, rewiring ships";
                    difficulty = jc.calcCorrectDiff(10, p.getElectricalSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setElectricalSkill(p.getElectricalSkill() + 2);
                    break;
                case "7":
                    description = "intermediate mechanical work, rebuilding cargo lifts";
                    difficulty = jc.calcCorrectDiff(10, p.getMechanicalSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setMechanicalSkill(p.getMechanicalSkill() + 2);
                    break;
                case "8":
                    description = "intermediate physisist work, fixing artificial gravity and life support";
                    difficulty = jc.calcCorrectDiff(10, p.getLifeSupportSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setLifeSupportSkill(p.getLifeSupportSkill() + 2);
                    break;
                case "9":
                    description = "master body work, fabricating hulls";
                    difficulty = jc.calcCorrectDiff(20, p.getHullSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setHullSkill(p.getHullSkill() + 3);
                    break;
                case "10":
                    description = "master electrical work, designing wiring harnesses";
                    difficulty = jc.calcCorrectDiff(20, p.getElectricalSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setElectricalSkill(p.getElectricalSkill() + 3);
                    break;
                case "11":
                    description = "master mechanical work, fine tuning navigational thrusters";
                    difficulty = jc.calcCorrectDiff(20, p.getMechanicalSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setMechanicalSkill(p.getMechanicalSkill() + 3);
                    break;
                case "12":
                    description = "master physisist work, researching hyperdrive";
                    difficulty = jc.calcCorrectDiff(20, p.getLifeSupportSkill());
                    currencyReward = jc.calcCurrencyReward(difficulty);
                    itemReward = jc.calcItemReward(difficulty);
                    p.setLifeSupportSkill(p.getLifeSupportSkill() + 2);
                    break;
                default:
                    this.console.println("Invalid selection. Please try again.");
                    return false;
            }
            Job job = new Job(description, difficulty, currencyReward, itemReward);
            StarFreighter.getCurrentGame().setCurrentJob(job);
            JobProposalView jpv = new JobProposalView();
            jpv.display();
            return true;
        } catch (JobControlException ex) {
            Logger.getLogger(JobBoardView.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
