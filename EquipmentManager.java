/**
 * ---------------------------------------------------------------------------
 * File name: EquipmentManager.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * ---------------------------------------------------------------------------
 */

package game;

import java.util.ArrayList;

/**
 * Manager class for equipment and related classes.	 
 * Allows user to customize and manipulate virtual equipment.    
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class EquipmentManager
{
	private ArrayList<Plackart> plackarts = new ArrayList<Plackart>();
	private ArrayList<Helmet> helmets = new ArrayList<Helmet>();
	private ArrayList<LongBow> longBows = new ArrayList<LongBow>();
	private ArrayList<ThrowingAxe> throwingAxes = new ArrayList<ThrowingAxe>();
	private ArrayList<Spear> spears = new ArrayList<Spear>();
	private ArrayList<Sword> swords = new ArrayList<Sword>();
	
	/**
	 * Initializes EquipmentManager object      
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public EquipmentManager()
	{
		
	}//end EquipmentManager
	
	/**
	 * Transmuter that clears out every arraylist of the object     
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void clearAll()
	{
		plackarts.clear();
		helmets.clear ( );
		longBows.clear ( );
		throwingAxes.clear ( );
		spears.clear ( );
		swords.clear ( );
	}//end clearAll
	
	/**
	 * Returns all contained elements of the arraylists      
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int countEquipment()
	{
		return (plackarts.size() + helmets.size() + longBows.size() +
			throwingAxes.size() + spears.size() + spears.size());
	}//end countEquipment
	
	/**
	 * returns contained elements of plackarts and helmets arraylists        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int countArmor()
	{
		return (plackarts.size() + helmets.size());
	}//end countArmor
	
	/**
	 * contains all elements of spears, swords, longbows, and throwingaxes arraylists       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public int countWeapon()
	{
		return(longBows.size() +
		throwingAxes.size() + spears.size() + spears.size());
	}//end countWeapon
	
	/**
	 * removes a specific element from a specified arraylist       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void removeEquipment(String list, int index)
	{
		if(list == "plackarts")
			plackarts.remove(index);
		if(list == "helmets")
			helmets.remove (index);
		if(list == "longBows")
			longBows.remove (index);
		if(list == "throwingAxes")
			throwingAxes.remove(index);
		if(list == "swords")
			swords.remove (index);
		if(list == "spears")
			spears.remove (index);
	}//end removeEquipment
	
	/**
	 * prints the toString of a specific element of a specified arraylist       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void getEquipmentDetails(String list, int index)
	{
		if(list == "plackarts")
		{	
			Plackart p = plackarts.get(index);
			System.out.println(p.toString ( ));
		}// end if
		if(list == "helmets")
		{	
			Helmet h = helmets.get (index);
			System.out.println(h.toString ( ));
		}// end if
		if(list == "longBows")
		{
			LongBow l = longBows.get (index);
			System.out.println(l.toString ( ));
		}// end if
		if(list == "throwingAxes")
		{
			ThrowingAxe t = throwingAxes.get (index);
			System.out.println(t.toString());
		}// end if
		if(list == "swords")
		{
			Sword s = swords.get (index);
			System.out.println(s.toString ( ));
		}// end if
		if(list == "spears")
		{
			Spear s = spears.get (index);
			System.out.println(s.toString ( ));
		}// end if
	}//end getEquipmentDetails
	
	/**
	 * Returns a string containing all the details of all the contained elements
	 * in the object's arraylists        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public String getEquipmentListDetails()
	{
		String details = "";
		int i = 0;
		details += "Plackarts:\n";
		if(plackarts.isEmpty() == true)
			details += "<<empty>>\n";
		else
		{
			while(i<plackarts.size())
			{
				details += (i+ ". " + plackarts.get(i).toString() +"\n");
			}
			i = 0;
		}//end else
		if(helmets.isEmpty() == true)
			details += "<<empty>>\n";
		else
		{
			while(i<helmets.size())
			{
				details += (i+ ". " + helmets.get(i).toString() +"\n");
			}
			i = 0;
		}//end else
		if(longBows.isEmpty() == true)
			details += "<<empty>>\n";
		else
		{
			while(i<longBows.size())
			{
				details += (i+ ". " + longBows.get(i).toString() +"\n");
			}//end while
			i = 0;
		}//end else
		if(throwingAxes.isEmpty() == true)
			details += "<<empty>>\n";
		else
		{
			while(i<throwingAxes.size())
			{
				details += (i+ ". " + throwingAxes.get(i).toString() +"\n");
			}//end while
			i = 0;
		}//end else
		if(spears.isEmpty() == true)
			details += "<<empty>>\n";
		else
		{
			while(i<spears.size())
			{
				details += (i+ ". " + spears.get(i).toString() +"\n");
			}//end while
			i = 0;
		}//end else
		if(swords.isEmpty() == true)
			details += "<<empty>>\n";
		else
		{
			while(i<swords.size())
			{
				details += (i+ ". " + swords.get(i).toString() +"\n");
			}//end while
			i = 0;
		}//end else
		return details;
	}//end getEquipmentListDetails
	
	/**
	 * Returns a formatted string with all the names from the contained
	 * elements in the arraylists of the equipmentmanager     
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public String getEquipmentList()
	{
		{
			String details = "";
			int i = 0;
			details += "Plackarts:\n";
			if(plackarts.isEmpty() == true)
				details += "<<empty>>\n";
			else
			{
				while(i<plackarts.size())
				{
					details += (i+ ". " + plackarts.get(i).getName() +"\n");
				}//end while
				i = 0;
			}//end else
			if(helmets.isEmpty() == true)
				details += "<<empty>>\n";
			else
			{
				while(i<helmets.size())
				{
					details += (i+ ". " + helmets.get(i).getName() +"\n");
				}//end while
				i = 0;
			}//end else
			if(longBows.isEmpty() == true)
				details += "<<empty>>\n";
			else
			{
				while(i<longBows.size())
				{
					details += (i+ ". " + longBows.get(i).getName() +"\n");
				}//end while
				i = 0;
			}//end else
			if(throwingAxes.isEmpty() == true)
				details += "<<empty>>\n";
			else
			{
				while(i<throwingAxes.size())
				{
					details += (i+ ". " + throwingAxes.get(i).getName() +"\n");
				}//end while
				i = 0;
			}//end else
			if(spears.isEmpty() == true)
				details += "<<empty>>\n";
			else
			{
				while(i<spears.size())
				{
					details += (i+ ". " + spears.get(i).getName() +"\n");
				}//end while
				i = 0;
			}//end else
			if(swords.isEmpty() == true)
				details += "<<empty>>\n";
			else
			{
				while(i<swords.size())
				{
					details += (i+ ". " + swords.get(i).getName() +"\n");
				}//end while
				i = 0;
			}//end else
			return details;
		}
	}//end getEquipmentList
	
	/**
	 * adds plackart object to end of plackarts arraylist       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void addPlackart(Plackart p)
	{
		plackarts.add (p);
	}//end addPlackart
	
	/**
	 * adds helmet object to the end of helmets arraylist        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void addHelmet(Helmet h)
	{
		helmets.add (h);
	}//end addHelmet
	
	/**
	 * adds longbow object to end of arraylist       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void addLongBow(LongBow b)
	{
		longBows.add (b);
	}//end addLongBow
	
	/**
	 * adds spear to end of spears arraylist       
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void addSpear(Spear s)
	{
		spears.add (s);
	}//end addSpear
	
	/**
	 * adds sword to end of swords arraylist        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	public void addSword(Sword s)
	{
		swords.add (s);
	}//end addSword
	
	/**
	 * Enter method description here         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	private void removeEquipment(ArrayList list, int index)
	{
		;
	}//end removeEquipment
	
	/**
	 * Enter method description here         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	private void getEquipmentDetails(ArrayList list, int index)
	{
		;
	}//end getEquipmentDetails
}//end EquipmentManager.java