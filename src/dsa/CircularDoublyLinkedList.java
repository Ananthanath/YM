package dsa;
//CircularDoublyLinkedList
class CircDNode{
  int data;
  CircDNode next;
  CircDNode prev;
}

class process1 extends CircDNode{
  CircDNode head;

  void insertBegin(int data)
  {
      CircDNode newnode=new CircDNode();
      newnode.data=data;
      newnode.next=null;
      newnode.prev=null;

      if(head==null)
      {
          head=newnode;
          newnode.next=head;
          newnode.prev=head;
      }
      else{
          CircDNode temp=head;
          while(temp.next!=head)
          {
              temp=temp.next;
          }
          newnode.next=head;
          head.prev=newnode;
          temp.next=newnode;
          newnode.prev=temp;
          head=newnode;
      }
  }

  void insertEnd(int data)
  {
      CircDNode newnode=new CircDNode();
      newnode.data=data;
      newnode.next=null;
      newnode.prev=null;

      if(head==null)
      {
          head=newnode;
          newnode.next=head;
          newnode.prev=head;
      }
      else{
          CircDNode temp=head;
          while(temp.next!=head)
          {
              temp=temp.next;
          }
          temp.next=newnode;
          newnode.next=head;
          newnode.prev=temp;
          head.prev=newnode;
      }
  }

  void insertPos(int pos, int data)
  {
      if(pos==0)
      insertBegin(data);
      CircDNode newnode=new CircDNode();
      newnode.data=data;
      newnode.next=null;
      newnode.prev=null;

      if(head==null)
      {
          head=newnode;
          newnode.next=head;
          newnode.prev=head;
      }
      else{
          CircDNode temp=head;
          for(int i=1;i<=pos-1;i++)
          {
              temp=temp.next;
          }
          temp.next.prev=newnode;
          newnode.next=temp.next;
          newnode.prev=temp;
          temp.next=newnode;
      }

  }

  void deleteBegin()
  {
      if(head==null)
      System.out.println("Empty");
      else{
          head.next.prev=head.prev;
          head.prev.next=head.next;
          head=head.next;
      }
  }

  void deleteEnd()
  {
      if(head==null)
      System.out.println("Empty");
      else{
          head.prev.prev.next=head;
          head.prev=head.prev.prev;
      }
  }

  void deletePosition(int pos)
  {
      if(head==null)
      System.out.println("Empty");
      if(pos==0)
      deleteBegin();
      else{
          CircDNode temp=head;
          CircDNode pre=null;
          for(int i=1;i<=pos;i++)
          {
              pre=temp;
              temp=temp.next;
          }
          pre.next=temp.next;
          temp.next.prev=pre;


      }
  }

  void display()
  {
      CircDNode temp=head;
      while(temp.next!=head){
          System.out.println(temp.data);
          temp=temp.next;
      }
      System.out.println(temp.data);
  }

}
public class CircularDoublyLinkedList extends process1 {
  public static void main(String[] args) {
      CircularDoublyLinkedList cdl=new CircularDoublyLinkedList();
      System.out.println("Insert at Begin");
      cdl.insertBegin(1);
      cdl.insertBegin(2);
      cdl.insertBegin(3);
      cdl.insertBegin(4);
      cdl.display();
      System.out.println("Insert at End");
      cdl.insertEnd(5);
      cdl.display();
      System.out.println("Insert at Position");
      cdl.insertPos(2,6);
      cdl.display();
      System.out.println("Delete at Begin");
      cdl.deleteBegin();
      cdl.display();
      System.out.println("Delete at End");
      cdl.deleteEnd();
      cdl.display();
      System.out.println("Delete at Position");
      cdl.deletePosition(1);
      cdl.display();
     

  }
 
}

