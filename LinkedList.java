package data_structures;

public class LinkedList {

	private Node head;
	
	public LinkedList() {
		this.head = new Node("Head Node");
	}
	
	public void addNode(String data) {
		//create new Node
		Node newNode = new Node(data);
		// traverse, adjust pointer, set Node
		Node currentNode = head;
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(newNode);		
	}
	
	public void addNode(String data, int index) {
		Node newNode = new Node(data);
		Node currentNode = head;
		int counter = 0;
		
		while(currentNode.getNext() != null) {
			
			if(counter == index -1) {
				newNode.setNext(currentNode.getNext());
				currentNode.setNext(newNode);			
			}
			counter++;
			currentNode = currentNode.getNext();
		}	
	}
	
	public void remove(String data) {
		Node currentNode = head;
		
		while(currentNode.getNext() != null) {
			if(currentNode.getNext().getData().equalsIgnoreCase(data)) {
				Node removedNode = currentNode.getNext();
				currentNode.setNext(currentNode.getNext().getNext());
				removedNode.setNext(null);
				removedNode.setData(null);
				break;
			}
			currentNode = currentNode.getNext();
		}
	}
	
	public void showLinkedList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.printf("%s\n", currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}
	
	
	public class Node {
		
		private Node next;
		private String data;
		
		public Node( String data) {
			this.data = data;
			next = null;
		}
		
		public String getData() {
			return data;
		}
		
		public void setData(String data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
}
