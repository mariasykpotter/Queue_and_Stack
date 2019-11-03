package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList linkedList;

    public Stack() {
        linkedList = new ImmutableLinkedList();
    }

    Object peek() {
        return linkedList.getFirst();
    }

    Object pop() {
        Object firstEl = linkedList.getFirst();
        linkedList = linkedList.removeFirst();
        return firstEl;
    }

    void push(Object e) {
        linkedList = linkedList.addFirst(e);
    }

}