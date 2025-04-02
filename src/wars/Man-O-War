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
    
    public Man_O_War(String nme, int skillLevel, String captain,int cost, int deck, int marine)
    {
        super( nme,skillLevel,captain, 0 , "Man-O-War");
        decks = deck;
        marines = marine;
    }
    
    public void setCost(int amount)
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
    @Override
    public String toString()
    {
      String report = super.toString();
      report += "Number of decks: " + decks + "\n";
      report += "Number of marines: " + marines + "\n";
      return report;
    }
}
