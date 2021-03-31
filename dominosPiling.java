import java.util.Scanner;

public class dominosPiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		if(N%2==0) {
			System.out.println(M*(N/2));
		}
		else if(N%2!=0) {
			System.out.println((M*(N-1)/2)+(M/2));
		}
		else {
			System.out.println(M*(N-1)/2+(N-1)/2);
		}
		
	}

}
