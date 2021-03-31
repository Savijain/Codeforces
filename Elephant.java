import java.util.Scanner;

public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int count=0;
		if(x%5!=0) {
			count=(x/5)+1;
		}
		else {
			count=(x/5);
		}
		System.out.println(count);
	}

}
