package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		do {
			System.out.println("                           ");
			System.out.println("Choose your option (+,-,,/)");
			System.out.println("                           ");
			System.out.println("for adding + enter 1");
			System.out.println("==================");
			System.out.println("for substracting - enter 2");
			System.out.println("========================");
			System.out.println("for multiplying * enter 3");
			System.out.println("=======================");
			System.out.println("for dividing / enter 4");
			System.out.println("====================");
			System.out.println("If you wanna quit press 5");
			System.out.println("       	   ");
			int i = scan.nextInt();
			switch (i) {
			case 1:
				i = 1;
				System.out.println("       	   ");
				System.out.println("Adding (+) ");
				System.out.println("===========");
				break;
			case 2:
				i = 2;
				System.out.println("       	        ");
				System.out.println("Subtracting (-) ");
				System.out.println("================");
				break;
			case 3:
				i = 3;
				System.out.println("       	       ");
				System.out.println("Multiplying (*)");
				System.out.println("================");
				break;
			case 4:
				i = 4;
				System.out.println("       	    ");
				System.out.println("dividing (/)");
				System.out.println("============");
				break;
			case 5:
				i = 5;
				System.out.println("       	            ");
				System.out.println("Quitting the program");
				exit = true;
				break;
			default:
				System.out.println("Error");
				break;
			}
			System.out.println("Now Enter a Number: ");
			int a = scan.nextInt();
			if (i == 1) {
				System.out.println(a + " + " + calc.getResult());
				calc.performOperation(new AddOperation(), a);
				System.out.println("===============");
				System.out.println("The result is: " + calc.getResult());
			} else if (i == 2) {
				System.out.println(a + " - " + calc.getResult());
				calc.performOperation(new SubtractOperation(), a);
				System.out.println("===============");
				System.out.println("The result is: " + calc.getResult());
			} else if (i == 3) {
				System.out.println(a + " * " + calc.getResult());
				calc.performOperation(new MultiplyOperation(), a);
				System.out.println("===============");
				System.out.println("The result is: " + calc.getResult());
			} else if (i == 4) {
				System.out.println(a + " / " + calc.getResult());
				calc.performOperation(new DivideOperation(), a);
				System.out.println("===============");
				System.out.println("The result is: " + calc.getResult());
			} else if (i == 5) {
				System.exit(0);
				exit = true;
			}

		} while (!exit);
	}
}
