package MyPackage1;
public class DuplicateElement
{
        public static void main(String[] args)
        {
            //Initialize array
            int a[]={1, 20, 3, 4, 20, 7, 80, 80, 3};
            System.out.println("Duplicate elements in given array: ");
            //Searches for duplicate element
            for(int i = 0; i < a.length; i++)
            {
                for(int j = i + 1; j < a.length; j++)
                {
                    if(a[i] == a[j])
                    System.out.println(a[j]);
                }
            }
        }
 }

