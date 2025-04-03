package wars;

/**
 *
 * @author Administrator
 */
public class Sloop extends Ship 
{
    private boolean doctor;
    private int cost;
    
    public Sloop(String nme, String captain, int cost)
    {
        super (nme, 5, captain,"Sloop", true, true, false);
        this.cost = cost;
        doctor = false;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public void setDoctor(String doc)
    {
       if (doc.equalsIgnoreCase("Yes"))
       {
          doctor = true;
       } 
       else 
       {
          doctor = false; 
       }
    }
    
    
    @Override
    public String toString()
    {
        String report = super.toString();
        report += "Cost of ship: " + cost + "\n";
        report += "Doctor: " + doctor + "\n";
        return report;
    }
    
}

    
