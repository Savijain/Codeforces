import java.util.Scanner;

public class vanyaandfence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int[] f=new int[n];
		for(int i=0;i<n;i++) {
			f[i]=sc.nextInt();
			if(f[i]>h) {
				w=w+2;
			}
			else {
				w=w+1;
			}
		}
		System.out.println(w);
	}

}
