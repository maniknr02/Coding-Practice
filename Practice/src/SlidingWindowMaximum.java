import java.util.*;
public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		Stack <Integer > st=new Stack<>();
		st.push(n-1);
		int nge[]=new int [n];
		nge[n-1]=a.length;
		int ans[]=new int [n-k];
		for(int i=n-2;i>=0;i--) {
			while(st.size()>0 && a[st.peek()]<=a[i]) {
				st.pop();
			}
			if(st.empty()) {
				nge[i]=a.length;
			}
			else {
				nge[i]=st.peek();
			}
			st.push(i);
		}
		int x=0,j=0;
		for(int i=0;i<n-k;i++) {
			if(j<i)
				j=i;
			while(nge[j]<i+k) {
				j=nge[j];
			}
			ans[x]=a[j];
			x++;
		}
		
		for(int i=0;i<n-k;i++) {
			System.out.println(a[i]+" "+ans[i]);
		}

	}

}
