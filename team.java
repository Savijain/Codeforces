import java.util.Scanner;

public class team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			sum=a+b+c;
			if(sum>=2) {
				count++;
			}
		}
		
		System.out.println(count);
	
	}
}

