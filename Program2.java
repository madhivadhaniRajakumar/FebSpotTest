package spot;


import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of inputs");
		int n = sc.nextInt();
		int[] val = new int[n];
		String [] strval = new String[n];
		
		for(int i=0;i<n;i++) {
			int k = sc.nextInt();
			String s = sc.next();
			if(i<=n/2) {
				strval[i]="-";
			}
			else {
				strval[i]=s;
			}
			val[i]=k;
		}
		String result ="";
		for(int i=0;i<9;i++) {
			for(int j=0;j<n;j++) {
				if(val[j]==i) {
					result += " "+ strval[j];
				}
			}
		}
		System.out.println(result);
		

	}

}
