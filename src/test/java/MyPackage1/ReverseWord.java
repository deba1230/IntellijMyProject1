package MyPackage1;
import java.util.Scanner;
public class ReverseWord
{
    public static void main(String[] args)
    {
        String str="My Name is Deba";
        String str1="";
         //The string \s is a regular expression that means "whitespace",
        // and you have to write it with two backslash characters ( "\\s" ) when writing it as a string in Java
        //The split() method returns the new array.
        //splits the string based on whitespace.Splitting string into words
        //after every space we splits
        String[] words = str.split(" ");
        for (String a : words)
            System.out.println("The output of split function:"+ a);
        for (int i = 0; i< words.length; i++)
        {
            System.out.print(words[i] + " ");  //My Name is Deba prints here
        }
            System.out.println("");
        for(int i=words.length-1;i>=0;i--)
        {
            str1=str1+words[i]+" "; //Deba is Name My
        }
        System.out.println(str1);
        }
 }

