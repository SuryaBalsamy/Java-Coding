import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        int ans=0;
        for(int i=0; i<arr.length; i++)
        {
            String val="";
            for(int j=i; j<arr.length; j++)
            {
               String ch=String.valueOf(arr[j]);
               if(val.contains(ch))
               {
                   break;
               }
               val+=ch;
               ans=Math.max(ans,val.length());
            }
        }
        System.out.println(ans);
    }
}
