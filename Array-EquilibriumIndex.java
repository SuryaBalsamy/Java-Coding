import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=Arrays.stream(arr).sum();
        int left=0;
        for(int i=0; i<arr.length; i++)
        {
           int right=sum-left-arr[i];
           if(left==right)
           {
               System.out.print(i);
               return;
           }
           left+=arr[i];
        }
        System.out.println(-1);
    }
}
