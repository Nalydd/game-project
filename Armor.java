/**
 * Creates a base armor object to be inherited and modified
 * by other classes in the package
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 * Contributors: Seth Gilstrap
 */
public class Armor extends Equipment
{
	private int armorBonus;
	private boolean iceProtection;
	private boolean fireProtection;

	
	/**
	 * Parameterized constructor for Armor object        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public Armor(int newArmorBonus, boolean ice, boolean fire)
	{
		super Equipment("Armor", 150, .8);
		armorBonus = newArmorBonus;
		iceProtection = ice;
		fireProtection = fire;
	}//end Armor
	
	/**
	 * Enter getter for Armor name       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public String getName()
	{
		String n = Equipment.getName();
		if(iceProtection == true && fireProtection == true)
			n += " of Environmental Protection";
		if(iceProtection == true && fireProtection == false)
			n += " of Ice Protection";
		if(iceProtection == false && fireProtection == true)
			n += " of Fire Protection";
		return n;
	}//end getName
	
	/**
	 * Getter for Armor's Armor modifier     
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int getArmorBonus()
	{
		return armorBonus;
	}//end getArmorBonus
	
	/**
	 * Getter for armor's ice protection    
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public boolean hasIceProtection()
	{
		return iceProtection;
	}//end hasIceProtection
	
	/**
	 * Getter for armor's fire protection        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public boolean hasFireProtection()
	{
		return fireProtection;
	}//end hasFireProtection
	
	/**
	 * set's armor's ice protection to true       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void activateIceProtection()
	{
		iceProtection = true;
	}//end activateIceProtection
	
	/**
	 * set armor's fire protection to true      
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void activateFireProtection()
	{
		fireProtection = true;
	}//end activateFireProtection
	
	/**
	 * sets armor's ice protection to false     
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void deactivateIceProtection()
	{
		iceProtection = false;
	}//end deactiveIceProtection
	
	/**
	 * sets armor's fire protection to false        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void deactivateFireProtection()
	{
		fireProtection = false;
	}//end deactivateFireProtection
	
	/**
	 * toString method for Armor object        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public String toString()
	{
		return ("{name:\"" + getName() + "\" , price:" + getPrice() + "durability:\"" + getDurabilityStatus() +
						"ice:" + iceProtection +", fire:" + fireProtection +"}");
	}//end toString
}//end Armor.java