package wars;

/**
 *
 * @author Administrator
 */
public class Encounter 
{
    private static int counter = 0;
    private final int e_Number;
    private String e_Type;
    private int e_Level;
    private String e_Location;
    private int e_Prize;
    
    public Encounter(String type, int skillLevel, String location, int prize)
    {
        e_Number = ++counter;
        e_Type = type;
        e_Level = skillLevel;
        e_Location = location;
        e_Prize = prize;
    }
    
    public int getE_Number()
    {
        return e_Number;   
    }
    
    public String getE_Type()
    {
        return e_Type;
    }
    
    public int getE_Level()
    {
        return e_Level;
    }
    
    public String getE_Location()
    {
        return e_Location;
    }
    
    public int getE_Prize()
    {
        return e_Prize;
    }
    
    
}
