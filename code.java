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
