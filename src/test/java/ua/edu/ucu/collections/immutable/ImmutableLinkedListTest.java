package ua.edu.ucu.collections.immutable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    private ImmutableLinkedList emptyArr;
    private ImmutableLinkedList smallArr;
    private Object[] sampleList = new Object[]{10, 11, 12};

    @Before
    public void setUp() {
        smallArr = new ImmutableLinkedList(new Object[]{1, 2, 3, 4, 5});
        emptyArr = new ImmutableLinkedList();
    }

    @Test
    public void testListAdd() {
        ImmutableList newArr = smallArr.add(1);
        Object[] expected = new Object[]{1, 2, 3, 4, 5, 1};
        Object[] expectedSmall = new Object[]{1, 2, 3, 4, 5};
        assertArrayEquals(newArr.toArray(), expected);
//            assertArrayEquals(smallArr.toArray(), expectedSmall);
    }

    @Test
    public void testListAddIndex() {
        ImmutableList foundArr = smallArr.add(1, 2);
        Object[] expectedArr = new Object[]{1, 2, 2, 3, 4, 5};
        assertArrayEquals(foundArr.toArray(), expectedArr);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListAddIndexOutOfRange() {
        ImmutableList actual = smallArr.add(12, 5);
    }

    @Test
    public void testAddAll() {
        ImmutableList foundArr = smallArr.addAll(sampleList);
        Object[] expectedArr = new Object[]{1, 2, 3, 4, 5, 10, 11, 12};
        assertArrayEquals(foundArr.toArray(), expectedArr);
    }

    @Test
    public void testAddAllIndex() {
        ImmutableList foundArr = smallArr.addAll(1, sampleList);
        Object[] expectedArr = new Object[]{1, 10, 11, 12, 2, 3, 4, 5};
        assertArrayEquals(foundArr.toArray(), expectedArr);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListAddAllIndexOutOfRange() {
        ImmutableList actual = smallArr.addAll(12, sampleList);
    }

    @Test
    public void testGet() {
        Object El = smallArr.get(3);
        Object expected = 4;
        assertEquals(El, expected);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListGetIndexOutOfRange() {
        Object obj = smallArr.get(12);
    }

    @Test
    public void testRemove() {
        ImmutableList newArr = smallArr.remove(1);
        Object[] expectedArr = new Object[]{1, 3, 4, 5};
        assertArrayEquals(newArr.toArray(), expectedArr);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListRemoveIndexOutOfRange() {
        ImmutableList newArr = smallArr.remove(12);
    }

    @Test
    public void TestSet() {
        ImmutableList newArr = smallArr.set(4, 6);
        Object[] expectedArr = new Object[]{1, 2, 3, 4, 6};
        assertArrayEquals(newArr.toArray(), expectedArr);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListSetIndexOutOfRange() {
        ImmutableList newArr = smallArr.set(-1, 12);
    }

    @Test
    public void TestIndexOf() {
        int index = smallArr.indexOf(5);
        int expected_index = 4;
        assertEquals(expected_index, index);
    }

    @Test
    public void TestIndexOfNotExisting() {
        int index = smallArr.indexOf(11);
        int expected_index = -1;
        assertEquals(expected_index, index);
    }

    @Test
    public void Testsize() {
        int size = smallArr.size();
        int expected = 5;
        assertEquals(expected, size);
    }

    @Test
    public void TestClear() {
        ImmutableList newArr = smallArr.clear();
        assertEquals(newArr.size(), 0);
    }

    @Test
    public void TestTrueEmpty() {
        assertTrue(emptyArr.isEmpty());
    }

    @Test
    public void TestFalseEmpty() {
        assertFalse(smallArr.isEmpty());
    }

    @Test
    public void TesttoArray() {
        Object[] Arr = smallArr.toArray();
        Object[] expected = new Object[]{1, 2, 3, 4, 5};
        assertArrayEquals(Arr, expected);
    }

    @Test
    public void TesttoString() {
        assertEquals(smallArr.toString(), "1, 2, 3, 4, 5");

    }
    @Test
    public void TestAddFirst(){
        ImmutableLinkedList actual = smallArr.addFirst(1);
        Object[] expected = new Object[]{1,1,2,3,4,5};
        assertArrayEquals(actual.toArray(),expected);
    }
    @Test
    public void TestAddFirstEmpty(){
        ImmutableLinkedList actual = emptyArr.addFirst(1);
        Object[] expected = new Object[]{1};
        assertArrayEquals(actual.toArray(),expected);
    }
    @Test
    public void TestAddLast(){
        ImmutableLinkedList actual = smallArr.addLast(1);
        Object[] expected = new Object[]{1,2,3,4,5,1};
        assertArrayEquals(actual.toArray(),expected);
    }
    @Test
    public void TestAddLastEmpty(){
        ImmutableLinkedList actual = emptyArr.addLast(1);
        Object[] expected = new Object[]{1};
        assertArrayEquals(actual.toArray(),expected);
    }
    @Test
    public void TestGetFirst(){
        Object actual = smallArr.getFirst();
        Object expected = 1;
        assertEquals(actual,expected);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void TestGetFirstEmpty(){
        Object first = emptyArr.getFirst();
    }
    @Test
    public void TestGetLast(){
        Object actual = smallArr.getLast();
        Object expected = 5;
        assertEquals(actual,expected);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void TestGetLastEmpty(){
        Object last = emptyArr.getLast();
    }
    @Test
    public void RemoveFirst(){
        ImmutableLinkedList actual = smallArr.removeFirst();
        Object[] expected = new Object[]{2,3,4,5};
        assertArrayEquals(actual.toArray(),expected);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void TestRemoveFirstEmpty(){
        Object last = emptyArr.removeFirst();
    }
    @Test
    public void RemoveLast(){
        ImmutableLinkedList actual = smallArr.removeLast();
        Object[] expected = new Object[]{1,2,3,4};
        assertArrayEquals(actual.toArray(),expected);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void TestRemoveLastEmpty(){
        Object last = emptyArr.removeLast();
    }

}