package wars;

/**
 *
 * @author Administrator
 */
public class Man_O_War extends Ship
{
    private int marines;
    
    
    public Man_O_War(String nme, int skillLevel, String captain, int deck, int marine)
    {
        super( nme,skillLevel,captain,"Man-O-War",true, false,true, 0, deck,0);
        marines = marine;
    }
    
    
    public void setCost()
    {
        super.setCost("Man-O-War");
    }
    
    
    
    
    @Override
    public String toString()
    {
      String report = super.toString();
      report += "Number of marines: " + marines + "\n";
      return report;
    }
}  
