package spot;

import java.util.Arrays;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int[][] {{1,2,3},{4,5,6},{6,7,8}};
		int noOfRotation =3;
		Program6 p = new Program6(); 
		for(int i =0;i<noOfRotation;i++) {
			p.rotate(a);
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		

	}
	public void rotate(int[][]a) {
	  
		for(int ind=0;ind<a.length;ind++) {
			for(int jind =ind+1;jind<a.length;jind++) {
				int temp = a[ind][jind];
				a[ind][jind] = a[jind][ind];
				a[jind][ind] = temp;
					
			}
			int j = a.length-1;
			for(int i=0;i<a.length/2;i++) {
				int temp = a[ind][i];
				a[ind][i] = a[ind][j];
				a[ind][j]= temp;
				j--;
			}
		}
		
		
	}

}
