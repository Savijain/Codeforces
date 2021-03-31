import java.util.Scanner;

public class petyaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String l1=sc.next();
		String l2=sc.next();
		if(l1.toLowerCase().compareTo(l2.toLowerCase())<0) {
			System.out.println("-1");
		}
		else if(l1.toLowerCase().compareTo(l2.toLowerCase())>0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		

	}
}
