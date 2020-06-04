class Node <T>
{
	 T data;
	Node<T> next;
	public Node(T d)
	{
		data=d;
		
	}

}
public class StackbylinkedlistGeneric<T> {

	private Node <T> head=null;
	public void push(T data)
	{
		Node<T> temp=new Node(data);
		if(head==null)
		{
			head=temp;
		}
		else{
			Node<T> temp1=head;
			while(temp1.next!=null)             //traverse till end of linked list
			{
				temp1=temp1.next;
			}
			temp1.next=temp;
		}
	}
	public void pop()
	{
		if(head==null)
		{
			System.out.println("stack is empty");
		}
		else if(head.next==null)
		{
			System.out.println("popped data is:"+head.data);      //if only 1 element is present
			head=null;
		}
		else{
			Node<T> temp=head;
			while(temp.next.next!=null)           //traverse list to get top of stack
			{
				temp=temp.next;
			}
			System.out.println("popped data is:"+temp.next.data);     
			temp.next=null;
			
		}
	}
	public int is_stack_empty()
	{
		if(head==null)                 //stack is empty
		{
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StackbylinkedlistGeneric<String> s=new StackbylinkedlistGeneric<String>();
s.push("Shivani");
s.push("Shilpa");
s.push("Rohan");
s.push("Nishad");

s.pop();
s.pop();
	}

}
