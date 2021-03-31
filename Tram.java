import java.util.Scanner;

public class Tram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] v=new int[2*n];
		for(int i=0;i<2*n;i++) {
			v[i]=sc.nextInt();
		}
		int sum=0;
		int max=0;
		for(int i=0;i<2*n;i=i+2) {
			sum=sum+v[i+1]-v[i];
			
			if(sum>max) {
				max=sum;
			}
			
		}System.out.println(max);
	}

}
