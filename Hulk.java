import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			if(i%2==1) {
				System.out.print("I hate that ");
			}
			else {
				System.out.print("I love that ");
			}
		}
		if(n%2==1) {
			System.out.println("I hate it\n");
		}
		if(n%2==0) {
			System.out.println("I love it\n");
		}
	}

}
