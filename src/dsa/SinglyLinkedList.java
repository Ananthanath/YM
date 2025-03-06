package dsa;
class Node3 {
	int data;
	Node3 link;
}

class Process extends Node3 {
	Node3 head = null;

	void insertBegin(int data)// 3
	{
		Node3 newnode = new Node3();

		newnode.data = data;// 3
		newnode.link = null;

		if (head == null)
			head = newnode;
		else {
			newnode.link = head;
			head = newnode;
		}
	}

	void insertEnd(int data)// 5
	{
		Node3 newnode = new Node3();
		newnode.data = data;
		newnode.link = null;
		Node3 temp = head;
		while (temp.link != null) {
			temp = temp.link;
		}
		temp.link = newnode;

	}

	void insertPos(int pos, int data)// 1,6
	{
		Node3 newnode = new Node3();
		newnode.data = data;
		newnode.link = null;

		Node3 temp = head;
		if (pos == 0)
			insertBegin(data);
		else {
			for (int i = 1; i <= pos; i++)// 1<=0
			{
				temp = temp.link;
			}
			newnode.link = temp.link;
			temp.link = newnode;
		}
	}

	void deleteBegin() {
		// Node temp=head;
		if (head == null)
			System.out.println("Empty");
		else {
			head = head.link;
		}
	}

	void deleteEnd() {
		Node3 temp = head;
		Node3 pre = null;
		while (temp.link != null) {
			pre = temp;
			temp = temp.link;
		}
		pre.link = null;
	}

	void deletePos(int pos)// 1
	{
		Node3 temp = head;
		Node3 pre = null;
		for (int i = 1; i <= pos; i++)// 2<=1
		{
			pre = temp;
			temp = temp.link;
		}
		pre.link = temp.link;
	}

	void update(int pos,int num)
	{
		Node3 temp=head;
		if(pos==0)
		{
			temp.data=num;
		}
		else {
		for(int i=1;i<=pos;i++)
		{
			temp=temp.link;
		}
		temp.data=num;
		}
		
	}
	void display() {
		Node3 temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	void displaypos(int pos)
	{
		if(pos<size())
		{
		Node3 temp=head;
		if(pos==0)
		{
			System.out.println(temp.data);
		}
		else {
			for(int i=1;i<=pos;i++)
			{
				temp=temp.link;
			}
			System.out.println(temp.data);
		}
		}
		else {
			System.out.println("give less than size "+size());
		}
	}
	int size()
	{
		Node3 temp=head;
		int size=0;
		while(temp!=null)
		{
			temp=temp.link;
			size++;
		}
		return size;
	}

}

public class SinglyLinkedList extends Process {
	public static void main(String args[]) {
		SinglyLinkedList sl = new SinglyLinkedList();
		System.out.println("Inserting at Begin");
		sl.insertBegin(1);
		sl.insertBegin(2);
		sl.insertBegin(3);
		sl.insertBegin(4);
		sl.display();
		System.out.println("Inserting at End");
		sl.insertEnd(5);
		sl.display();
		System.out.println("Inserting at Position");
		sl.insertPos(1, 6);
		sl.display();
		System.out.println("Deleting at Begin");
		sl.deleteBegin();
		sl.display();
		System.out.println("Deleting at End");
		sl.deleteEnd();
		sl.display();
		System.out.println("Deleting at Position");
		sl.deletePos(1);
		sl.display();
		System.out.println("Updating at Position");
		sl.update(0, 5);
		sl.display();
		System.out.println("size of list");
		System.out.println(sl.size());
		System.out.println("display at position");
		sl.displaypos(0);
		
	}

}
