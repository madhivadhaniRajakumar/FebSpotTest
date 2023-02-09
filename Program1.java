package spot;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 6;
		int [] cost = new int[] {2,4,7,5,6};
		int len= cost.length-1;
		int []pair = new int[2];
		for(int i=0;i<cost.length;i++) {
			for(int j=i+1;j<cost.length;j++) {
				if(cost[i]+cost[j]==m) {
					pair[0]=cost[i];
					pair[1]=cost[j];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(pair));

	}

}
