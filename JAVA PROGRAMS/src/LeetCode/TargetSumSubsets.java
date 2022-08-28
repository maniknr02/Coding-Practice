package LeetCode;
import java.util.*;
public class TargetSumSubsets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		boolean dp[][]=new boolean[n+1][target+1];
		for(int i=0;i<=target;i++) {
			dp[0][i]=false;
		}
		for(int i=0;i<=n;i++) {
			dp[i][0]=true;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=target;j++) {
				if(a[i-1]>j) {
					dp[i][j]=dp[i-1][j];
				}
				else {
					dp[i][j]=dp[i-1][j] || dp[i-1][j-a[i-1]];
				}
					
			}
		}
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=target;j++) {
				System.out.print(" "+dp[i][j]);
			}
			System.out.println();
		}
		System.out.println(dp[n][target]);

	}

}
