
		// TODO Auto-generated method stub
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
		//Singlylinked list
		class Node{
		    int data;
		    Node link;
		}
		 
		class Process extends Node{
		    Node head=null;
		 
		    void insertBegin(int data)//3
		    {
		        Node newnode= new Node();
		 
		        newnode.data=data;//3
		        newnode.link=null;
		 
		        if(head==null)
		        head=newnode;
		        else{
		            newnode.link=head;
		            head=newnode;
		        }
		    }
		    void insertEnd(int data)//5
		    {
		        Node newnode=new Node();
		        newnode.data=data;
		        newnode.link=null;
		        Node temp=head;
		        while(temp.link!=null)
		        {
		            temp=temp.link;
		        }
		        temp.link=newnode;
		 
		    }
		 
		    void insertPos(int pos, int data)//1,6
		    {
		        Node newnode=new Node();
		        newnode.data=data;
		        newnode.link=null;
		 
		        Node temp=head;
		        if(pos==0)
		        insertBegin(data);
		        else{
		            for(int i=1;i<=pos-1;i++)//1<=0
		            {
		                temp=temp.link;
		            }
		            newnode.link=temp.link;
		            temp.link=newnode;
		        }
		    }
		 
		    void deleteBegin()
		    {
		       // Node temp=head;
		        if(head==null)
		        System.out.println("Empty");
		        else{
		            head=head.link;
		        }
		    }
		 
		    void deleteEnd()
		    {
		        Node temp=head;
		        Node pre=null;
		        while(temp.link!=null)
		        {
		            pre=temp;
		            temp=temp.link;
		        }
		        pre.link=null;
		    }
		 
		    void deletePos(int pos)//1
		    {
		        Node temp=head;
		        Node pre=null;
		        for(int i=1;i<=pos;i++)//2<=1
		        {
		            pre=temp;
		            temp=temp.link;
		        }
		        pre.link=temp.link;
		    }
		 
		    void display()
		    {
		        Node temp=head;
		        while(temp!=null)
		        {
		            System.out.println(temp.data);
		            temp=temp.link;
		        }
		    }
		 
		}
		public class SinglyLinkedList extends Process{
		    public static void main(String args[])
		    {
		    	SinglyLinkedList sl=new SinglyLinkedList();
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
		     sl.insertPos(1,6);
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
	}

}
