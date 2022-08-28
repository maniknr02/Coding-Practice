package LeetCode;
import java.util.*;
public class CountNoOfTeams {
	public static void solve(int a[],int i,int n,String s,int bsf) {
		if(i==n) {
			System.out.println(s);
			return;
		}
		if(a[i]<bsf) {
			System.out.println(s);
			return;
		}
			
		solve(a,i+1,n,s+a[i],a[i]);
		solve(a,i+1,n,s,bsf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		solve(a,0,n,"",Integer.MIN_VALUE);

	}

}
