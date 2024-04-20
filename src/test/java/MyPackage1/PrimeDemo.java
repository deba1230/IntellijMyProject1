package MyPackage1;
public class PrimeDemo
{
    public static void main(String[] args)
    {
        int no = 6;
        boolean b = false;
        for (int i = 2; i <= no / 2; i++)
        {
            if (no % 2 == 0)
            {
                b = true;
                break;
            }
        }
        if (b == false)
        {
            System.out.println(no + "" + "is a prime no");
        }
        else
        {
            System.out.println(no+" is not prime no");
        }
    }
}
