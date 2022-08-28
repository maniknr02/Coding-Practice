import java.util.*;
public class OrderedBooks {
	public static String solve(String s) {
		Stack <Character> st=new Stack<>();
		//char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='\\') {
				st.push(s.charAt(i));
			}
			else {
				String temp="";
				while(st.peek()!='/') {
					temp=temp+st.pop();
				}
				st.pop();
				int j=0;
				int n=temp.length();
				while(j<n) {
					st.push(temp.charAt(j));
					j++;
				}
			}
		}
		String ans="";
		while(!st.empty()) {
			ans=st.pop()+ans;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(solve(s));

	}

}
