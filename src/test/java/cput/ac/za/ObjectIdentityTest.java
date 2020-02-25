package cput.ac.za;

import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectIdentityTest
{
    //Creating object
    ObjectIdentity demo = new ObjectIdentity();

    @Test
    public void compareString()
    {
        assertSame(demo.compareString("hello", "hello"), demo.compareString("hello", "hello"));
    }
}