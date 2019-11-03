package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;

    @Before
    public void SetUp() {
        queue = new Queue();
    }

    @Test
    public void test1() {
        Object[] elements = new Object[]{1, 2, 3, 4, 5, 6};
        for (Object element : elements) {
            queue.enqueue(element);
        }
        for (int i = 0; i < elements.length; i++) {
            assertEquals(queue.peek(),elements[i]);
            assertEquals(queue.dequeue(),elements[i]);
        }
    }
    @Test
    public void test2() {
        Object[] elements = new Object[]{5,6,7,8,9,10,11};
        for (Object element : elements) {
            queue.enqueue(element);
        }
        for (int i = 0; i < elements.length; i++) {
            assertEquals(queue.peek(),elements[i]);
            assertEquals(queue.dequeue(),elements[i]);
        }
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void TestQueueError(){
        queue.dequeue();
    }

}
