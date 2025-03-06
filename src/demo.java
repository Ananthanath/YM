class Mnode {
	int data;
	Mnode next;
	Mnode pre;
}

class Working {
	Mnode head;
	Mnode tail;

	void insertbegin(int num) {
		Mnode newnode = new Mnode();
		newnode.data = num;
		newnode.next = null;
		newnode.pre = null;
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			head.next = newnode;
			newnode.pre = head;
			head = newnode;
		}
	}

	void insertlast(int num) {
		Mnode newnode = new Mnode();
		newnode.data = num;
		if (tail == null) {
			insertbegin(num);
		} else {

			tail.pre = newnode;
			newnode.next = tail;
			tail = newnode;
		}
	}

	void insertpos(int pos, int num) {
		Mnode newnode = new Mnode();
		Mnode temp = head;
		newnode.data = num;
		if (pos == 0) {
			insertbegin(num);
		} else {
			for (int i = 1; i < pos; i++) {
				temp = temp.pre;
			}
			newnode.pre = temp.pre;
			newnode.pre.next = newnode;
			newnode.next = temp;
			newnode.next.pre = newnode;

		}
	}

	void removebegin() {
		if (head != null) {
			head = head.pre;
		} else {
			System.out.println("list empty");
		}
	}
	void removelast()
	{
		if(tail!=null)
		{
			tail.next.pre=null;
			tail=tail.next;	

		}
		else
		{
			System.out.println("no data in list");
		}
	}
	void removepos(int pos)
	{
		Mnode temp = head;
		if(pos<0)
		{
			System.out.println("index range from 0 to "+(size()-1));
		}
		else if(pos==0)
		{
			removebegin();
		}
		else {
		for(int i=1;i<pos;i++)
		{
			temp=temp.pre;
		}
		
		}
	}

	void displaypos(int pos) {
		Mnode temp = head;
		if (pos >= size()) {
			System.out.println("max length is " + (size() - 1));
		} else {
			for (int i = 0; i < pos; i++) {
				temp = temp.pre;
			}
			System.out.println(temp.data);
		}
	}

	void display() {
		Mnode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.pre;
		}
	}

	void reversedisplay() {
		Mnode temp = tail;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	int size() {
		Mnode temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.pre;
		}
		return size;
	}
}

public class Demo {
	public static void main(String[] args) {
		Working obj = new Working();
		obj.insertbegin(20);
		obj.insertbegin(40);
		obj.display();
		System.out.println();
		obj.insertlast(10);
		obj.insertlast(6);
		obj.display();
		System.out.println();
		obj.insertpos(1, 30);
		obj.display();
		System.out.println();
		obj.reversedisplay();
		System.out.println();
		System.out.println(obj.size());
		System.out.println();
		obj.removebegin();
		obj.display();
		System.out.println();
		obj.displaypos(4);
		System.out.println();
		obj.removelast();
		obj.display();
		System.out.println();
		System.out.println(obj.tail.data);

	}
}