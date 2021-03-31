import java.util.Scanner;

public class TooLongWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] w=new String[n];
		for(int i=0;i<n;i++) {
			w[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
		if(w[i].length()>10) {
			System.out.print(w[i].charAt(0));
			System.out.print(w[i].length()-2);
			System.out.print(w[i].charAt(w[i].length()-1));
			}
		else
			System.out.println(w[i]);
			
		System.out.println("\n");
		}
		}
	}


