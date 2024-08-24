package pgk1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class R5 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("dictionary.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(System.in);
		int randNum1 = 0;
		int len1 = 0;
		String line1 = "";
		String computerChoice = "";
		String lastChar1 = "";
			
		String userChoice = "";
		List<String> list1 = new ArrayList<>();
		List<String> temp1 = new ArrayList<>();
		Random r1 = new Random();
		
		while(sc1.hasNext()) {
			line1 = sc1.nextLine();
			list1.add(line1);
		}
		randNum1 = r1.nextInt(0,list1.size());
		computerChoice = list1.get(randNum1);
		list1.remove(computerChoice);
		len1 = computerChoice.length();
		lastChar1 = computerChoice.substring(len1 - 1,len1);
		System.out.println("Computer : " + computerChoice);
	
		while(true) {	
			System.out.print("User : ");
			userChoice = sc2.nextLine();	
			if(userChoice.startsWith(lastChar1) && list1.contains(userChoice)) {
				list1.remove(userChoice);
				len1 = userChoice.length();
				String lastChar2 = userChoice.substring(len1 -1, len1);
				temp1 = list1.stream().filter(w -> w.startsWith(lastChar2)).collect(Collectors.toList());
				
				randNum1 = r1.nextInt(0,temp1.size());
				computerChoice = temp1.get(randNum1);
				len1 = computerChoice.length();
				lastChar1 = computerChoice.substring(len1 - 1,len1);
				System.out.println("Computer : " + computerChoice);
				list1.remove(computerChoice);
			}
			else {
				System.out.println("Computer Wins!!!");
				break;
			}
		}
		
	}

}
