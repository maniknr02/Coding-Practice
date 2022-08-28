import java.util.*;
public class RatInAMaze {
	public static ArrayList <String> solve(int sr,int sc,int dr,int dc,int maze[][],boolean vis[][],String ans) {
		ArrayList <String> sol=new ArrayList<>();
		if(sr>dr || sc>dc||sr<0 ||sc<0 || maze[sc][sr]==1 || vis[sr][sc]==true) {
			return new ArrayList<String>();
		}
		if(sr==dr && sc==dc) {
			//System.out.println(ans);
			ArrayList <String> temp=new ArrayList<>();
			temp.add(ans);
			return temp;
		}
		vis[sr][sc]=true;
		ArrayList <String> a=solve(sr,sc+1,dr,dc,maze,vis,"r"+ans);
		ArrayList <String> b=solve(sr+1,sc,dr,dc,maze,vis,"d"+ans);
		ArrayList <String> c=solve(sr-1,sc,dr,dc,maze,vis,"u"+ans);
		ArrayList <String> d=solve(sr,sc-1,dr,dc,maze,vis,"l"+ans);	
		vis[sr][sc]=false;
		sol.addAll(a);
		sol.addAll(b);
		sol.addAll(c);
		sol.addAll(d);
		return sol;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dr=sc.nextInt();
		int dc=sc.nextInt();
		int maze[][]=new int[dr][dc];
		boolean visited[][]=new boolean[dr][dc];
		for(int i=0;i<dr;i++) {
			for(int j=0;j<dc;j++) {
				maze[i][j]=sc.nextInt();
			}
		}
		ArrayList <String> sol=solve(0,0,dr-1,dc-1,maze,visited,"");
		System.out.println(sol);

	}

}