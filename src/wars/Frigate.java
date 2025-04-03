package wars;

/**
 *
 * @author Administrator
 */
public class Frigate extends Ship 
{
    private boolean pinnace;
    private int cannons;
    private int cost;
    
    public Frigate(String nme, int skillLevel, String captain, int cannons)
    {
        super(nme, skillLevel, captain, "Frigate", true, true, true);
        pinnace = false;
        this.cannons = cannons;
        cost = 0;
    }
    
    public void setCost()
    {
        int amount = cannons * 10;
        cost = amount;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public void setPinnace(String pin)
    {
       if (pin.equalsIgnoreCase("Yes"))
       {
          pinnace = true;
       } 
       else 
       {
          pinnace = false; 
       }
    }
    
    @Override
    public String toString()
    {
      String report = super.toString();
      report += "Cost of ship: " + cost + "\n";
      report += "Pinnace: " + pinnace + "\n";
      report += "Number of cannons: " + cannons + "\n";
      return report;
    }
}

    
