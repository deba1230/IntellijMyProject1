package MyPackage1;
public class ReplaceAllDemo
{
    public static void main(String[] args)
    {
        String s1="My name is Deba. My name is Bibhas. My name is Hai.";
        String s2=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(s2);
    }
}
