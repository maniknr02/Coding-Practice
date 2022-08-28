import java.util.*;
public class GetMazePaths {
	public static ArrayList <String>solve(int sr,int sc,int dr,int dc,String ans){
		ArrayList <String> sol=new ArrayList<>();
		if(sr>dr || sc>dc ) {
			return new ArrayList<String>();
		}
		if(sr==dr && sc==dc) {
			//System.out.println(ans);
			ArrayList <String> temp=new ArrayList<>();
			temp.add(ans);
			return temp;
		}
			
		ArrayList <String> a=solve(sr,sc+1,dr,dc,"l"+ans);
		ArrayList <String> b=solve(sr+1,sc,dr,dc,"v"+ans);
		sol.addAll(a);
		sol.addAll(b);
		return sol;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		ArrayList <String> sol=solve(1,1,m,n,"");
		System.out.println(sol);

	}

}
