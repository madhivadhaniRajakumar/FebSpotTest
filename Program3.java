package spot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int [] exp = new int[] {1,2,3,4,4};
		int day = 4;
		int count=0;
		int[] arr = new int[day];
		int j=0,i=0,k=0;
		while(i<exp.length-1) {
			if(k<arr.length) {
				arr[k]=exp[i];
				i++;
				k++;
			}
			
			else {
				Arrays.sort(arr);
				int med =arr[day/2] *2;
				if(exp[i+1]>=med) {
					count++;
				}
				k=0;
				i=j++;
			}
			
		}
		
		System.out.println(count);

	}

}
