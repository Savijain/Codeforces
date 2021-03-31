import java.util.Scanner;

public class bearWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=1;
		do {
			a=a*3*i;
			b=b*2*i;
			i++;
			
		}
		while(a<=b);
		System.out.println(i-1);
	}

}
