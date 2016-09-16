/*
public class Linkedlist_test {
private node head;
void putdata(int d){
	if(head==null){
		
	head =new node();
	head.data=d;
	head.next=null;
	}
	else
	{
		node newnode = new node();
		newnode.data=d;
		newnode.next=head;
		head=newnode;
	}
		
	}
void delete_node(int d){
	node current=head;
	node previous= null;
	if(head.data== d){
		head=head.next;
		
	}
	else{
		while(current!=null&&current.data!=d){
		
			previous=current;
			current=current.next;
			previous.next=current.next;
		}
		
		
	}
	
}
void insert_node(int position, int d){
	node current =head;
	for(int i =1;i<position-1;i++){
		current=current.next;
	}
	if(current==null){
		System.out.println("invalid position");
	}
	node newnode = new node();
	newnode.data=d;
	newnode.next=current.next;
	current.next=newnode;
}

void printlist(){
	node current=head;
	while(current!=null){
		System.out.println(current.data);
		current=current.next;
	}
}
	public static void main(String[] args) {
	Linkedlist_test lst =new Linkedlist_test();
	lst.putdata(23);
	lst.putdata(24);
	lst.putdata(25);
	lst.putdata(26);
	lst.putdata(27);
	lst.putdata(28);
	lst.delete_node(4);
	lst.printlist();
	}

}
class node{
	public int data;
	public node next;
}*/