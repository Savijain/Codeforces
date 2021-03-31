import java.util.Scanner;

public class roomcapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			int f=sc.nextInt();
			int s=sc.nextInt();
			if(s-f>1) {
				count++;
			}
			}
		System.out.println(count);
		}
		
		
	}


