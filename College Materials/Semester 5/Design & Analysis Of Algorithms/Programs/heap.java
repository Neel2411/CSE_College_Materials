import java.util.Scanner;
class Array
{
    void heapify(int a[],int n,int i)
    {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && a[left]>a[largest])
        {
            largest=left;
        }
        if(right<n && a[right]>a[largest])
        {
            largest=right;
        }
        if(largest !=i)
        {
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;
            heapify(a,n,largest);
        }
    }

    void heapsort(int a[])
    {
        int n=a.length;
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(a,n,i);
        }
        for(int i=n-1;i>=0;i--)
        {
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;

            heapify(a,i,0);
        }
    }
    void display(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
class heap
{
    public static void main (String args[])
    {
        Array arr = new Array();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be sorted: ");
        int n=sc.nextInt();
        int[] a=new int [n];
        int x=n;
        for (int i=0;i<n;i++)
        {
            if(i<50)
            {
                a[i]=i;
            }
            else 
            {
                a[i]=x;
                x--;
            }
        }
        System.out.println("Array before sorting: ");
        arr.display(a);
        long startTime = System.nanoTime();
        arr.heapsort(a);
        System.out.println("Array elements after sorting: ");
        arr.display(a);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Run-time Is : "+totalTime+" nanoseconds");
    }
}
