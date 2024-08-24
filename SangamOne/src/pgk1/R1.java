package pgk1;

import java.util.ArrayList;

public class R1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		String s1 = "ABCABCABC";
		String s2 = "";
		String char1 = "";
		int pos1 = 0;
		int len1= s1.length();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list2.add("01");
		list2.add("02");
		list2.add("03");
		for(int i = 0; i < len1; i ++) {
			char1 = s1.substring(i,i+1);
			pos1 = list1.indexOf(char1);
			s2 = s2 + list2.get(pos1);
		}
		
		
		System.out.println(s2);
	}

}
