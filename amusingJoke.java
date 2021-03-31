import java.util.HashMap;
import java.util.Scanner;

public class amusingJoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String p=sc.next();
		String q=sc.next();
		String s=sc.next();
		String a=p.concat(q);
		HashMap<Character,Integer> clist=new HashMap<Character, Integer>();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(clist.containsKey(c)) {
				clist.put(c, clist.get(c)+1);
			}
			else {
				clist.put(c, 1);
			}
		}
		HashMap<Character,Integer> clist2=new HashMap<Character, Integer>();
		char[] ch2=a.toCharArray();
		for(char c:ch2) {
			if(clist2.containsKey(c)) {
				clist2.put(c, clist2.get(c)+1);
			}
			else {
				clist2.put(c, 1);
			}
		}
		if(clist.equals(clist2)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}

}
