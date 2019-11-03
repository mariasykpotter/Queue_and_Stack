package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;

    @Before
    public void SetUp() {
        stack = new Stack();
    }

    @Test
    public void test1() {
        Object[] elements = new Object[]{1, 2, 3, 4, 5, 6};
        for (Object element : elements) {
            stack.push(element);
        }
        for (int i = elements.length - 1; i >= 0; i--) {
            assertEquals(stack.peek(), elements[i]);
            assertEquals(stack.pop(), elements[i]);
        }
    }

    @Test
    public void test2() {
        Object[] elements = new Object[]{7, 6, 5, 4, 3, 2, 1};
        for (Object element : elements) {
            stack.push(element);
        }
        for (int i = elements.length - 1; i >= 0; i--) {
            assertEquals(stack.peek(), elements[i]);
            assertEquals(stack.pop(), elements[i]);
        }
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void TestStackError(){
        stack.pop();
    }

}
