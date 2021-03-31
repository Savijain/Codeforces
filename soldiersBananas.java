import java.util.Scanner;

public class soldiersBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int w=sc.nextInt();
		int cost=0;
		int sum=0;
		for(int i=0;i<=w;i++) {
			cost=i*k;
			sum=sum+cost;
		}
		
		if(n>sum)
        {
            System.out.println(0);
        }
        else
        {
        System.out.println(sum-n);
        }
	}

}
