package LeetCode;
import java.util.*;
public class MincostMazeTraversal {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int dp[][]=new int[n][m];
		dp[0][0]=a[0][0];
		for(int i=1;i<n;i++) {
			dp[i][0]=a[i][0]+dp[i-1][0];
		}
		for(int i=1;i<n;i++) {
			dp[0][i]=a[0][i]+dp[0][i-1];
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
					dp[i][j]=a[i][j]+Math.min(dp[i-1][j], dp[i][j-1]);
			}
		}
		System.out.println(dp[n-1][m-1]);
		
	}

}
