package LeetCode;
import java.util.*;
public class PermutationsList {
	public static void solve (List <Integer> inp,List <Integer> temp,List <List <Integer>> sol){
		if(inp.size()==0) {
			System.out.println(temp);
			List <Integer> dummy=new ArrayList<>();
			dummy.addAll(temp);
			sol.add(dummy);
			return;
		}
		for(int i=0;i<inp.size();i++) {
			Integer n=inp.get(i);
		    temp.add(n);
		    inp.remove(i);
		    solve(inp,temp,sol);
		    inp.add(i,n);
		    temp.remove(temp.size()-1);		    
		}
	    
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List <Integer > inp=new ArrayList <>();
		List <Integer > temp=new ArrayList <>();
		List <List <Integer>> sol=new ArrayList <>();
		
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			inp.add(x);
		}
	
		solve(inp,temp,sol);
		System.out.println(sol);
	}

}
