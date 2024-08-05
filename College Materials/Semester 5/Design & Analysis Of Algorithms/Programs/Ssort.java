import java.util.Scanner;
//Program using selection sort
class sort2
{
    void ssort(int[] a)
    {
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if (min > a[j])
                {
                    min = j;
                }
            }
            int temp = a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
    void dis(int[] arr)
    {
        int n=arr.length;
        System.out.println("Sorted Array Is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
class Ssort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements You Want In a Array : ");
        int n=sc.nextInt();
        int[] a = new int [n];
        System.out.println("Enter The Values Of Elements In Array : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Your Array Is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
        sort2 b = new sort2();
        long startTime = System.nanoTime();
        b.ssort(a);
        b.dis(a);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Run-time Is : "+totalTime+" nanoseconds");
    }
}
