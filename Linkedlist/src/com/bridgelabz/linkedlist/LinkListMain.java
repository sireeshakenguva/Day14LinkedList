package com.bridgelabz.linkedlist;

public class LinkListMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Linked List Program");
        Linkedlist list=new Linkedlist();
        list.add(56);
        list.add(70);
        list.display();
        System.out.println("30 is Inserting between 56 and 70");
        list.insert(list.head, 30);
        list.display();
        list.pop();
        list.display();

    }
}