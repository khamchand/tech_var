/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khamchand Saha
 */
public class Saving {
    private int start_cont;
    private int no_of_years;
    private float yearly_cont;
    private float amt_elg_for_interest;
    private float interest;
    private float closing_amt;
    
    public void setSatartCont(int a)
    {
        start_cont = a;
    }
    public void setNoOfYears(int b)
    {
        no_of_years = b;
    }
    public float getClosingAmt()
    {
        int year;
        float monthly_cont;
        monthly_cont = start_cont;
        year = no_of_years;
        yearly_cont = 0;
        interest = 0;
        closing_amt=0;
        while(year>0)
        {
            yearly_cont =12*monthly_cont;
            monthly_cont = monthly_cont+(monthly_cont/10);
            amt_elg_for_interest = closing_amt + yearly_cont;
            interest = amt_elg_for_interest*9/100;
            closing_amt = amt_elg_for_interest+interest;
            
            year--;
        }
        return closing_amt;
    }
    
}
