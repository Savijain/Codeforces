
import java.util.Scanner;

public class nextRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] s=new int[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.nextInt();
		}
int key = s[k-1];
        
        for(int j=0;j<n;j++)
        {
            if(s[j]>=key && s[j]>0)
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
}