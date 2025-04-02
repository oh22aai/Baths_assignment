package wars;

/**
 *
 * @author Administrator
 */
public class Man_O_War extends Ship
{
    private int decks;
    private int marines;
    private int cost;
    
    public Man_O_War(String nme, int skillLevel, String captain, int deck, int marine)
    {
        super( nme,skillLevel,captain,"Man-O-War");
        cost = 0;
        decks = deck;
        marines = marine;
    }
    
    
    public void setCost()
    {
      if (decks <= 2)
      {
          cost = 300;
      } 
      else
      {
          cost = 500;
      }
    }
    
    public int getCost()
    {
      return cost;  
    }
    
    
    @Override
    public String toString()
    {
      String report = super.toString();
      report += "Cost of ship: " + cost + "\n";
      report += "Number of decks: " + decks + "\n";
      report += "Number of marines: " + marines + "\n";
      return report;
    }
}
     
