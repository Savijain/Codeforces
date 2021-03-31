import java.util.Scanner;

public class queueInSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		String s=sc.next();
		char temp;
		char[] ch=s.toCharArray();
		for(int j=0;j<t;j++) {
		for(int i=0;i<n-1;i++) {
			if(ch[i]=='B' && ch[i+1]=='G') {
				ch[i]='G';
				ch[i+1]='B';
				i++;
			}
			
		}
		}
		System.out.println(ch);
	
	}

}
