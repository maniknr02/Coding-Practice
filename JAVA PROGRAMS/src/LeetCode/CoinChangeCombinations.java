package LeetCode;
import java.util.*;
public class CoinChangeCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int dp[]=new int[target+1];
		dp[0]=1;
		for(int j=1;j<=target;j++) {
			int pw=0;
			for(int i=0;i<n;i++) {
				if(a[i]<=j) {
					pw=pw+dp[j-a[i]];
				}
				dp[j]=pw;				
			}

		}
		  System.out.println(dp[target]);
	}
	

}
