package LeetCode;
import java.util.*;
public class GenerateParantheses {
	public static ArrayList <String> solve(int n,int lc,int rc,String ans){
		ArrayList <String > sol=new ArrayList <>();
		ArrayList <String > a=new ArrayList <>();
		ArrayList <String > b=new ArrayList <>();
		if(lc>=rc && lc<=n) {
			a=solve(n,lc+1,rc,ans+"(");
			b=solve(n,lc,rc+1,ans+")");
		}
		else {
			return new ArrayList <String>();
		}
		if(lc==n && rc==n) {
			ArrayList <String> temp=new ArrayList<>();
			temp.add(ans);
			return temp;
		}
		sol.addAll(a);
		sol.addAll(b);
		return sol;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	     ArrayList <String> sol=solve(n,0,0,"");
	     System.out.println(sol);

	}

}
