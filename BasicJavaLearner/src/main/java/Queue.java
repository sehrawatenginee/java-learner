

class Queue {
	private Node front;
	private Node back;
	
	Queue()
	{
		front=null;
		back=null;
	}
	void push(int d)
	{
		if(front==null)
		{
			front=new Node();
			front.data=d;
			front.next=null;
			back=front;
		}
		else
		{
			Node newnode=new Node();
			newnode.data=d;
			newnode.next=null;
			front.next=newnode;
			front=newnode;
		}
	}
	
	void printQueue()
	{
		Node current=back;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	int getsize()
	{
		int count=0;
		Node current=back;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	int pop()
	{
		if(back==null)
		{
			System.out.println("Queue empty");
			return -1;
		}
		else
		{
			int temp=back.data;
			back=back.next;
			return temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue l1=new Queue();
		l1.push(2);
		l1.push(5);
		l1.push(45);
		l1.push(989);
		l1.push(452);
		l1.push(134);
		l1.printQueue();
		System.out.println(l1.pop());
		System.out.println(l1.pop());
		System.out.println(l1.pop());
		System.out.println(l1.pop());
		System.out.println(l1.pop());
		System.out.println(l1.pop());
		System.out.println(l1.pop());
		
	}

}


class Node1 {
public int data;
public Node next;
}

