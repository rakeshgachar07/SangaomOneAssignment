package pgk1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;



public class R2 {

	public static void main(String[] args) throws IOException{
		File f1 = new File("input1.txt");
		Scanner sc1 = new Scanner(f1);
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		String line1 = "";
		String[] arr1 = null;
		String s1= "XYZ";
		String char1 = "";
		String s2 = "";
		int pos1 = 0;
		
		for(int i =0; i<26;i++) {
			line1 = sc1.nextLine();
			arr1 = line1.split(",");
			list1.add(arr1[0]);
			list2.add(arr1[1]);
		}
		
		for(int j = 0; j < s1.length(); j ++) {
			char1 = s1.substring(j,j+1);
			pos1 = list1.indexOf(char1);
			s2 = s2 + list2.get(pos1);
		}
		
		System.out.println(s2);
//		System.out.println(list2);
		

	}

}
