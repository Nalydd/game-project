/**
 * ---------------------------------------------------------------------------
 * File name: Equipment.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko, zelaskod@edu
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * Contributors: Dylan Shaffer
 * ---------------------------------------------------------------------------
 */


/**
 * Initializes attributes of and has methods to maintain
 * a virtual piece of equipment to be managed by a driver class
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */

public class Equipment
{
	private static String name;
	private static int price;
	private static double durability;

	/**
	 * Parameterized constructor for equipment object        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public Equipment(String newName, int newPrice, double newDurability)
	{
		name = newName;
		price = newPrice;
		durability = newDurability;
	}//end Equipment
	
	/**
	 * getter for equipment name       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public static String getName()
	{
		return name;
	}//end getName
	
	/**
	 * getter for equipment price    
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public static int getPrice()
	{
		return price;	
	}//end getPrice
	
	/**
	 * getter for equipment durability        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public static double getDurability()
	{
		return durability;
	}//end getDurability
	
	/**
	 * getter for Durability status determined by durability score        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public String getDurabilityStatus()
	{
		String durabilityScore = "Almost Broken";
		if(durability >= .3)
			durabilityScore = "Poor Condition";
		if(durability >= .5)
			durabilityScore = "Fair Condition";
		if(durability >= .7)
			durabilityScore = "Good Condition";
		if(durability >= .9)
			durabilityScore = "Great Condition";
		return durabilityScore;
	}//end getDurabilityStatus
	
	/**
	 * Setter for equipment name        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public static void setName(String newName)
	{
		name = newName;
	}//end setName
	
	/**
	 * Setter for equipment price 
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public static void setPrice(int newPrice)
	{
		price = newPrice;
	}//end setPrice
	
	/**
	 * Setter for equipment durability       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void setDurability(double newDurability)
	{
		durability = newDurability;
	}//end setDurability
	
	/**
	 * generator and getter for equipment salePrice        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int getSalePrice()
	{
		int salePrice =  (int)(price * (.3 + durability));
		return salePrice;	
	}//end getSalePrice
	
	/**
	 * transmuter for durability that ensures any change does not 
	 * go against the max and min values of the attribute        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void adjustDurability(int adjustment)
	{
		if(adjustment <= 1 && adjustment >= -1)
		{
			if((durability + adjustment) > 1)
				durability = 1;
			if((durability + adjustment) < 0)
				durability = 0;
			else
				durability += adjustment;
		}//end if
	}//end adjustDurability
}//end Equipment.java
