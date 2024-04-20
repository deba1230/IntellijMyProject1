package MyPackage1;
public class PalindromeNo
{
    public static void main(String[] args)
    {
        int n = 5556,rem;
        int rev = 0;
        int temp;
        temp=n;
        while (temp != 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (n == rev)
        {
            System.out.println(n + "" + " is a palindrome no");
        } else
        {
            System.out.println(n + "" + " is not a palindrome no");
        }
    }
}

