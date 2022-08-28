import java.util.*;
public class MinCostPaintNHouses {
	 public static int findMin(int r,int c,int n,int dp[][] ){
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<n;i++){
	            if(i!=c){
	                if(min > dp[r][i])
	                    min=dp[r][i];
	            }
	            //System.out.println("min="+min);
	        }
	        return min;
	    }

	    public static void main(String[] args) throws Exception {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int k=sc.nextInt();
	        int cost[][]=new int[n][k];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<k;j++){
	                cost[i][j]=sc.nextInt();
	            }
	        }
	        int dp[][]=new int[n+1][k];
	        for(int i=0;i<k;i++)
	           dp[0][i]=0;
	        for(int i=1;i<=n;i++) {
	        	for(int j=0;j<k;j++) {
	        		dp[i][j]=cost[i-1][j]+findMin(i-1,j,k,dp);
	        	}
	        	
	        }
	        System.out.println(findMin(n,-1,k,dp));
	        for(int i=0;i<=n;i++) {
	        	for(int j=0;j<k;j++) {
	        		System.out.print(" "+dp[i][j] );
	        	}
	        	System.out.println();
	        	
	        }
	       
	    }
}


