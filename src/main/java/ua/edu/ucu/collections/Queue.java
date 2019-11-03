package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList LinkedList;

    public Queue() {
        LinkedList = new ImmutableLinkedList();
    }

    //-Returns the object at the beginning of the Queue without removing it
    public Object peek() {
        return LinkedList.getFirst();
    }

    //- Removes and returns the object at the beginning of the Queue.
    public Object dequeue() {
        Object firstEl = LinkedList.getFirst();
        LinkedList = LinkedList.removeFirst();
        return firstEl;
    }

    //- Adds an object to the end of the Queue.
    public void enqueue(Object e) {
        LinkedList = LinkedList.add(e);
    }

}
