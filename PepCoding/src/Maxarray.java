
import java.util.*;
public class Maxarray {
	public static int findMax(int a[],int i) {
		if(i==a.length-1)
			return a[i];
		int max=findMax(a,i+1);
		if(a[i]>max)
			return a[i];
		return max;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=findMax(a,0);
		System.out.print(max);
	}

}
