import java.util.*;

public class LinkedList {
	public static class Node{
		int data;
		Node next;
	}
     class ListOperations{
    	static Node head ;
        static Node tail;
        static int listsize=0;
        static void insertAtLast(int val) {
        	Node newnode=new Node();
        	newnode.data=val;
        	newnode.next=null;
        	if(listsize==0) {
        		head = newnode;
        		tail=newnode;
        		listsize++;
        	}
        	else {
        		tail.next=newnode;
        		tail=newnode;  		
        	}
        }
        public static void displayList() {
        	Node temp=head;
        	while(temp!=null) {
        		System.out.print(temp.data+"->");
        		//System.out.print(temp.next+"->");
        		temp=temp.next;
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int data=sc.nextInt();
			ListOperations.insertAtLast(data);
		}
		ListOperations.displayList();

	}

}
