package MyPackage1;
public class SumofArray
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50,30};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("The sum of arrays is " + sum);

    }
}
