package spot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Constraints
		
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		if(n<2 || n>100) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		System.out.println("Enter the positive integer value");
		int k = sc.nextInt();
		if(k<=1 || k>100) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		System.out.println("Enter the elements in the array");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
			if(arr[i]<1 || arr[i]>100) {
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		List<List<Integer>> ls = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((arr[i]+arr[j])%k==0) {
					List<Integer> l = new ArrayList<>();
					l.add(arr[i]);
					l.add(arr[j]);
					ls.add(l);
				}
			}
		}
		System.out.println(ls);
		
			

	}

}
