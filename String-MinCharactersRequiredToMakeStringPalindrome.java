import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=0;
        for(int i=s.length(); i>=1; i--)
        {
            String val="";
            for(int j=0; j<i; j++)
            {
                val+=s.charAt(j);
            }
            if(palin(val))
            {
                ans=s.length()-i;
                break;
            }
        }
        System.out.print(ans);
    }
    public static boolean palin(String val)
    {
        StringBuilder sb=new StringBuilder(val);
        if(val.equals(sb.reverse().toString()))
        {
            return true;
        }
        return false;
    }
}
