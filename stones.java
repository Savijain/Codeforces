import java.util.Scanner;

public class stones {

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==ch[i+1]) {
				count++;
			}
				
		}
		System.out.println(count);
		
	}
}
