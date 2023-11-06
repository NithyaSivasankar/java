class Linkedlist {
    Node head;
    public class Node {
        Node next;
        int data;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public void insertatpos(int pos, int val) {
        if(pos==0){
            insertatbeginning(val);
            return;
        }
        Node newnode = new Node(val);
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp==null){
                System.out.println("invalid pos");
                return;
            }
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }





    public void insertatbeginning(int val) {
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }
        else{

            newnode.next=head;
            head=newnode;
        }
    }

    public void display() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
    }






        }
    

    	public static void main(String[] args) {
        	Linkedlist list = new Linkedlist();
        	list.insertatbeginning(5);
        	list.insertatbeginning( 6);
        	list.insertatpos(1,8);
        	list.insertatpos(5,0);
        	list.display();



    }
}






