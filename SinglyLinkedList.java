package com.example;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;
    public SinglyLinkedList() {
        this("linked list");
    }
    public SinglyLinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }
    public void insertAtFront(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) { // firstNode and lastNode refer to sameobject
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // firstNode refers to new node
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }
    public void insertAtBack(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) { // firstNode and lastNode refer to sameobject
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // lastNode refers to new node
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }
    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = lastNode.data; // retrieve data being removed
        // update references firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else { // locate new last node
            ListNode<E> current = firstNode;
            // loop while current node does not refer to lastNode
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current; // current is new lastNode
            current.next = null;
        }
        return removedItem; // return removed node data
    }
    private boolean isEmpty() {
        return firstNode == null;
    }
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is: %n", name);
        ListNode<E> current = firstNode;
        // while not at end of list, output current node's data
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }
}

