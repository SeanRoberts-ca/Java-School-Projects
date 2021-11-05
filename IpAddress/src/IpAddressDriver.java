//IpAddressDriver
//Author: Sean Roberts
public class IpAddressDriver {
	//Main Method that Drives the app.
	public static void main(String[] args) {
		//Create an Object & Initialize the Constructor.
		IpAddress ip= new IpAddress("216.27.6.136");
		System.out.println(ip.getDottedDecimal());
		System.out.println(ip.getOctet(4));
		System.out.println(ip.getOctet(1));
		System.out.println(ip.getOctet(3));
		System.out.println(ip.getOctet(2));
	}//End Main
}//End Driver Class
