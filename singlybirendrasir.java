public class singlybirendrasir{
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
                
        }
    }
    public Node head=null;
    
    public void addNode(int data) {
        Node newNode=new Node(data);
        if(head==null) 
        {
            head=newNode;
          
              
        }
        else {
            newNode.next=head;
            head =newNode;
            
        }
    }
    public void display() 
    {
        Node current=head;
        if(head==null) {
            System.out.println("List is empty");
            return;
                }
        System.out.println("Nodes of Singly List list :");
        while(current!=null) {
            System.out.println(current.data+"");
            current=current.next;
        }
        System.out.println();
        }
    
    
    
        public static void main(String[] args) {
            singlybirendrasir sList=new singlybirendrasir();
            sList.addNode(1);
            sList.addNode(2);
            sList.addNode(3);
            sList.addNode(4);
            sList.display();
    
        }
    }
