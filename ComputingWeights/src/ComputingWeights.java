/**
 * 
 * @author Sean Roberts
 *
 */
public class ComputingWeights{
	
	public static void main(String args[]){
		
	   //Assumed center load in lbs: 20000
		final int CENTER_LOAD = 20_000;
		//Assumed weight of one section of road in lbs: 2000
		final int ROAD_WEIGHT = 2_000;
		//Assumed weight of structural pair in lbs: 500
		final int STRUCT_PAIR_WEIGHT = 500;
		
		System.out.println("Assumed center load in lbs: " + CENTER_LOAD);
		System.out.println("Assumed weight of one section of road in lbs: " + ROAD_WEIGHT);
		System.out.println("Assumed weight of structural pair in lbs: " + STRUCT_PAIR_WEIGHT);
	   
       double forceOnEbyED = (CENTER_LOAD/2) + (ROAD_WEIGHT/2);
       double forceOnDbyDE = -forceOnEbyED - STRUCT_PAIR_WEIGHT;
       double forceOnDbyCD = -forceOnDbyDE + STRUCT_PAIR_WEIGHT;
       double forceOnCbyCD = -forceOnDbyCD - STRUCT_PAIR_WEIGHT;
       double forceOnCbyBC = -forceOnCbyCD + ROAD_WEIGHT;
       double forceOnBbyBC = -forceOnCbyBC - STRUCT_PAIR_WEIGHT;
       double forceOnBbyAB = -forceOnBbyBC + STRUCT_PAIR_WEIGHT/2;
       double forceOnAbyAB = -forceOnBbyAB - STRUCT_PAIR_WEIGHT;
       
       //Support for half of bridge = 16750 lbs.
       double pierForce = -forceOnAbyAB + ROAD_WEIGHT/2;
       
       System.out.println("\nSupport for half of bridge = " + (int)pierForce + " lbs.\n");
       
       /* 1/Tan(60)=2/sqrt(3)=0.57735*/
       double horizontalForce = 0.57735;
       double maximumStrength = 1.1547;
       
       double totalTensionInAatAB = maximumStrength * forceOnAbyAB;
       double totalTensionInBatBC = -maximumStrength * forceOnBbyBC;
       double totalTensionInCatCD = maximumStrength * forceOnCbyCD;
       double totalTensionInDatDE = -maximumStrength * forceOnDbyDE;
       
       double rightForceOnAbyAC = -horizontalForce * forceOnAbyAB;
       double rightForceOnCbyAC = -rightForceOnAbyAC;
       double rightForceOnCbyCE = -rightForceOnCbyAC + horizontalForce * (forceOnCbyBC - forceOnCbyCD);
       double rightForceOnBbyBD = -horizontalForce * (forceOnBbyAB - forceOnBbyBC);
       double rightForceOnDbyBD = -rightForceOnBbyBD;
       double rightForceOnDbyDF = -rightForceOnDbyBD - horizontalForce * (forceOnDbyCD - forceOnDbyDE);
       
       double totalTensionInAatAC = rightForceOnAbyAC;
       double totalTensionInCatCE = rightForceOnCbyCE;
       double totalTensionInBatBD = rightForceOnBbyBD;
       double totalTensionInAatDF = rightForceOnDbyDF;
       
       //Reference: Narrowing Casting: https://www.w3schools.com/java/java_type_casting.asp
       System.out.println("Total tension in BD = " + (int)totalTensionInBatBD + " lbs");
       System.out.println("Total tension in DF = " + (int)totalTensionInAatDF + " lbs\n");
       System.out.println("Total tension in AB = " + (int)totalTensionInAatAB + " lbs");
       System.out.println("Total tension in BC =  " + (int)totalTensionInBatBC + " lbs");
       System.out.println("Total tension in CD = " + (int)totalTensionInCatCD + " lbs");
       System.out.println("Total tension in DE =  " + (int)totalTensionInDatDE + " lbs\n");
       System.out.println("Total tension in AC =  " + (int)totalTensionInAatAC + " lbs");
       System.out.println("Total tension in CE =  " + (int)totalTensionInCatCE + " lbs");     
       
   }//End Method
	
}//End Class