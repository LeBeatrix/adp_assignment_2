package cput.ac.za;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TimeOutTest
{

    private static TimeOut time;

    @BeforeClass
    public static void init() {
        time = new TimeOut(500000, 100);
    }

    @Test(timeout = 2000)
    public void totalCashTest() throws InterruptedException {
        assertThat(10.0, is(time.getCash()));
    }

    @Test(timeout = 1000)
    public void totalAccountTest() throws InterruptedException {
        assertThat(100, is(time.getAccount()));
    }

}