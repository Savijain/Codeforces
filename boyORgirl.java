import java.util.Scanner;

public class boyORgirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		String s=sc.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {	
			if(ch[i]==ch[j]) {
				count++;
				break;
			}
			}	
		}
		long ans = s.length() - count;
		if(ans%2==0) {
			System.out.println("CHAT WITH HER!");
		}
		else
			System.out.println("IGNORE HIM!");
	}

}

