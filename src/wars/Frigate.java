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
    
    public Frigate(String nme, int skillLevel, String captain,int cost, boolean pinnace, int cannons)
    {
        super (nme, skillLevel, captain, 0, "Frigate");
        pinnace = false;
        this.cannons = cannons;
    }
    
    public void setCost(int amount)
    {
        cost = cannons * 10;
    }
    
    @Override
    public String toString()
    {
      String report = super.toString();
      report += "Pinnace: " + pinnace + "\n";
      report += "Number of cannons: " + cannons + "\n";
      return report;
    }
}
