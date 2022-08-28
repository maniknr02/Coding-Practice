import java.util.*;
public class GetMaxScoresOfWords {
	public static boolean frequency(String s,int freq[]) {
		for(int i=0;i<s.length();i++) {
			if(freq[s.charAt(i)-'a']<=0) {
				return false;
			}
			
		}
		return true;
	}
	public static int solve(String words[],int freq[],int pow[],int i,int ans) {
		if(i==words.length) {
			return ans;
		}
		int include=0;
		String word=words[i];
		if(frequency(word,freq)) {
			int strength=0;
			for(int j=0;j<word.length();j++) {
				strength=strength+pow[word.charAt(j)-'a'];
				freq[word.charAt(j)-'a']--;
			}
			 include=solve(words,freq,pow,i+1,ans+strength);
			for(int j=0;j<word.length();j++) {
				freq[word.charAt(j)-'a']++;
			}
		}
		int exclude=solve(words,freq,pow,i+1,ans);
		
		return Math.max(include, exclude);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		String let=sc.nextLine();
		int pow[]=new int[26];
		int freq[]=new int[26];
		for(int i=0;i<26;i++) {
			pow[i]=sc.nextInt();
		}
		String words[]=word.split(" ");
		char letters[]=let.toCharArray();
		for(int i=0;i<letters.length;i++) {
		   char ch=letters[i];
		   freq[ch-'a']++;	   
		}
        int ans=solve(words,freq,pow,0,0);
        System.out.println(ans);

	}

}
