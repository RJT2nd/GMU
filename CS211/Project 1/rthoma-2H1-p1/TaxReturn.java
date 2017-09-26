/**
 * Class TaxReturn is used to determine the tax amount for a person.
 * The original U.S. income tax table of 1913 is applied.
 * 
 * @author
 * @version
 */
public class TaxReturn
{
   
  /**
   * Method used to calculate the tax.
   * 
   * @param anIncome the income of an individual 
   * @return the tax amount
   */
    public double computeTax(double anIncome)
    {
        double taxTotal;

        if(anIncome >= 500000) // Top Tax Bracket; Income >= $500,000
            taxTotal = (anIncome - 500000) * 0.06 + 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04 + 250000 * 0.05;
        else if(anIncome >= 250000) // Income < $500,000 but >= $250,000
            taxTotal = (anIncome - 250000) * 0.05 + 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04;
        else if(anIncome >= 100000) // Income < $250,000 but >= $100,000
            taxTotal = (anIncome - 100000) * 0.04 + 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03;
        else if(anIncome >=  75000) // Income < $100,000 but >= $75,000
            taxTotal = (anIncome -  75000) * 0.03 + 50000 * 0.01 + 25000 * 0.02;
        else if(anIncome >=  50000) // Income < $75,000 but >= $50,000
            taxTotal = (anIncome -  50000) * 0.02 + 50000 * 0.01;
        else // Bottom Tax Bracket; Income < $50,000
            taxTotal = anIncome * 0.01;
        
        return taxTotal;
    }
}
