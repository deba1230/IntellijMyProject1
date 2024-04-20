package MyPackage1;

public class ReverseChar
{
    public static void main(String[] args)
    {
        String str1="Deba Prasanna Rout";
        char ch;
        String str2="";
        for(int i=0;i<str1.length();i++)
        {
            ch=str1.charAt(i);
            str2=ch+str2;
        }
        System.out.println("The Reverse word is "+str2);
    }
}
