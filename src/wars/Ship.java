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
   
    public Ship(String nme, int skillLevel, String captain,int cost, String type)
    {
        name = nme;
        this.skillLevel = skillLevel;
        state = ShipState.RESERVE;
        this.cost = cost;
        this.captain = captain;
        this.type = type;
         
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
    
    public int getCost()
    {
        return cost;
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
             + "Type of ship: " + type + "\n" + "\n" + state.toString() + "\n";
        return s;
    }
        
    
}
    
  
   
   
