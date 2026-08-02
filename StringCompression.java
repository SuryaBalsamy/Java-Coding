import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        int count=1;
        for(int i=0; i<s.length(); i++)
        {
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else 
            {
                res+=s.charAt(i);
                if(count>1)
                {
                  res+=count;
                }
                count=1;
            }
        }
        System.out.println(res);
    }
}
