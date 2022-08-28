import java.util.*;
public class KsizedCombinations {

	public static void solve(int i,int k,int n,List <Integer> temp,List <List<Integer>> ans) {
		if(temp.size()==k) {
			List <Integer> dummy=new ArrayList<>();
			dummy.addAll(temp);
			ans.add(dummy);
		}
		for(int j=i+1;j<=n;j++) {
			Integer x=j;
			temp.add(x);
			solve(j,k,n,temp,ans);
			temp.remove(x);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		List <Integer> temp=new ArrayList<>();
		List <List<Integer>> ans=new ArrayList<>();
        solve(0,k,n,temp,ans);
	    System.out.println(ans);	
	}

}
