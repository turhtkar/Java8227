package BankE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsernameList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		do {
		String userInput = scan.nextLine();
		List username = new ArrayList();
		username.add(new UsernameCheck(userInput));
		System.out.println("=============================================");
		System.out.println("Welcome, " + userInput + "!" + " Please choose your required operation for today");
		Main.main(args);
		exit = true;
		}while (!exit);
	}

}
