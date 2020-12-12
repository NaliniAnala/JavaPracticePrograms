package javaPractiesPrograms;

import java.util.Scanner;

public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * For you to do: If browser is ChRoME It should print the Proceed with chrome
		 * Browser If browser is FireFOX It should print the Proceed with firefox
		 * Browser If browser is Ie It should print the Proceed with ie Browser If any
		 * other browser It should print the Invalid Browser
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Click on browser");
		String str = sc.nextLine();

		String str1 = "ChRoME";
		String str2 = "FireFOX";
		String str3 = "Ie";

		if (str.equalsIgnoreCase(str1)) {
			System.out.println("the Proceed with chrome");
		}

		else if (str.equalsIgnoreCase(str2))
			System.out.println(" the Proceed with firefox");

		else if (str.equalsIgnoreCase(str3))
			System.out.println("  the Proceed with ie Browser");
		else {
			System.out.println("t the Invalid Browser");
		}

	}

}
