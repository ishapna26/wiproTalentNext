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

2. String Palindrome
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=str.toLowerCase();
        String original=str1;
        String str2="";
        
        int len=str1.length();
        
        for(int i=len-1;i>=0;i--){
            str2=str2+""+str1.charAt(i);
        }
        
        if(str1.equals(str2)){
            System.out.print("palindrome");
        }
        else{
            System.out.print("non palindrome");
        }
    }
}
