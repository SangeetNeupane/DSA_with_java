package linklist.doubly;

import java.util.*;

public class spec_del {
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
                head.prev = new_node;
                new_node.next = head;
                head = new_node;
            }
            System.out.println("If you like to enter more data press 1 else press 0");
            n = rk.nextInt();
        } while (n == 1);
    }

    void traverse() {
        if (head == null) {
            System.out.println("Link List is Empty.");
        } else {
            node temp = head;
            while (temp != null) {
                System.out.print("[" + temp.data + "] ");
                temp = temp.next;
            }

        }

    }

    void delete() {
        System.out.println("\nEnter the position to delete:");
        int del = rk.nextInt();
        node temp = head;
        node ptr=temp.next;

        for (int i = 1; i < (del - 1); i--) {
            temp = ptr;
            ptr=ptr.next;

        }
        temp.next=ptr.next;

        System.out.println("\nAfter deletion");

    }

    public static void main(String[] args) {
        spec_del rz = new spec_del();
        rz.create();
        rz.traverse();
        rz.delete();
        rz.traverse();

    }

}
