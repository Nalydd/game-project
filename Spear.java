/**
 * ---------------------------------------------------------------------------
 * File name: Spear.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * Contributors: Dylan Shaffer
 * ---------------------------------------------------------------------------
 */


/**
 * Allows for creation of spear objects that extend weapon class
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class Spear extends Weapon
{
	/**
	 * Constructor for Spear object        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public Spear()
	{
		super Weapon("Spear", 8,0,0,WeaponHandedness.TwoHanded);
		Equipment.setPrice(135);
	}//end Spear
}//end Spear.java