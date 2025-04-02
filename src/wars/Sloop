package wars;

/**
 *
 * @author Administrator
 */
public class Sloop extends Ship 
{
    private boolean doctor;
    
    public Sloop(String nme, String captain,int cost,  boolean doc)
    {
        super (nme, 5, captain, cost,"Sloop");
        doctor = false;
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
        report += "Doctor: " + doctor + "\n";
        return report;
    }
    
}
