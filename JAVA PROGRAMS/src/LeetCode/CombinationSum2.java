package LeetCode;
import java.util.*;
public class CombinationSum2 {
	public static List <Integer> temp=new ArrayList<>();
	//List<List <Integer>> sol=new ArrayList<>();
	 public static List <List<Integer>> ans=new ArrayList<>();
	 //  List<Integer> temp=new ArrayList<>();
	    public static void solve(int i,int arr[],int n){
	        
	        if(n==0){
	            ans.add(new ArrayList<>(temp));
	            return;
	        }
	        if(n<0)
	          return;
	        if(i==arr.length)
	          return;
	        temp.add(arr[i]);
	        solve(i,arr,n-arr[i]);
	        temp.remove(temp.size()-1);
	        solve(i+1,arr,n);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//List <Integer> inp=new ArrayList<>();
		int arr[]=new int[n];
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
			
		}
		int target=sc.nextInt();
		solve(0,arr,target);
		for(List<Integer> temp :ans) {
			System.out.println(temp);
		}

	}

}
