package MyPackage1;
public class upperLowerCount
{
    public static void main(String[] args)
    {
        String str="Deba Prasanna Rout";
        int lower=0;
        int upper=0;
        for(int i=0;i<str.length();i++)
        {
        char ch=str.charAt(i);
        if(ch>=65 && ch<=90)
        {
            upper=upper+1;
        }
        else
        {
            lower=lower+1;
        }
        }
        System.out.println("No. of Lowercase in string:" +lower);
        System.out.println("No. of Uppercase in string:"+upper);
    }
}
