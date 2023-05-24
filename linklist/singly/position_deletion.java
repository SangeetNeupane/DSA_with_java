package linklist.singly;
import java.util.*;
public class position_deletion {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    void creation() {
        int n;
        do {
            Scanner rk = new Scanner(System.in);
            System.out.println("Enter the Data in list: ");
            int data = rk.nextInt();

            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to Enter more Data in list (if yes press 7): ");
            n = rk.nextInt();
        } while (n == 7);

    }

    void traverse() {

        if (head == null) {
            System.out.println("Link List Doesnot exist.");
        } else {
            node temp;
            temp = head;
            System.out.println("Data in Link List are:-");
            while (temp != null) {
                System.out.print("[" + temp.data + "] ");
                temp = temp.next;
            }

        }
    }
    
    void deletion(){
        Scanner rk = new Scanner(System.in);
        System.out.println("\nEnter The position you want to delete:-");
        int p=rk.nextInt();
        node temp=head;
        node ptr=temp.next;
        for(int i=1;i<(p-1);i++)
        {
        temp=ptr;
        ptr=ptr.next;
        }
        temp.next=ptr.next;
        System.out.println("\nData deleted from "+p+" In linklist");
    }

    public static void main(String[] args) {
        position_deletion rz = new position_deletion();
        rz.creation();
        rz.traverse();
        rz.deletion();
        rz.traverse();
    }
}
