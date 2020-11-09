/**
 * ---------------------------------------------------------------------------
 * File name: Sword.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * Contributors: Dylan Shaffer
 * ---------------------------------------------------------------------------
 */


/**
 * Allows for the creation of sword objects that extend weapon class
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class Sword extends Weapon
{
	/**
	 * Constructor for Sword object         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public Sword()
	{
		super Weapon("Sword", 5,0,0,WeaponHandedness.Versatile);
	}//end Sword
}//end Sword.java