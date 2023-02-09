package spot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of test case");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter number of valid users");
		int user= sc.nextInt();
		//String[] pass = new String[user];
		List<String> ls = new ArrayList<>();
		int []check = new int[26]; 
		for(int i=0;i<user;i++) {
			String s= sc.next().toLowerCase();
			for(int j=0;j<s.length();j++) {
				check[s.charAt(j)-'a']++;
			}
			ls.add(s);
		}
		System.out.println("Login Attempt");
		String loginAttemp = sc.next();
		
		for(int i=0;i<loginAttemp.length();i++) {
			if(check[loginAttemp.charAt(i)-'a']==0) {
				System.out.println("Wrong Password");
				break;
			}
			
		}
		String result="";
		String str ="";

		for(int i=0;i<loginAttemp.length();i++) {
			
			char ch = loginAttemp.charAt(i);
			str +=ch;
			if(ls.contains(str)) {
				result += str+" ";
				str="";
			}
		}
		if(ls.contains(str)) {
			result += str+" ";
			str="";
		}
		System.out.println(result);
	}

}
