package cput.ac.za;

public class ObjectIdentity
{

    public boolean compareString(String first, String second)
    {
        if(first.equalsIgnoreCase(second))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
