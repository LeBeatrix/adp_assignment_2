package cput.ac.za;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.*;

public class DisablingTestTest {

    private String naeMsg = "Lenes Testing";
    private DisablingTest dis = new DisablingTest(naeMsg);

    @Test
    public void testPrintMessage() {
        assertThat(dis.printMessage(), isA(String.class));
        assertEquals(naeMsg, dis.printMessage());

    }

    @Test
    public void testSalutationMessage() {
        String messageSal = dis.sayHi();
        assertThat(messageSal, isA(String.class));
        assertEquals("Heyie!" + naeMsg,messageSal);
    }


    @Ignore
    @Test
    public void testSalutationMessageForExecutives() {
        assertThat(dis.leneMessage(), isA(String.class));
        assertEquals(naeMsg, dis.sayHi());
    }

}