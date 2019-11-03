package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList LinkedList;

    public Stack() {
        LinkedList = new ImmutableLinkedList();
    }

    Object peek() {
        return LinkedList.getFirst();
    }

    Object pop() {
        Object firstEl = LinkedList.getFirst();
        LinkedList = LinkedList.removeFirst();
        return firstEl;
    }

    void push(Object e) {
        LinkedList = LinkedList.addFirst(e);
    }

}
