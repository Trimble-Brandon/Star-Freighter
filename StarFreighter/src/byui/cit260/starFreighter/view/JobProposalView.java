/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.InventoryControl;
import byui.cit260.starFreighter.control.JobControl;
import byui.cit260.starFreighter.model.Game;
import byui.cit260.starFreighter.model.Player;
import starfreighter.StarFreighter;

/**
 *
 * @author Joseph
 */
class JobProposalView extends View {
    public JobProposalView() {
        super("Here are the details of the job you selected:"
                + "\nDescription - " + StarFreighter.getCurrentGame().getCurrentJob().getDescription()
                + "\nDifficulty - " + StarFreighter.getCurrentGame().getCurrentJob().getDifficulty()
                + "\nMonitary Compensation - " + StarFreighter.getCurrentGame().getCurrentJob().getCurrencyReward().getQuantity()
                + "\nItem Compensation - " + StarFreighter.getCurrentGame().getCurrentJob().getItemReward().getItemType()
                + "\n\nIf you would like to continue with this job, enter y for yes, else type n or q");
    }

    @Override
    public boolean doAction(String choice) {
        Game curGame = StarFreighter.getCurrentGame();
        Player player = curGame.getPlayer();
        JobControl jc = new JobControl();
        InventoryControl ic = new InventoryControl();
        switch(choice) {
            case "Y":
                player.setExperience(player.getExperience() 
                        + jc.calcExpReward(curGame.getCurrentJob().getDifficulty()));
                ic.addToInventory(curGame.getCurrentJob().getCurrencyReward());
                ic.addToInventory(curGame.getCurrentJob().getItemReward());
                break;
            default:
                break;
        }
        return true;
    }
}
