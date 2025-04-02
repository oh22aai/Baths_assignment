package wars;

/**
 *
 * @author Administrator
 */
public class Ship {
    private String name;
    private ShipState state;
    private int skillLevel;
    private String captain;
    private String type;
   
    public Ship(String nme, int skillLevel, String captain, String type)
    {
        name = nme;
        this.skillLevel = skillLevel;
        state = ShipState.RESERVE;
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
    
    
    public ShipState getShipState()
    {
        return state;
    }
    
    public void changeState()
    {
        
    }
    
    public String toString()
    {
        String s ="";
        s+= "Name of ship: " + name + "\n" + "Name of captain: " + captain
             + "\n" + "Skill Level :" + skillLevel + "\n"
             + "Type of ship: " + type + "\n" + state.toString() + "\n";
        return s;
    }
        
    
}
   
  
  
   
   
