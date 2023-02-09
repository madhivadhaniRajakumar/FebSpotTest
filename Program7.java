package spot;

import java.util.ArrayList;
import java.util.List;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[] {1,2,3};
		List<List<Integer>> ls = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		Program7 p = new Program7();
		p.sub(0,n,ls,l);
		System.out.println(ls);
		

	}
	public void sub(int ind , int[] n, List<List<Integer>> ls, List<Integer> l) {
		if(ind==n.length) {
			ls.add(new ArrayList(l));
			return;
		}
		
		l.add(n[ind]);
		sub(ind+1,n,ls,l);
		l.remove(l.size()-1);
		sub(ind+1,n,ls,l);
	}

}
