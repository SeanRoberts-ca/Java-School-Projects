public class Party {

	private int intGuestCount = 0;
	private String partyHost;

    private final int maxNumberofGuests;
    private String[] guestList;
	
	public Party(int maxNumberofGuests,String hostName){
		 this.maxNumberofGuests = maxNumberofGuests;
		 this.partyHost = hostName;
		 guestList = new String[this.maxNumberofGuests];
	 }
	
	 public void addGuest(String strGuestName) {
		 
		 if (intGuestCount <  maxNumberofGuests) {
			 if (isOnList(strGuestName)) {
				 System.out.println(strGuestName + " is already on the guest list."); 
			 }else {
				 //Add to array.
				 this.guestList[intGuestCount]=strGuestName;
				 this.intGuestCount++;
			 }
		 }else {
			 System.out.println(strGuestName + " cannot come to the party. The guest list is full.");
		 }
	 }
	 
	 public boolean isOnList(String guest) {
		 for (int i = 0; i < maxNumberofGuests; i++) {
			  if(this.guestList.length > 0){
				  if (this.guestList[i] == guest) {
					  return true; 
				  }
			  }
			}
		 return false;
	  }
	 
	 
	 public void printParty() {
		 System.out.println("Guest list for " + this.partyHost + "'s party:");
		 for (int i = 0; i < maxNumberofGuests; i++) {
			   System.out.println(guestList[i]);
			 }
	 }
	
}