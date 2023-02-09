package spot;

import java.util.Arrays;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {2,8,3,4,6,1};
		int i=0;
		while(i<a.length-1) {
			int key = a[i];
			int j= i+1;
			int temp=i;
			while(j<a.length) {
				if(key>a[j]) {
					key=a[j];
					temp=j;
				}
				j++;
			}
			int temp1 = a[i];
			a[i]=key;
			a[temp]=temp1;
			i++;
		}
		System.out.println(Arrays.toString(a));
	}
	

}
