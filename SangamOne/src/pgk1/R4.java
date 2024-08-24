package pgk1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class R4 {
	
	public static String encryptMethod(String input, int offset) throws IOException {
		File f1 = new File("Input1.txt");
		Scanner sc1 = new Scanner(f1);
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		String[] arr = null;
		String currLine = "";
		String currChar= "";
		String s1 = input;
		int pos = 0;
		String output = "";
		while(sc1.hasNext()) {
			currLine = sc1.nextLine();
			arr = currLine.split(",");
			list1.add(arr[0]);
			list2.add(arr[1]);
		}
		for(int i = 0; i < s1.length(); i++) {
			currChar = s1.substring(i,i+1);
			pos = list1.indexOf(currChar);
			int newValue = Integer.valueOf(list2.get(pos)) + offset;
			output = output + String.valueOf(newValue);
		}
		return output;
	}
	
	public static String decryptMethod(String input, int offset) throws IOException {
		File f1 = new File("Input1.txt");
		Scanner sc1 = new Scanner(f1);
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		String[] arr = null;
		String currLine = "";
		String currChar= "";
		String s1 = input;
		int pos = 0;
		String output = "";
		int newIndex = 0;
		while(sc1.hasNext()) {
			currLine = sc1.nextLine();
			arr = currLine.split(",");
			list1.add(arr[0]);
			list2.add(arr[1]);
		}
		for(int i =0;i < s1.length();i+=2) {
			currChar = s1.substring(i, i+2);
			newIndex = Integer.valueOf(currChar) - offset;
			pos = list2.indexOf(String.valueOf(newIndex));
			output = output + list1.get(pos);
		}
		return output;
	}

	public static void main(String[] args) throws IOException {
		String input = "I";
		String encryptedData = "";
		String decryptedData = "";
		int offSet = 5;
		
		encryptedData = encryptMethod(input,offSet);
		System.out.println(encryptedData);
		decryptedData = decryptMethod(encryptedData,offSet);
		System.out.println(decryptedData);
		
	}

}
