package MyPackage1;
import java.util.Arrays;
import java.util.Collections;

public class SecondHighest
{
    public static void main(String[] args)
    {
        int[] a = {8000,4000,3000,40,50,60,750,100,10,5000};
        int size=a.length;
        System.out.println("The size of array:"+size);
        System.out.println("Original Array : "+Arrays.toString(a));
        Arrays.sort(a); //its a static method and does not return any value and its sorted in ascending no
        //it parses through each element of an array and sorts it in ascending or descending order as specified.
        System.out.println("Sorted numeric array : "+ Arrays.toString(a));
        int res = a[size-2];
        System.out.println("The 2nd largest no is : " +res);
        int res1= a[size-3];
        System.out.println("The 3rd largest no is : " +res1);
        //Arrays.sort(a,Collections.reverseOrder());
        //System.out.println("Array sorted in descending order :"+Arrays.toString(a));
    }
}
