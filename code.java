//find number of unique elements 
import java.util.*;

class Main3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>a=new ArrayList<>();
		while(n>0) {
			int mod=n%10;
			if(!a.contains(mod)) {
				a.add(mod);
			}
			n=n/10;
		}
		System.out.print(a.size());
	}
}
(or)
import java.util.*;

class Main3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[10];
		
		while(n>0) {
			int mod=n%10;
			if(a[mod]==0) {
				a[mod]=1;
			}
			n=n/10;
		}
		int c=0;
		for(int i=0;i<10;i++) {
			if(a[i]==1) {
				c++;
			}
		}
		System.out.print(c);
	}
}

//find the number of non repeated elements
import java.util.*;

class Main3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[10];
		
		while(n>0) {
			int mod=n%10;
			a[mod]+=1;
			n=n/10;
		}
		int c=0;
		for(int i=0;i<10;i++) {
			if(a[i]==1) {
				c++;
			}
		}
		System.out.print(c);
	}
}
//find singledigit sum
public static int fsum(int n) {
    int sum = 0;
    int originalSign = n < 0 ? -1 : 1;
    n = Math.abs(n);  // Work with positive digits

    while (n > 0) {
        int mod = n % 10;
        sum += mod;
        n = n / 10;
    }

    if (sum <= 9) {
        return sum * originalSign;  // Restore the original sign
    }

    return fsum(sum * originalSign);  // Recurse with signed sum
}
