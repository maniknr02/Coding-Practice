//NQueens Branch and Bound
import java.util.*;
public class NQueens {
	public static ArrayList <String> temp=new ArrayList<>();
	public static void findQueens(int n,boolean chess[][],boolean cols[], boolean nd[],boolean rd[],int r,int c,String ans,int p) {
	    if(r==n && p==n) {
	    	temp.add(ans);
	    	return;
	    }
	    if(r==n || c==n)
	    	return;
		if(chess[r][c]==false && cols[c]==false && nd[r-c+n-1]==false && rd[r+c]==false) {
			cols[c]=true;
			nd[r-c+n-1]=true;
			rd[r+c]=true;
			//System.out.println("Incremented r "+r+(r+1));
			findQueens(n,chess,cols,nd,rd,r+1,0,ans+r+" "+c+" ",p+1);
			cols[c]=false;
			nd[r-c+n-1]=false;
			rd[r+c]=false;	
		}
		//System.out.println("Incremented c "+c+(c+1));
		findQueens(n,chess,cols,nd,rd,r,c+1,ans,p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    boolean chess[][]=new boolean[n][n];
	    boolean cols[]=new boolean[n];
	    boolean nd[]=new boolean[2*n -1];
	    boolean rd[]=new boolean[2*n -1];
	    findQueens(n,chess,cols,nd,rd,0,0,"",0);
	   ArrayList< ArrayList <String>> sol=new ArrayList<>();
	    for(String s : temp) {
	    	String arr[]=s.split(" ");
	    	int x=0;
	    	int y=1;
	    	ArrayList <String> t=new ArrayList<>();
	    	for(int i=0;i<n;i++) {
	    		String s1="";
	    		for(int j=0;j<n;j++) {
	    			if(i==Integer.parseInt(arr[x]) && j==Integer.parseInt(arr[y])) {
	    				s1=s1+"Q";
	    				if(x+2<2*n && y+2<2*n) {
	    					x=x+2;
		    				y=y+2;
	    				}
	    				
	    			}
	    			else
	    				s1=s1+".";
	    		}
	    		t.add(s1);	    		
	    	}
	    	sol.add(t);    			    
	    }
	   System.out.println(sol);
	}

}
