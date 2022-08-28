package LeetCode;

import java.util.Scanner;

public class GoldMine {

	public static void main(String[] args) {
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
			dp[i][0]=a[i][0];
		}
		for(int j=1;j<m;j++) {
			for(int i=0;i<n;i++) {
				if(i==0) {
					dp[i][j]=a[i][j]+Math.max(dp[i][j-1],dp[i+1][j-1]);
				}
				else if(i== n-1) {
					dp[i][j]=a[i][j]+Math.max(dp[i][j-1], dp[i-1][j-1]);
				}
				else {
					dp[i][j]=a[i][j]+Math.max(dp[i][j-1],Math.max(dp[i-1][j-1],dp[i+1][j-1]));
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++) {
			if(dp[i][m-1]>max)
				max=dp[i][m-1];
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(" "+dp[i][j]);
			}
			System.out.println();
		}
		System.out.println("Max :"+max);

	}

}
