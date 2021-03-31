import java.util.Scanner;

public class Capitalization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
		
	}

}
