package wars;

/**
 *
 * @author Administrator
 */
public class Ship {
    private String name;
    private ShipState state;
    private int cost;
    private int skillLevel;
    private String captain;
    private String type;
    private final int cannons;
    
    public Ship(String nme, int skillLevel, String captain, int cannons, int cost, String type)
    {
        name = nme;
        this.skillLevel = skillLevel;
        state = ShipState.RESERVE;
        this.cost = cost;
        this.captain = captain;
        this.type = type;
        this.cannons = cannons;
    }
    
    public String getShipName()
    {
        return name;
    }
    
    public int getSkillLevel()
    {
       return skillLevel; 
    }
    
    public String getCaptain()
    {
        return captain;
    }
    
    public String getType(String type)
    {
        return type;
    }
    
    public void setCostOfShip(String type)
    {
        if (type.equalsIgnoreCase("Man-O-War"))
        {
           if (cannons <=2)
           {
              cost = 300; 
           }
           else
           {
              cost = 500; 
           }
        }
        else if (type.equalsIgnoreCase("Frigate"))
        {
          cost = cannons*10;  
        }
        else if (type.equalsIgnoreCase("Sloop"))
        {
           cost = cost;
        }
        else
        {
           cost = 0; 
        }
    }
    
    public ShipState getShipState()
    {
        return state;
    }
    @Override
    public String toString()
    {
        String s ="";
        s+= "Name of ship: " + name + "\n" + "Name of captain: " + captain + "\n"
             + "Cost of ship: " + cost + "\n" + "Skill Level :" + skillLevel + "\n"
             + "Type of ship: " + type + "\n" + "Number of cannons: " + cannons
             + "\n" + state.toString();
        return s;
    }
        
    
}
