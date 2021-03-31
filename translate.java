import java.util.Scanner;

public class translate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		StringBuilder s1=new StringBuilder();
		StringBuilder t1=new StringBuilder();
		t1.append(t);
		s1.append(s);
		s1.reverse();
		if(t1.compareTo(s1)==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
