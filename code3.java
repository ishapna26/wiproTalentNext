Wipro Milestone:
----------------
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

3. Find the highest frequency of the element
import java.util.*;

class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = 0;
        int[] count = new int[10];

        // Count frequency of each digit
        for(int i = 0; i < n; i++) {
            countFrequency(a[i], count);
        }

        int max = Integer.MIN_VALUE;

        // Find the max frequency
        for(int i = 0; i < 10; i++) {
            if(count[i] > max) {
                max = count[i];
            }
        }

        // Find the smallest digit with max frequency
        for(int i = 0; i < 10; i++) {
            if(count[i] == max) {
                res = i;
                break;
            }
        }

        System.out.print(res);
    }

    public static void countFrequency(int n, int[] count) {
        while(n > 0) {
            int mod = n % 10;
            count[mod]++;
            n = n / 10;
        }
    }
}

4. Encode the string
import java.util.*;

class Main9{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		String[] words= {s1,s2,s3};
		String first="";
		String middle="";
		String last="";
		
		for(int i=0;i<3;i++) {
			String word=words[i];
			int len=word.length();
			if(len%3==0) {
				int end=len/3;
				first+=word.substring(0,end);
				middle+=word.substring(end,len-end);
				last+=word.substring(len-end,len);
			}
			if(len%3==1) {
				int end=len/3;
				first+=word.substring(0,end);
				middle+=word.substring(end,len-end);
				last+=word.substring(len-end,len);
			}
			if(len%3==2) {
				int end=len/3;
				first+=word.substring(0,end+1);
				middle+=word.substring(end+1,len-end-1);
				last+=word.substring(len-end-1,len);
			}
		}
		System.out.println(first);
		System.out.println(middle);
		System.out.println(last.toUpperCase());

	}
}

