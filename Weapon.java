/**
 * ---------------------------------------------------------------------------
 * File name: Weapon.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko, zelaskod@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * Contributors: Dylan Colburn
 * ---------------------------------------------------------------------------
 */


/**
 * Contains attributes of and methods to manipulate virtual weapons
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class Weapon extends Equipment
{
	private int normalDamage;
	private int iceDamage;
	private int fireDamage;
	WeaponHandedness weaponhand;
	
	/**
	 * Paramterized constructor for weapon        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public Weapon(String name, int dmg, int ice, int fire, WeaponHandedness wp)
	{
		super Equipment(name, 75, .6);
		normalDamage = dmg;
		iceDamage = ice;
		fireDamage = fire;
		weaponhand = wp;
	}//end Weapon
	
	/**
	 * returns name from Equipment object modified with the proper prefixes
	 * from damage attributes        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public String getName()
	{
		String n = Equipment.getName ( );
		if(iceDamage > 0 && fireDamage > 0 && (iceDamage + fireDamage) < 7)
			n += " of Wrath";
		if(iceDamage > 0 && fireDamage > 0 && (iceDamage + fireDamage) > 6)
			n += " of Mighty Wrath";
		if(iceDamage > 0 && fireDamage < 1)
			n += " of Ice";
		if(iceDamage < 1 && fireDamage > 0)
			n += " of Fire";
		return n;
	}//end getName
	
	/**
	 * getter for normalDamage      
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int getNormalDamage()
	{
		return normalDamage;
	}//end getNormalDamage
	
	/**
	 * getter for iceDamage         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int getIceDamage()
	{
		return iceDamage;
	}//end GetIceDamage
	
	/**
	 * getter for FireDamage        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int getFireDamage()
	{
		return fireDamage;
	}//end getFireDamage
	
	/**
	 * getter for weaponhandedness of weapon        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public WeaponHandedness getWeaponHandedness()
	{
		return weaponhand;
	}//end
	
	/**
	 * setter for normal damage        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void setNormalDamage(int dmg)
	{
		normalDamage = dmg;
	}//end setNormalDamage
	
	/**
	 * setter for iceDamage
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void setIceDamage(int dmg)
	{
		iceDamage = dmg;
	}//end setIceDamage
	
	/**
	 * setter for fire Damage         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void setFireDamage(int dmg)
	{
		fireDamage = dmg;
	}//end setFireDamage
	
	/**
	 * setter for weaponhandedness         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void setWeaponHandedness(WeaponHandedness wp)
	{
		weaponhand = wp;
	}//end setWeaponHandedness
	
	/**
	 * toString for Weapon object        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public String toString()
	{
		return ("{name:\"" + getName() + "\", price:"+ getPrice() +
					", durability:\"" + getDurabilityStatus() + 
					", normal:" + normalDamage+ ", ice:" +
					iceDamage + ", fire:" + fireDamage + 
					", weaponHandedness:\"" + weaponhand +
					"\"}");
	}//end toString
}//end Weapon.java
