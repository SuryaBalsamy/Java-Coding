import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        if(arr.length == 0)
        {
            return 0;
        }
        Arrays.sort(arr);
        int max=1;
        int count=1;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]==arr[i+1])
            {
                continue;
            }
            if(arr[i]==arr[i+1]-1)
            {
                count++;
            }
            else
            {
                count=1;
            }
            max=Math.max(count,max);
        }
        System.out.println(max);
    }
}
