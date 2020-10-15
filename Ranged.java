/**
 * ---------------------------------------------------------------------------
 * File name: Ranged.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * ---------------------------------------------------------------------------
 */

package game;


/**
 * Allows for creation of ranged weapons that extend weapon class.
 * Also allows for manipulation of these objects.
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class Ranged extends Weapon
{
	private double range;
	private int currentAmmo;
	private int maxAmmo;
	
	/**
	 * Constructor for Ranged object      
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public Ranged(String name, int dmg, int ice, int fire, double rng, int max)
	{
		new Weapon(name, dmg, ice, fire, WeaponHandedness.TwoHanded);
		range = rng;
		maxAmmo = max;
		currentAmmo = maxAmmo;
	}//end Ranged
	
	/**
	 * getter for Ranged's range       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public double getRange()
	{
		return range;
	}//end getRange
	
	/**
	 * getter for currentAmmo      
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int getAmmo()
	{
		return currentAmmo;
	}//end currentAmmo
	
	/**
	 * getter for MaxAmmo       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int getMaxAmmo()
	{
		return maxAmmo;
	}//end maxAmmo
	
	/**
	 * setter for Range         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void setRange(int rng)
	{
		range = rng;
	}//end setRange
	
	/**
	 * transmutes currentAmmo within acceptable limits by given
	 * parameter         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int addAmmo(int a)
	{
		if(currentAmmo + a > maxAmmo)
			currentAmmo = maxAmmo;
		else
			currentAmmo += a;
		return currentAmmo;
	}//end addAmmo
	
	/**
	 * toString method for Ranged object         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public String toString()
	{
		return ("{name:\""+ getName() +"\",price:" +
			getPrice() + ",durabilitiy\"" + getDurabilityStatus() +
			"\",normal:" + getNormalDamage() + ",ice:" +
			getIceDamage() +",fire:" + getFireDamage() +
			",weaponHandedness:\"" + getWeaponHandedness() +
			"\",range:" + range + ",currentAmmo:" + currentAmmo +
			",maxAmmo:" + maxAmmo + "}");
	}//end toString
}//end Ranged.java