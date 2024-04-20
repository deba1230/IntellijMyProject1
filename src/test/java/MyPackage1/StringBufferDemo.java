package MyPackage1;
public class StringBufferDemo
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("Java"); // now original string is changed
        System.out.println("Apended string is :"+sb);
        StringBuffer sb1 = new StringBuffer("Deba");
        sb1.reverse();
        System.out.println("The reverse string is :"+sb1);
        StringBuffer sb2 = new StringBuffer("Babita");
        sb2.replace(1,3,"Java");//The replace() method replaces the given
        // string from the specified beginIndex and endIndex-1.
        System.out.println("Replace String is :"+sb2);

    }
}
