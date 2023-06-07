
package souza_joshua_pe6;


public class Souza_Joshua_PE6 {

   
    public static void main(String[] args) {
    double from = 50000;   //Minimum Income
    double to = 70000;     //Maximum Income
    double interval = 100; //Interval, increase 100 each time.
    
    //Header
    System.out.println("\nTaxable      Single      Married Joint      Married       Head of\n"
                       + "Income                   or Qualifying      Separate      a House\n"
                       + "                         Widow(er)\n" +
                        "-------------------------------------------------------------------- ");
    
    //Data
    for (double taxableIncome = from; taxableIncome <= to; taxableIncome += interval){
        System.out.printf("%6.0f       ",taxableIncome);
        System.out.printf("%-12d", Math.round(computeTax(0, taxableIncome)));
        System.out.printf("%-19d", Math.round(computeTax(1, taxableIncome)));
        System.out.printf("%-14d", Math.round(computeTax(2, taxableIncome)));
        System.out.printf("%-10d\n", Math.round(computeTax(3, taxableIncome)));
    }
    }
    //Compute Tax
    public static double computeTax(int status, double taxableIncome){
        double tax, taxRate, incomeTaxed, incomeUntaxed, tax15, tax25, tax28, tax33, tax35;
        tax = 0.0;
        taxRate = 0.0; 
        incomeTaxed = 0.0; 
        incomeUntaxed = 0.0; 
        tax15 = 0.0; 
        tax25 = 0.0;
        tax28 = 0.0;
        tax33 = 0.0;
        tax35 = 0.0;
        
        //Determine the range that each tax will be operating
        switch (status){
            case 0:
                     tax15 = 8351;
                     tax25 = 33951;
                     tax28 = 82251;
                     tax33 = 171551;      
                     tax35 = 372951;
                     break;
            case 1:
                     tax15 = 16701;
                     tax25 = 67901;
                     tax28 = 137051;
                     tax33 = 208851;      
                     tax35 = 372951;
                     break;
            case 2:
                     tax15 = 8351;
                     tax25 = 33951;
                     tax28 = 68526;
                     tax33 = 104426;      
                     tax35 = 186476;
                     break;
            case 3: 
                     tax15 = 11951;
                     tax25 = 45501;
                     tax28 = 117451;
                     tax33 = 190201;      
                     tax35 = 372951;
                
        }
        //Compute tax
        while (taxableIncome >= tax15){
            
            if (taxableIncome >= tax35){
                taxRate = 0.35;
                incomeUntaxed = tax35 - 1; 
            } 
            else if (taxableIncome >= tax33){
                taxRate = 0.30;
                incomeUntaxed = tax33 - 1; 
            } 
            else if (taxableIncome >= tax28){
                taxRate = 0.28;
                incomeUntaxed = tax28 - 1; 
            }
            else if (taxableIncome >= tax25){
                taxRate = 0.25;
                incomeUntaxed = tax25 - 1; 
            } 
            else if (taxableIncome >= tax15){
                taxRate = 0.15;
                incomeUntaxed = tax15 - 1; 
            } 
            
            tax += (incomeTaxed = taxableIncome - incomeUntaxed) * taxRate;
            taxableIncome -= incomeTaxed;
        }
        return tax += taxableIncome * 0.10;
    }
}
