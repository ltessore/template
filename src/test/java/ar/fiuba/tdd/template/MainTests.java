package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTests {

    @Test
    public void createList() {
        TQueue<Integer> queueInteger = new TQueue<Integer>();
        assertEquals(queueInteger.size(), 0);
        assertTrue(queueInteger.isEmpty());
    }

    @Test
    public void addElement() {
        TQueue<Integer> queueInteger = new TQueue<Integer>();
        Integer element = 10;
        queueInteger.add(element);
        assertEquals(queueInteger.size(), 1);
        assertTrue(!queueInteger.isEmpty());
        assertEquals(queueInteger.top(), element);
    }

    @Test
    public void addMoreElements() {
        TQueue<String> queueString = new TQueue<String>();
        String element = "A string";
        String otherElement = "Other element";
        queueString.add(element);
        queueString.add(otherElement);
        assertEquals(queueString.size(), 2);
        assertTrue(!queueString.isEmpty());
        assertEquals(queueString.top(), element);
    }

    @Test
    public void removeElement() {
        TQueue<String> queueString = new TQueue<String>();
        String element = "A string";
        queueString.add(element);
        queueString.remove();
        assertEquals(queueString.size(), 0);
        assertTrue(queueString.isEmpty());
    }

    @Test
    public void removeMoreElement() {
        TQueue<String> queueString = new TQueue<String>();
        String element = "A string";
        String otherElement = "Other element";
        queueString.add(element);
        queueString.add(otherElement);

        queueString.remove();
        assertEquals(queueString.size(), 1);
        assertTrue(!queueString.isEmpty());
        assertEquals(queueString.top(), otherElement);

        queueString.remove();
        assertEquals(queueString.size(), 0);
        assertTrue(queueString.isEmpty());
    }

    @Test(expected = AssertionError.class)
    public void removeInEmptyList() {
        TQueue<Integer> queueInteger = new TQueue<Integer>();
        queueInteger.remove();
    }

    @Test(expected = AssertionError.class)
    public void topInEmptyList() {
        TQueue<Integer> queueInteger = new TQueue<Integer>();
        queueInteger.top();
    }
}
