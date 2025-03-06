package dsa;
//CircularSinglyLinkedList
class CircNode{
   int data;
   CircNode next;
}
class process2 extends CircNode{
  CircNode head;

  void insertBegin(int data)
  {
         CircNode newnode=new CircNode();
         newnode.data=data;
         newnode.next=null;

         if(head==null)
         {
          head=newnode;
          newnode.next=head;
         }
         else{
          CircNode temp=head;
          while(temp.next!=head)
          {
              temp=temp.next;
          }
          temp.next=newnode;
          newnode.next=head;
          head=newnode;
         }
  }

  void insertEnd(int data)
  {
      CircNode newnode=new CircNode();
         newnode.data=data;
         newnode.next=null;

         if(head==null)
         {
          head=newnode;
          newnode.next=head;
         }
         else{
          CircNode temp=head;
          while(temp.next!=head)
          {
              temp=temp.next;
          }
          newnode.next=head;
          temp.next=newnode;
         }
  }

  void insertPos(int pos, int data)
  {
      CircNode newnode=new CircNode();
      newnode.data=data;
      newnode.next=null;

      if(head==null)
         {
          head=newnode;
          newnode.next=head;
         }

      if(pos==0)
      insertBegin(data);
      else{
          CircNode temp=head;
          for(int i=1;i<=pos-1;i++)
          {
              temp=temp.next;
          }
          newnode.next=temp.next;
          temp.next=newnode;
      }

  }

  void deleteBegin()
  {
      if(head==null)
      System.out.println("Empty");
      CircNode temp=head;
      while(temp.next!=head)
      {
          temp=temp.next;
      }
      head=head.next;
      temp.next=head;
  }

  void deleteEnd()
  {
      if(head==null)
      System.out.println("Empty");
      CircNode temp=head;
      CircNode pre=null;
      while(temp.next!=head)
      {
          pre=temp;
          temp=temp.next;
      }
      pre.next=head;
      temp.next=null;

  }

  void deletePosition(int pos)
  {
      if(pos==0)
      deleteBegin();
      else{
          CircNode temp=head;
          CircNode pre=null;
          for(int i=1;i<=pos;i++)
          {
              pre=temp;
              temp=temp.next;
          }
          pre.next=temp.next;
         
      }
  }

  void display()
  {
      CircNode temp = head;
     while(temp.next!=head)
     {
      System.out.println(temp.data);
      temp=temp.next;
     }
     System.out.println(temp.data);
     
  }

 
}

public class CircularSinglyLinkedList extends process2{
  public static void main(String[] args) {
     
 
  CircularSinglyLinkedList csl=new CircularSinglyLinkedList();
  System.out.println("Insert at Begin");
  csl.insertBegin(1);
  csl.insertBegin(2);
  csl.insertBegin(3);
  csl.insertBegin(4);
  csl.display();
  System.out.println("Insert at End");
  csl.insertEnd(5);
  csl.display();
  System.out.println("Insert at Position");
  csl.insertPos(2,6);
  csl.display();
  System.out.println("Delete at Begin");
  csl.deleteBegin();
  csl.display();
  System.out.println("Delete at End");
  csl.deleteEnd();
  csl.display();
  System.out.println("Delete at Position");
  csl.deletePosition(1);
  csl.display();


  }
}

