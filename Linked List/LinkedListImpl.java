class Node{
	int data;
	Node next;
}

class LinkedList{
	Node head;
	
	LinkedList(){
		head = new Node();
	}
	
	public int ListLength()
	{
		Node current = this.head;
		int count = 0 ;
		while(current!=null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertNodeInEnd(int data)
	{
			Node current = this.head;
			while(current.next!=null)
			{
				current = current.next;
			}
			current.next = createNode(data);
	}
	
	public void insertNodeInBeginning(int data)
	{
		Node newNode = createNode(data);
		newNode.next = this.head;
		this.head = newNode;
	}
	
	public void insertNodeInMiddle(int data,int pos)
	{
		Node current = this.head;
		int i = 0 ;
		while(current!=null && i < pos-1)
		{
			current = current.next;
			i++;
		}
		Node temp = current.next;
		current.next = createNode(data);
		current=current.next;
		current.next=temp;
	}
	
	public Node createNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}
	
	public void printList()
	{
		Node current = this.head;
		while(current!=null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void deleteIthElement(int k)
	{
		Node current = head;
		int i = 0;
		if(k==0)
		{
			head = head.next;
		}
		else if(k==1)
		{
			head.next = head.next.next;
		}
		else
		{
		while(current!=null && i < k )
		{
			current = current.next;
			i++;
		}
		current.next = current.next.next;
		}
	}
	
	
}


public class LinkedListImpl {
	
	public static void main(String[] args)
	{
	
		LinkedList list = new LinkedList();
		list.insertNodeInEnd(10);
		list.insertNodeInEnd(10);
		list.insertNodeInEnd(10);
		list.insertNodeInBeginning(40);
		list.insertNodeInBeginning(50);
		list.insertNodeInMiddle(100, 5);
		list.deleteIthElement(1);
		list.printList();
		
		
		
	}
	
	
}
	
	

