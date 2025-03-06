package dsa;
//DoublyLinkedList
class DoubleNode
{
  int data;
  DoubleNode prev;
  DoubleNode next;
}
class process3 extends DoubleNode{

  DoubleNode head;DoubleNode tail;

  void insertBegin(int data)
  {
        DoubleNode newnode=new DoubleNode();
        newnode.data=data;
        newnode.prev=null;
        newnode.next=null;

        if(head==null){
        head=newnode;
        tail=newnode;}
        else{
          head.prev=newnode;
          newnode.next=head;
          head=newnode;
         
        }
       
  }

  void insertEnd(int data)
  {
      DoubleNode newnode=new DoubleNode();
        newnode.data=data;
        newnode.prev=null;
        newnode.next=null;
       
        if(head==null){
          head=newnode;
          tail=newnode;}
        else{
          tail.next=newnode;
          newnode.prev=tail;
          tail=newnode;
        }

  }

  void insertPos(int pos, int data)
  {
      DoubleNode newnode=new DoubleNode();
        newnode.data=data;
        newnode.prev=null;
        newnode.next=null;

      if(pos==0)
      insertBegin(data);
      else{
          DoubleNode temp=head;
          for(int i=1;i<=pos-1;i++)
          {
              temp=temp.next;
          }
          System.out.println(newnode.data+" ----");
          System.out.println(temp.data+" ----");
          temp.next.prev=newnode;
          newnode.next=temp.next;
          temp.next=newnode;
          newnode.prev=temp;
      }
  }

  void deleteBegin()
  {
      DoubleNode temp=head;
      if(head==null)
      {
          System.out.println("Empty");
      }
      else{
          temp.next.prev=null;
          head=head.next;
      }
  }

  void deleteEnd()
  {
     
      //DoubleNode temp=head;
     // DoubleNode pre=null;
      if(head==null)
      {
          System.out.println("Empty");
      }
      else{
          /*while(temp.next!=null)
          {
              pre=temp;
              temp=temp.next;
          }
          pre.next=null;
          temp.prev=null;*/
          tail=tail.prev;
          tail.next.prev=null;
          tail.next=null;
      }
  }

  void deletePos(int pos)
  {
      DoubleNode temp=head;
      DoubleNode pre=null;
      if(head==null)
      {
          System.out.println("Empty");
      }
      else{
          for(int i=1;i<=pos;i++)
          {
              pre=temp;
              temp=temp.next;
          }
          temp.next.prev=pre;
          pre.next=temp.next;
          temp.next=null;
          temp.prev=null;

      }
  }

  void display()
  {
       DoubleNode temp=head;
       while(temp!=null)
       {
          System.out.println(temp.data);
          temp=temp.next;
       }
  }

  void revdisplay()
  {
      DoubleNode temp=tail;
      while(temp!=null)
      {
          System.out.println(temp.data);
          temp=temp.prev;
      }
  }


}

public class DoublyLinkedList extends process3 {
  public static void main(String[] args) {
      DoublyLinkedList dl=new DoublyLinkedList();
      System.out.println("Insert at Begin");
      dl.insertBegin(1);
      dl.insertBegin(2);
      dl.insertBegin(3);
      dl.insertBegin(4);
      dl.display();
      System.out.println("Reversing the List");
      dl.revdisplay();
      System.out.println("Insert at End");
      dl.insertEnd(5);
      dl.display();
      System.out.println("Insert at Position");
      dl.insertPos(2,6);
      dl.display();
      System.out.println("Delete at Begin");
      dl.deleteBegin();
      dl.display();
      System.out.println("Delete at End");
      dl.deleteEnd();
      dl.display();
      System.out.println("Delete at Position");
      dl.deletePos(1);
      dl.display();
      System.out.println("Reversing the List");
      dl.revdisplay();

  }
}

