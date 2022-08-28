import java.util.*;

public class LargestAreaHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int li[]=new int[n];
		int ri[]=new int [n];
		Stack <Integer> st=new Stack<>();
		st.push(0);
		for(int i=1;i<n;i++) {
			while(st.size()>0 && a[st.peek()]>=a[i]) {
				st.pop();
			}
			if(st.size()==0) {
				li[i]=0;
			}
			else {
				li[i]=st.peek()+1;
			}
			st.push(i);
		}
		st.clear();
		st.push(n-1);
		ri[n-1]=n-1;
		for(int i=n-2;i>=0;i--) {
			while(st.size()>0 && a[st.peek()]>=a[i]) {
				st.pop();
			}
			if(st.empty()) {
				ri[i]=n-1;				
			}
			else {
				ri[i]=st.peek()-1;
			}
			st.push(i);
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(li[i]+" "+ri[i]);
		}
		int max=0;
		for(int i=0;i<n;i++) {
			int area=(ri[i]-li[i]+1)*a[i];
			if(area>max) {
				max=area;
			}
		}
		System.out.println(max);

	}

}
