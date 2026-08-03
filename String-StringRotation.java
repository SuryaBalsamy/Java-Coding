import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        
        if((s+s).contains(t) && s.length()==t.length())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
