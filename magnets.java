import java.util.Scanner;
public class magnets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] m=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			m[i]=sc.nextInt();
	     }
		for(int i=0;i<n-1;i++) {
			if(m[i]!=m[i+1]) {
				count++;
			}
		}System.out.println(count+1);
	}
		
}
