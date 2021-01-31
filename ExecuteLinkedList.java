package data_structures;

public class ExecuteLinkedList {
	
	public static void main(String [] args) {
		
		LinkedList list = new LinkedList();
		
		list.addNode("Microsoft");
		list.addNode("Google");
		list.addNode("Baba");
		list.addNode("Tencent");
		
		list.addNode("Mongo", 3);
		
		list.remove("Microsoft");
		list.showLinkedList();
	}
}
