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
        for(int i=0; i<arr.length; i++)
        {
            int count=1;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.println(-1); 
    }
}
