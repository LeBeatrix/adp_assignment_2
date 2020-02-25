package cput.ac.za;

public class DisablingTest
{
    private String message;


    public DisablingTest(String message) {
        this.message = message;
    }


    public String printMessage() {
        return message;
    }


    public String sayHi() {
        message = "Heyie!" + message;
        return message;
    }


    public String leneMessage() {
        return "LeneP";
    }
}
