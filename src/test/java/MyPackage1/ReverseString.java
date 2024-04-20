package MyPackage1;
public class ReverseString
{
    public static void main(String[] args)
    {
        String str = new String("My Name is Deba");
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("The Reverse string is:" + rev);
        if(str.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println(str +" Is Not a Palindrome");
        }
    }
}

