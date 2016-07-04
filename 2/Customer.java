/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Khamchand Saha
 */
public class Customer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bank s1 = new Bank();
        float interest;
        s1.setDepositeAmt(1000);
        interest = s1.getInterest();
        System.out.println("Total interest in Deposite amount for 1 year: "+interest);
    }
    
}
