/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.exceptions;

/**
 *
 * @author Joseph
 */
public class TravelControlException extends Exception {
    public TravelControlException() {
    }

    public TravelControlException(String string) {
        super(string);
    }

    public TravelControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public TravelControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public TravelControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
}
