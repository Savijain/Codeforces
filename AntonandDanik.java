import java.util.Scanner;
public class AntonandDanik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='A') {
				count++;
			}
		}
		if(count>n-count) {
			System.out.println("Anton");
		}
		else if(count==n-count) {
			System.out.println("Friendship");
		}
		else {
			System.out.println("Danik");
		}
	}

}
