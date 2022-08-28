import java.util.*;
class Pair{
	int sl;
	int index;
	int val;
	String psf;
	Pair(int sl,int index,int val,String psf){
		this.sl=sl;
		this.index=index;
		this.val=val;
		this.psf=psf;
	}
}
public class LongestIncreasingSubsequenceLength {

	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int dp[]=new int[n];
        dp[0]=1;
        int ans=1;
        for(int i=1;i<n;i++){
        	int max=0;
            for(int j=0;j<i;j++){
                if(a[j]<=a[i] && dp[j]>max){
                    max=dp[j];
                }
                
            }
            dp[i]=1+max;
           // System.out.println(i+""+dp[i]);
            if(dp[i]>ans){
                ans=dp[i];
            }
        }
        System.out.println(ans);
        ArrayDeque <Pair> queue=new ArrayDeque<>();
        for(int i=0;i<n;i++) {
        	if(dp[i]==ans) {
        		queue.add(new Pair(ans,i,a[i],a[i]+""));
        	}
        }
        while(!queue.isEmpty()) {
        Pair rem = queue.removeFirst();
        
        if(rem.sl == 1){
            System.out.println(rem.psf);
        }
        
        for(int j = rem.index - 1; j >= 0; j--){
            if(dp[j] == rem.sl - 1 && a[j] <= rem.val){
                queue.add(new Pair(dp[j], j, a[j], a[j] + " -> " + rem.psf));
            }
        }

        }
	}
}
        

