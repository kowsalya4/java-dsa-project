class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    
}
public class Linkedlist {
    Node head=null;
    
    void insertbegin(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("null");
    }
  public static void main(String[] args){
   Linkedlist list=new Linkedlist();
   list.insertbegin(1);
   list.insertbegin(2);
   list.insertbegin(3);
   list.insertbegin(4);
        list.display();
    }
    
}
