package linklist.doubly;

import java.util.*;

public class end_insert{
    static class node {
        int data;
        node next;
        node prev;

        node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    node head = null;
    node tail = null;
    Scanner rk = new Scanner(System.in);

    void create() {
        int n;
        do {
            System.out.println("Enter the data");
            int data = rk.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;

            } else {
                tail.next=new_node;
                new_node.prev = tail;
                tail = new_node;
            }
            System.out.println("If you like to enter more data press 1 else press 0");
            n = rk.nextInt();
        } while (n == 1);
    }

    void traverse() {
        if (head == null) {
            System.out.println("Link List is Empty.");
        }
        else{
            node temp=head;
            while(temp!=null){
                System.out.print("[" + temp.data + "] ");
                temp=temp.next;
            }

        }

    }
    public static void main(String[] args) {
        end_insert rz=new end_insert();
        rz.create();
        rz.traverse();
       
    }

}
