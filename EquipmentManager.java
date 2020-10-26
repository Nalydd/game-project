/**
 * ---------------------------------------------------------------------------
 * File name: EquipmentManager.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * Contributors: Dylan Shaffer, Seth Gilstrap, Torrey Warren, Dylan Colburn
 * ---------------------------------------------------------------------------
 */

package game;

import java.util.ArrayList;
import java.util.Scanner;

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

	public static void main(String[] args)
	{ //start main method
		Scanner sc = new Scanner(System.in);	//All case switch methods implemented by Dylan Shaffer
		System.out.println("What would you like to do?\nManage Equipment\nAdd Equipment\nRemove Equipment\nEquipment Info");
		String s = sc.nextLine();
		switch (s)
		{
			case "Manage Equipment":
				System.out.println("Please enter a valid command:\nclear all\ncount equipment\ncount armor\ncount weapons\nlist all\nlist all details");
				s = sc.nextLine();
				switch (s)
				{
					case "clear all":
						clearAll();
						break;
					case "count equipment":
						countEquipment();
						break;
					case "count armor":
						countArmor();
						break;
					case "count weapons":
						countWeapon();
						break;
					case "list all":
						System.out.print("\033[H\033[2J");  
						System.out.flush();
						getEquipmentList();
						break;
					case "list all details":
						System.out.print("\033[H\033[2J");  
						System.out.flush();
						getEquipmentListDetails();
						break;
					default:
						System.out.println("Please enter a valid command.");
						break;
				}
				break;
				case "Add Equipment":
					System.out.println("Please state what you would like to add\n");
					System.out.println("Types of valid equipement:\nplackart\nhelmet\nspear\nsword\nlongBow\nthrowingAxe");
					s = sc.nextLine();
					switch(s)
					{
						case "plackart":
							addPlackart();
							break;
						case "helmet":
							addHelmet();
							break;
						case "spear":
							addSpear();
							break;
						case "sword":
							addSword();
							break;
						case "longBow":
							addPLongbow();
							break;
						case "throwingAxe":
							addThrowingAxe();
							break;
						default:
							System.out.println("Please use a valid equipment type.");
							break;
					}
					break;
				case "Remove Equipment":
					System.out.println("Enter what item you would like to remove at what index.\n(For example, sword 2)");
					s = sc.nextLine();
					int i = sc.nextInt();
					removeEquipment(s, i);
					break;
				case "Equipment Info":
					System.out.println("Enter what item you would like to see info on.\n(For example: sword 2)");
					s = sc.nextLine();
					i = sc.nextInt();
					getEquipmentDetails(s, i);
					break;
				default:
					System.out.println("Please enter a valid command.");
					break;
		}
		
		/**
		 * Initializes EquipmentManager object      
		 *
		 * <hr>
		 * Date created: Oct 14, 2020
		 *
		 * <hr>
		 * @param args
		 */
		
		EquipmentManager equipmentManager = new EquipmentManager()
		{

		}
		//end EquipmentManager
		
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
			else
			{
				System.out.println("Please input a valid Equipment type from the following list:" + /n + "Plackarts, Helmets, LongBows, ThrowingAxes, Spears, Swords")
			}
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

		public void addThrowingAxe(ThrowingAxe a)
		{
			throwingAxes.add (s);
		}
		
		/**
		 * Enter method description here         
		 *
		 * <hr>
		 * Date created: Oct 14, 2020
		 *
		 * <hr>
		 * @param args
		 */
		private void removeEquipment(ArrayList list, int index)	//removeEquipment implemented by Seth and Torrey
		{
			if (list.equalsIgnoreCase("Plackarts"))
			{
				plackarts.remove(index);
			}
			else if (list.equalsIgnoreCase("LongBows"))
			{
				longBows.remove(index);
			}
			else if (list.equalsIgnoreCase("Helmets"))
			{
				helmets.remove(index);
			}
			else if (list.equalsIgnoreCase(ThrowingAxes))
			{
				throwingAxes.remove(index);
			}
			else if (list.equalsIgnoreCase("Spears"))
			{
				spears.remove(index);
			}
			else if (list.equalsIgnoreCase("Swords"))
			{
				swords.remove(index);
			}
			else
			{
				System.out.println("Please input a valid Equipment type from the following list:/nPlackarts, Helmets, LongBows, ThrowingAxes, Spears, Swords")
			}
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
		private getEquipmentDetails(ArrayList list, int index)	//getEquipmentDetails implemented by Seth and Torrey
		{
			if (list.equalsIgnoreCase("Plackarts"))
			{
				return plackarts.get(index).toString();
			}
			else if (list.equalsIgnoreCase("LongBows"))
			{
				return longBows.get(index).toString();
			}
			else if (list.equalsIgnoreCase("Helmets"))
			{
				list = helmets.get(index).toString();
			}
			else if (list.equalsIgnoreCase(ThrowingAxes))
			{
				list = throwingAxes.get(index).toString();
			}
			else if (list.equalsIgnoreCase("Spears"))
			{
				list = spears.get(index).toString();
			}
			else if (list.equalsIgnoreCase("Swords"))
			{
				list = swords.get(index).toString();
			}
			else
			{
				System.out.println("Please input a valid Equipment type from the following list:/nPlackarts, Helmets, LongBows, ThrowingAxes, Spears, Swords")
			}
		}//end getEquipmentDetails
	}//end Main method
}//end EquipmentManager.java