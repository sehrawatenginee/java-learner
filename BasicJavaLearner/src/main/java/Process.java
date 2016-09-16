
class Stack
{
	int top;
	int arr[]=new int[10];
	Stack()
	{
		top=-1;
	}
	void push(int d)
	{
		if(top>=10)
			System.out.println("Stack overflow");
		else
			arr[++top]=d;
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else
			return arr[top--];
	}
	int gettopval()
	{
		return arr[top];
	}
	int gettop()
	{
		return top;
	}
}
public class Process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
