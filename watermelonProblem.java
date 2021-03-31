import java.util.Scanner;
public class watermelonProblem 
{
    public static void main(String[] args) 
    {
    	System.out.println("Enter weight:4");
        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt();
        if(w>2)
        {
        if((w%2)==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
}