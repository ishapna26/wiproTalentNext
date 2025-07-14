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

3. weight of the string
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int weight=0;
        String str=sc.nextLine();
        int n=sc.nextInt();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(n==0){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                   continue;
                }
                else if(ch==' '||ch=='!'){
                    ch=0;
                    weight+=ch;
                }
                else if(ch>=65 && ch<=90){
                       weight+=ch-64;
                }
                else if(ch>=97&&ch<=122){
                    weight+=ch-96;
                }
                
            }
            else{
                if(ch==' '||ch=='!'){
                    ch=0;
                    weight+=ch;
                }
                else if(ch>=65 && ch<=90){
                       weight+=ch-64;
                }
                else if(ch>=97&&ch<=122){
                    weight+=ch-96;
                }
            }
        }
        System.out.print(weight);
    }
}
