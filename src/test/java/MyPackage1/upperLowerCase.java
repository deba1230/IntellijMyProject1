package MyPackage1;
public class upperLowerCase
{
         public static void main(String[] args)
        {
            String str="Deba Prasanna Rout";
            String lower="";
            String upper="";
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch>=65 && ch<=90)
                {
                    upper=upper+ch;
                }
                else
                {
                    lower=lower+ch;
                }
            }
            System.out.println("Lowercase in string:" +lower);
            System.out.println("Uppercase in string:"+upper);
        }
    }


