/***************************************************
 * MapleTreeDriver.java
 * This is the driver for the MapleTree Class
 * @author Sean Roberts
 ***************************************************/
public class MapleTreeDriver {
	public static void main(String[] args) {
		//Create an Object of MapleTree.
		MapleTree tree = new MapleTree();
		//Run the methods
		tree.plant();
		tree.germinate();
		tree.dumpData();
	}//End Main
}//End Class MapleTreeDriver