package MyPackage1;
public class FibonacciDemo
{
    public static void main(String[] args)
    {
        int n=6,t1=0,t2=1;
        for(int i=0;i<n;i++)
        {
            int sum=t1+t2;
            System.out.println(t1);
            t1=t2;
            t2=sum;
        }

    }
}
