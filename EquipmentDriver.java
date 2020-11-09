/**
 * Dylan Shaffer
 * CSCI 1260-001
 */
import java.util.Scanner;
import java.util.ArrayList;

 public class EquipmentDriver
{
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
						EquipmentManager.clearAll();
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
    }
}