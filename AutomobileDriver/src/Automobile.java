/***************************************************
 * Automobile.java
 * @author Sean Roberts
 ***************************************************/
import java.util.Scanner;   //Import Scanner class
public class Automobile {
	//Initialize Variables
	Scanner scanClass = new Scanner (System.in);
	String make = "";	//Make of car.
	String color = ""; 	//Color of car
	/***********************************************
	* Class Methods
	************************************************/
	public void setMake() {
		String selectedCar;
			System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
			selectedCar = scanClass.nextLine();
			if( selectedCar.trim().equals("b") == false && selectedCar.trim().equals("c") == false && selectedCar.trim().equals("p") == false ) {
				System.out.println("The only valid selections are 'b','c','p'");
				System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
				selectedCar = scanClass.nextLine();
				if (selectedCar.trim().equals("b")) {
					this.make = "Buick";
				}else if (selectedCar.trim().equals("c")) {
					this.make = "Chevrolet";
				}else if (selectedCar.trim().equals("p")) {
					this.make = "Pontiac";
				} //End Set Make
			}else {
				if (selectedCar.trim().equals("b")) {
					this.make = "Buick";
				}else if (selectedCar.trim().equals("c")) {
					this.make = "Chevrolet";
				}else if (selectedCar.trim().equals("p")) {
					this.make = "Pontiac";
				} //End Set Make
			} //End isValid car check
	}//End Method
	public void setColor() {
		String selectedColor;
		System.out.print("Select blue, green, or red (b,g,r): ");
		selectedColor = scanClass.nextLine();
		
			if (selectedColor.trim().equals("b")) {
				this.color = "blue";
			}else if (selectedColor.trim().equals("g")) {
				this.color = "green";
			}else if (selectedColor.trim().equals("r")) {
				this.color = "red";
			}else {
				this.color = "undefined color";
			} //End Set color

	}
	
	public void printColor() {
		System.out.print(this.color + " ");
	}
	public void printMake() {
		System.out.println(this.make);
	}

}
