import java.util.Scanner;

public class drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			float n=sc.nextInt();
			float[] a=new float[(int) n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			float sum=0;
			for(int j=0;j<n;j++) {
				sum=sum+a[j];
			}
			System.out.printf("%.12f",sum/n);
	}

}
