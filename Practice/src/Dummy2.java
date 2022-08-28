import java.util.*;
public class Dummy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int ans=0,k=1;
		for(int i=1;i<n;i++) {
			if(a[i-1]!=a[i]) {
				ans+=k*(k+1)/2;k=1;
			}else				
			    k++;
		}
		System.out.println(k);
		ans+=k*(k+1)/2;
		System.out.println(ans);
	}

}
