/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khamchand Saha
 */
public class Bank {
    private int depo_amt;
    
    public void setDepositeAmt(int a)
    {
        depo_amt = a;
    }
    public int getDepositeAmt()
    {
        return depo_amt;
    }
    public float getInterest()
    {
        float interest;
        if(depo_amt<1000)
        {
            interest = 4*depo_amt/100;
        }
        else if(depo_amt<5000)
        {
            interest = (float)4.5*depo_amt/100;
        }
        else
        {
            interest = 5*depo_amt/100;
        }
        return interest;
        
    }
    
}
