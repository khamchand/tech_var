/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khamchand Saha
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Saving s1 = new Saving();
        s1.setSatartCont(1000);
        s1.setNoOfYears(3);
        float closing_amt;
        closing_amt = s1.getClosingAmt();
        System.out.println("Closing Amount = "+closing_amt);
        
    }
    
}
