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
    private boolean battle ;
    private boolean skirmish ;
    private boolean blockade ;
    private int cost;
    private int decks;
    private int cannons;
   
    public Ship(String nme, int skillLevel, String captain, String type, boolean battle, boolean skirmish, boolean blockade,int cost, int decks, int cannons)
    {
        name = nme;
        this.skillLevel = skillLevel;
        state = ShipState.RESERVE;
        this.captain = captain;
        this.type = type;
        this.battle = battle;
        this.skirmish = skirmish;
        this.blockade = blockade;
        this.cost = cost;
        this.decks = decks;
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
    
    
    public ShipState getShipState()
    {
        return state;
    }
    
    public boolean getBattle()
    {
        return battle;
    }
    
    public boolean getSkirmish()
    {
        return skirmish;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public boolean getBlockade()
    {
        return blockade;
    }
    
    public void setCost(String type)
    {
        if(type.equalsIgnoreCase("Man-O-War"))
        {
            if(decks <= 2)
            {
                cost = 300;
            }
            else
            {
                cost = 500;
            }
        }
        
        else if(type.equalsIgnoreCase("Frigate"))
        {
            int amount = cannons * 10;
            cost = amount;
        }
        
        else if(type.equalsIgnoreCase("Sloop"))
        {
            cost = cost;
        }
        
        else
        {
            cost = 0;
        }
    
    
    
    
    }
        
    
    public String toString()
    {
        String s ="";
        s+= "Name of ship: " + name + "\n" + "Name of captain: " + captain
             + "\n" + "Skill Level :" + skillLevel + "\n"
             + "Type of ship: " + type + "\n" + "Battle: " + battle + "\n" + 
                "Skirmish: " + skirmish + "\n" + "Blockade: " + blockade + "\n" + "Cost: " + cost + "\n" + 
                state.toString() + "\n";
        return s;
    }
        
    
}
   
  
  
   
   
