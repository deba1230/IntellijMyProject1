package MyPackage1;
public class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
        String str1 = "Saket Saurav        is a QualityAna    list";
        //1. Using replaceAll() Method
        String str2 = str1.replaceAll("\\s", "");//\\s - matches single whitespace character. \\s+ - matches
         // sequence of one or more whitespace characters
        //\\s matches a single white space. \s means space and \\s makes it regex to match a space.
        // To remove all space either replaceAll or \\s+ can be used
        System.out.println("The output of replace All method: " + str2);
        String s = "My\\s aaab\\s is\\s aaab\\s name";
        String s1 = s.replace("\\s", "c");
        System.out.println("The output of replace method : "+ s1);//Myc aaabc isc aaabc name
     }
}
