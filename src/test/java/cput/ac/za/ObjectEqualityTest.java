package cput.ac.za;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectEqualityTest
{
        //Creating object
        ObjectEquality demo = new ObjectEquality();

    @Test
    public void compareString()
    {
        assertFalse(demo.compareString("hello","hell"));
        assertTrue(demo.compareString("hello", "hello"));
    }

    @Test
    public void concatString()
    {
        assertEquals("HelloWorld", demo.concatString("Hello","World"));
    }
}