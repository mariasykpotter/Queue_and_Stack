package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList linkedList;

    public Queue() {
        linkedList = new ImmutableLinkedList();
    }

    //-Returns the object at the beginning of the Queue without removing it
    public Object peek() {
        return linkedList.getFirst();
    }

    //- Removes and returns the object at the beginning of the Queue.
    public Object dequeue() {
        Object firstEl = linkedList.getFirst();
        linkedList = linkedList.removeFirst();
        return firstEl;
    }

    //- Adds an object to the end of the Queue.
    public void enqueue(Object e) {
        linkedList = linkedList.add(e);
    }

}
