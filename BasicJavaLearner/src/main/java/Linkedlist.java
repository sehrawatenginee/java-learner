public class Linkedlist {
	private Node head;
	void putdata(int d)
	{
		if(head==null)
		{
			head=new Node();
			head.data=d;
			head.next=null;
		}
		else
		{
			Node newnode=new Node();
			newnode.data=d;
			newnode.next=head;
			head=newnode;//new node is the head node now
		}
	}
	void delete(int d)
	{
		Node current=head;
		Node previous=null;
		if (head.data==d)
		{
			head=head.next;
		}
		else{
		while(current!=null&&current.data!=d)
		{
			previous=current;
			current=current.next;

		}
		if(current==null)
			System.out.println("data not found");
		else
		{	
			previous.next=current.next;
			System.gc();
		}
	}
		}
		
	void insert(int position, int d)
	{
		Node current=head;
		for(int i=1; i<position-1; i++)
		{
			current=current.next;
			if(current==null)
			{
				System.out.println("invalid position");
				break;
			}
		}
		Node newnode=new Node();
		newnode.data=d;
		newnode.next=current.next;
		current.next=newnode;
	}
	void printlist()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist l1=new Linkedlist();
		l1.putdata(2);
		l1.putdata(5);
		l1.putdata(45);
		l1.putdata(989);
		l1.putdata(452);
		l1.putdata(134);
		l1.printlist();
		l1.delete(3);
		l1.printlist();
		l1.insert(4, 66);
		l1.printlist();
	}

}
	class Node {
		public int data;
		public Node next;
	}


