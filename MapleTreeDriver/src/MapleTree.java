/***************************************************
 * MapleTree.java
 * This is the driven MapleTree Class
 * @author Sean Roberts
 ***************************************************/
//Import Scanner class
import java.util.Scanner;
public class MapleTree {
	//Initialize Variables
	Scanner scanClass = new Scanner (System.in);
	private String plantDate = "";		//"dd/mm/yyy" date tree was planted
	private String heightDate = ""; 	//dd/mm/yyyy date the tree appeared to have grown.
	private double height = 0;			// % of a meter daily growth  rate
	/***********************************************
	* Class Methods
	************************************************/
	public void plant() {
		System.out.print("Enter plant date (dd/mm/yyyy): ");
		plantDate = scanClass.nextLine();
		plantDate = plantDate.trim();
	}//End plant
	public void germinate() {
		System.out.print("Enter germination date (dd/mm/yyyy): ");
		heightDate = scanClass.nextLine();
		heightDate = heightDate.trim();
		//Tests for a proper double.
		try{
			System.out.print("Enter observed height in meters: ");
			height = scanClass.nextDouble();	
		}
		catch(Exception e) {
			System.out.println("Error: Enter height in meters, as a percentage in decimal form.");
			System.out.println("Please restart the application to resolve this issue.");
		}
	}//End germinate
	public void dumpData() {
		System.out.println("Plant date = " + this.plantDate);
		System.out.println("Germinate date = " + this.heightDate);
		System.out.println("Initial height = " + this.height + " meters");
	}//End dumpData
}//End MapleTree Class
