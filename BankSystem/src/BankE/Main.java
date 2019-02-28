package BankE;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		do {
			System.out.println("Welcome to <t> Bank, Please enter your accountID ");
			System.out.println("===============================================");
			String userInput = scan.nextLine();
			UsernameCheck usernameCheck = new UsernameCheck(userInput);
			if(usernameCheck.isValid()) {
				System.out.println("Welcome, " + userInput + "!");
				UsernameCheck a = new UsernameCheck(userInput);
				System.out.println("=============================================");
				System.out.println("Please Enter you're username again to proceed ");
				UsernameList.main(args);
				exit = true;
			}else {
				System.out.println("Inccorect username");
			}
			
		}while (!exit);
		boolean exit1 = false;
		do {
		System.out.println("=============================================");
		System.out.println("To deposit Enter 1");
		System.out.println("To withdraw Enter 2");
		System.out.println("To view your balance Enter 3");
		System.out.println("To add an account Enter 4");
		System.out.println("To remove an account Enter 5");
		System.out.println("To view your account Profile Enter 6");
		}while (!exit1);
}
}