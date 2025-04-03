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
    private boolean battle;
    private boolean skirmish;
    private boolean blockade;
   
    public Ship(String nme, int skillLevel, String captain, String type, boolean battle, boolean skirmish, boolean blockade)
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
    
   public boolean battle()
    {
       return battle;
    }

    public boolean skirmish()
    {
        return skirmish;
    }

    public boolean blockade()
    {
        return blockade;
    }
    
    public String toString()
    {
        String s ="";
        s+= "Name of ship: " + name + "\n" + "Name of captain: " + captain
             + "\n" + "Skill Level :" + skillLevel + "\n"
             + "Type of ship: " + type + "\n" + "Battle: " + battle + "\n" + 
            "Skirmish: " + skirmish + "\n" + "Blockade: " + blockade + "\n" state.toString() + "\n";
        return s;
    }
        
    
}
   
  
  
   
   
