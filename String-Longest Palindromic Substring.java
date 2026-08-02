import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(int i=0; i<s.length(); i++)
        {
            String val="";
            for(int j=i; j<s.length(); j++)
            {
                val+=s.charAt(j)+"";
                if(palin(val))
                {
                    if(val.length()>ans.length())
                    {
                        ans=val;
                    }
                }
            }
        }
        System.out.println(ans);
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
