import java.util.Scanner;

public class wOrD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		int count=0;
		int cnt=0;
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				count++;
			}
			else {
				cnt++;
			}
		}String b;
		if(count>cnt) {
			b=s.toUpperCase();
		}
		else {
			b=s.toLowerCase();
		}
		System.out.println(b);
	}

}
