import java.util.*;
public class Dummy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap <String,Integer> map=new HashMap<>();
		HashMap <Integer,String> map2=new HashMap<>();
		ArrayList <Integer> list=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String s=sc.next();
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			}
			else {
				map.put(s,1);
			}
		}
		System.out.println(map.size());
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			Integer i=entry.getValue();
			String s=entry.getKey();
			if(map2.containsKey(i)) {
				String s1=map2.get(i);
				s1=s1+" "+s;
				map2.put(i, s1);
			}
			else {
				map2.put(i, s);
			}
		}
		for(int i:map2.keySet()) {
			list.add(i);
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i :list) {
			String str=map2.get(i);
			String arr[]=str.split(" ");
		    Arrays.sort(arr);
		    for(String s:arr) {
		    	System.out.println(s);
		    }
		}
		

	}

}
