import java.util.Scanner;

public class beautifulYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d ;
		int[] ar=new int[4];
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		String temp="";
		for(int i=0;i<8000;i++) {
			n+=1;
			temp = Integer.toString(n);

		}
		int[] num = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			
		    num[i] = temp.charAt(i) - '0';
		}
		for(int j=0;j<num.length-1;j++) {
			for(int k=1;k<num.length;k++) {
			int index=num[j];
			if(index==num[k]) {
				break;
			}
			}
		}
		System.out.println(n);
		/*for (int i = 0; i < temp.length(); i++) {
		    System.out.println(num[i]);
		}*/
	}

}
