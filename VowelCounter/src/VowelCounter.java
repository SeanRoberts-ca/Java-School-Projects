/*
 * Author: Sean Roberts
 * Primary Class Counts and displays vowel count summary.
 */

public class VowelCounter {
	
	//Initialize Class Variables
	
	int[][] intVowelCount = { {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0} };
	String[][] strVowelLetterLine = { {"", "", "", "", ""}, {"", "", "", "", ""} };
	
	public void processLine(String returnString) {

		/******************a,e,i,o,u********/
		
	  char ch;//letter
	  int temp;//Sum
	  
      for (int i=0 ; i<returnString.length(); i++){
          ch = returnString.charAt(i);
	        if(ch == 'a'){
	        	temp = intVowelCount[0][0];
	        	intVowelCount[0][0] = temp + 1;
	     	  }
	        if(ch == 'e'){
	        	temp = intVowelCount[0][1];
	        	intVowelCount[0][1] = temp + 1;
	     	  }
	        if(ch == 'i'){
	        	temp = intVowelCount[0][2];
	        	intVowelCount[0][2] = temp + 1;
	     	  }
	        if(ch == 'o'){
	        	temp = intVowelCount[0][3];
	        	intVowelCount[0][3] = temp + 1;
	     	  }
	        if(ch == 'u'){
	        	temp = intVowelCount[0][4];
	        	intVowelCount[0][4] = temp + 1;
	     	  }
	        if(ch == 'A'){
	        	temp = intVowelCount[1][0];
	        	intVowelCount[1][0] = temp + 1;
	     	  }
	        if(ch == 'E'){
	        	temp = intVowelCount[1][1];
	        	intVowelCount[1][1] = temp + 1;
	     	  }
	        if(ch == 'I'){
	        	temp = intVowelCount[1][2];
	        	intVowelCount[1][2] = temp + 1;
	     	  }
	        if(ch == 'O'){
	        	temp = intVowelCount[1][3];
	        	intVowelCount[1][3] = temp + 1;
	     	  }
	        if(ch == 'U'){
	        	temp = intVowelCount[1][4];
	        	intVowelCount[1][4] = temp + 1;
	        }
	       }//End For loop
	}//End processLine
	
	public void printSummary() {

		int inttempi = 0;
		int inttempj = 0;

		/******************a,e,i,o,u********/
		/*************LOWER CASE VOWELS*****/

	    int i = 0;    
		for(int j = 0; j < 5; ++j) {
			inttempi = this.intVowelCount[i][j];
	        	if (j == 0){
					  strVowelLetterLine[0][0] = "A: " + inttempi + " lowercase, ";
				  }
				/************************************************/
	        	if (j == 1){
	        		  strVowelLetterLine[0][1] = "E: " + inttempi + " lowercase, ";
				  }
				/************************************************/
	        	if (j == 2){
					  strVowelLetterLine[0][2] = "I: " + inttempi + " lowercase, ";
				  }
				/************************************************/
	        	if (j == 3){
					  strVowelLetterLine[0][3] = "O: " + inttempi + " lowercase, ";
				  }
				/************************************************/
	        	if (j == 4){
					  strVowelLetterLine[0][4] = "U: " + inttempi + " lowercase, ";
				  }
				/************************************************/ 
	        }//End for j column 1
		
		/******************a,e,i,o,u********/
		/*************UPPER CASE VOWELS*****/
		
	    i = 1;  

		for(int j = 0; j < 5; ++j) {
			inttempi = this.intVowelCount[0][j];
			inttempj = this.intVowelCount[i][j];
				if (j == 0){
					  strVowelLetterLine[1][0] = inttempj + " uppercase, " + (inttempi + inttempj) + " total";
				  }
				/************************************************/
	        	if (j == 1){
	        		  strVowelLetterLine[1][1] = inttempj + " uppercase, " + (inttempi + inttempj) + " total";
				  }
				/************************************************/
	        	if (j == 2){
					  strVowelLetterLine[1][2]  = inttempj + " uppercase, " + (inttempi + inttempj) + " total";
				  }
				/************************************************/
	        	if (j == 3){
					  strVowelLetterLine[1][3] = inttempj + " uppercase, " + (inttempi + inttempj) + " total";
				  }
				/************************************************/
	        	if (j == 4){
					  strVowelLetterLine[1][4]  = inttempj + " uppercase, " + (inttempi + inttempj) + " total";
				  }
				/************************************************/ 
	        }//End for j column 2
	    
		/*********************a,e,i,o,u************************/
		/*************LOWERCASE VOWELS + UPPERCASE + TOTAL*****/
		
		System.out.println(strVowelLetterLine[0][0]+strVowelLetterLine[1][0]);
		System.out.println(strVowelLetterLine[0][1]+strVowelLetterLine[1][1]);
		System.out.println(strVowelLetterLine[0][2]+strVowelLetterLine[1][2]);
		System.out.println(strVowelLetterLine[0][3]+strVowelLetterLine[1][3]);
		System.out.println(strVowelLetterLine[0][4]+strVowelLetterLine[1][4]);
		
	}//End printSummary();
}//End Class