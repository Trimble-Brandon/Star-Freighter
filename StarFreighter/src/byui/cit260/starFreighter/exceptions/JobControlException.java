/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.exceptions;

/**
 *
 * @author Brandon
 */
public class JobControlException extends Exception
{
    public JobControlException() 
    {
        
    }

    public JobControlException(String message) 
    {
        super(message);
    }

    public JobControlException(String message, Throwable cause) 
    {
        super(message, cause);
    }

    public JobControlException(Throwable cause) 
    {
        super(cause);
    }

    public JobControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) 
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
