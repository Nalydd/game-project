/**
 * ---------------------------------------------------------------------------
 * File name: LongBow.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * ---------------------------------------------------------------------------
 */


/**
 * Allows user to create LongBow objects that extend Ranged class
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class LongBow extends Ranged
{
	/**
	 * Creates LongBow object     
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public LongBow()
	{
		super Ranged("LongBow", 5, 0 ,0, 150, 100);
		addAmmo(-50);
		setPrice(85);
	}//end LongBow
}//end LongBow.java
