import java.util.Scanner;

public class Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int X=0;
		String[] s=new String[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		String a="X++";
		String b="++X";
		for(int i=0;i<n;i++) {
		if(s[i].equals(a)||s[i].equals(b)) {
			X++;
		}
		else
			X--;
		}
		System.out.println(X);
	}
	}


