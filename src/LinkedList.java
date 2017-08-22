
public class LinkedList {
	Node headNode;
	Node tailNode;
	LinkedList (int headContent){
		Node newNode = new Node();
		newNode.setElement(headContent);
		newNode.setNext(null);
		headNode = newNode;
		tailNode = newNode;
	}
	
	
	public void addItem(int itemContent){

		Node newNode = new Node();
		newNode.setElement(itemContent);
		newNode.next = headNode;
		headNode = newNode;
	}
	
	public int getLength(){
		int returnValue = 0;
		
		Node currentNode = headNode;

		while(currentNode!=null){
				returnValue++;
				currentNode = currentNode.next;
		}
		return returnValue;
	}
	
	public void removeHead(){
		headNode = headNode.next;
	}
	
	public void enqueue(int itemContent){
		Node newNode = new Node();
		newNode.setElement(itemContent);
		newNode.next = null;

		tailNode.next = newNode;
	
	}
	public void dequeue(){
		headNode = headNode.next;
	}
	
	public void find(int content){
		Node currentNode = headNode;

		while(currentNode!=null){
			if(currentNode.getElement()==content){
				System.out.println("Found ");
			
			}

			
			
			currentNode = currentNode.next;
			
		
		}
	}
	public void printAll(){
		Node currentNode = headNode;
		System.out.println("Printing :");
		while (currentNode != null) {
			System.out.print(currentNode.toString() + " ");

			currentNode = currentNode.next;

		}
		System.out.println("");
		System.out.println("Head :" + headNode.getElement() );
	}
}