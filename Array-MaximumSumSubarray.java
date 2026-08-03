import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum<0)
            {
                sum=0;
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.print(max);
    }
}
