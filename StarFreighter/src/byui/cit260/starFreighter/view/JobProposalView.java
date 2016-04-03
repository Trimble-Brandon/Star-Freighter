/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.model.Job;

/**
 *
 * @author Joseph
 */
class JobProposalView extends View {
    public JobProposalView(Job job) {
        super("Here are the details of the job you selected:"
                + "\nDescription - " + job.getDescription()
                + "\nDifficulty - " + job.getDifficulty()
                + "\nMonitary Compensation - " + job.getCurrencyReward()
                + "\nItem Compensation - " + job.getItemReward()
                + "\n\nIf you would like to continue with this job, enter y for yes, else type n or q");
    }

    @Override
    public boolean doAction(String choice) {
        switch(choice) {
            case "Y":
                //was adding experience/making things work
                break;
            default:
                break;
        }
        return true;
    }
}
