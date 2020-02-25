package cput.ac.za;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailingTestTest
{
        FailingTest demo = new FailingTest();


    @Test
    public void concatString()
    {
        assertEquals("HelloWorlds", demo.concatString("Hell","World"));
    }
}