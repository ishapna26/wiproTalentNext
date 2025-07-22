1. Program 2:
//find the length of the words in the string and find the singledigit sum
import java.util.*;

class Main6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String[] words=str.split(" ");
		int sum=0;
		
		for(int i=0;i<words.length;i++) {
			String str1=words[i];
			sum+=str1.length();
		}
		
		int result=findSum(sum);
		System.out.print(result);
	}
	
	public static int findSum(int sum) {
		int sum2=0;
		while(sum>0) {
			int mod=sum%10;
			sum2+=mod;
			sum=sum/10;
		}
		if(sum2>=0&&sum2<=9) {
			return sum2;
		}
		return findSum(sum2);
	}
}

2. Program 1:
import java.util.*;

class Main8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		str=str.toUpperCase();
		String[] words=str.split(" ");
		
		String result="";
		for(int i=0;i<words.length;i++) {
			int sum=0;
			String str1=words[i];
			
			int left=0;
			int right=str1.length()-1;
			
			while(left<=right) {
				if(left==right) {
					sum=sum+(str1.charAt(left))-64;
				}
				int ch1=str1.charAt(left)-64;
				int ch2=str1.charAt(right)-64;
				int n1=Integer.max(ch1, ch2);
				int n2=Integer.min(ch1,ch2);
				sum=sum+(n1-n2);
				left++;
				right--;
			}
			result=result+""+(Integer.toString(sum));
		}
		System.out.print(result);
	}
}
