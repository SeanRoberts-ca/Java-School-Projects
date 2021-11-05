//IpAddress Class
//Author: Sean Roberts
public class IpAddress {

	//Initialize Variables
	private String ip;
	private String[] tokens;
	
	//Create Constructor
	public IpAddress (String fullAddress){
		this.ip = fullAddress;
	}
	
	//Return Full IP string
	public String getDottedDecimal(){
	  return this.ip;
	}

	//Split into parts & return as ints.
	public int getOctet(int index){	
		int j = 0; 
		String temp = (this.ip.replace(".", "-"));
		tokens = temp.split("-");
		if(index == 1) {
			j = Integer.parseInt(tokens[0]);
		}else if (index == 2) {
			j = Integer.parseInt(tokens[1]);
		}else if (index == 3) {
			j = Integer.parseInt(tokens[2]);
		}else if (index == 4) {
			j = Integer.parseInt(tokens[3]);
		}
		//Return the Octet.
		return j;
	}

}//End Class
