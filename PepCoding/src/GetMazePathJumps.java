import java.util.*;

public class GetMazePathJumps {
	public static ArrayList <String> solve(int sr,int sc,int dr,int dc,int k,String ans){
		if(sr>dr||sc>dc)
			return new ArrayList <String>();
		if(sc==dc && sr==dr) {
			ArrayList <String> temp=new ArrayList<>();
			temp.add(ans);
			return temp;
		}
		ArrayList <String> a=new ArrayList<>();
		ArrayList <String > sol=new ArrayList<>();
		for(int i=1;i<=k;i++) {
			 a=solve(sr,sc+i,dr,dc,"h"+i+ans);
			 sol.addAll(a);
			 a=solve(sr+i,sc,dr,dc,"v"+i+ans);
			 sol.addAll(a);
			 a=solve(sr+i,sc+i,dr,dc,"d"+i+ans);
			 sol.addAll(a);		
		}
		return sol;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList <String> sol=solve(1,1,m,n,k,"");
		System.out.println(sol);

	}

}
