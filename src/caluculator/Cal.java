package caluculator;

import java.util.Scanner;

class claculator {
	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void sub(int a, int b) {
		int sub = a - b;
		System.out.println(sub);
	}

	public static void div(int a, int b) {
		double div = a / b;
		System.out.println(div);
	}
}

public class Cal {

	public static void main(String[] args) {
//		claculator.add(5, 6);
		Scanner sc = new Scanner(System.in);
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.div");
		int selection = sc.nextInt();
		System.out.println("enter 1st number");
		int a = sc.nextInt();
		System.out.println("enter 2st number");
		int b = sc.nextInt();
		switch (selection) {
		case 1:
			claculator.add(a, b);
			break;
		case 2:
			claculator.sub(a, b);
			break;
		case 3:
			claculator.div(a, b);
			break;
		default:
			System.out.println("invalid selection");
		}

	}
}
