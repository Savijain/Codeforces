import java.util.*;
public class luckyNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int f=0;
        char c[] = s.toCharArray();
        
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='4' || c[i]=='7')
            {
                f++;
            }
        }
              
        if(f==0)
        {
            System.out.println("NO");
        }
        else if(f>0)
        {
            if(f==4 || f==7 || f==47 || f==74)
            {
            System.out.println("YES");
            }
            else
            {
            System.out.println("NO");
             }
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}

