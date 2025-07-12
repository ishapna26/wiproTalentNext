1
11
21
1211
111221

import java.util.*;

class Main3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String s="1";
		for(int i=1;i<=n;i++) {
			System.out.println(s);
			char a=s.charAt(0);
			String new_s="";
			int count=1;
			
			for(int j=1;j<s.length();j++) {
				if(a!=s.charAt(j)) {
					new_s=new_s+""+count+""+a;
					a=s.charAt(j);
					count=1;
				}
				else {
					count++;
				}
			}
			new_s=new_s+""+count+""+a;
			s=new_s;
		}
	}
}
