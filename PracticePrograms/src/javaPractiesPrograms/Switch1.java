package javaPractiesPrograms;

import java.util.Scanner;
public class Switch1 {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Please Enter case num");
		    String month = sc.nextLine();
		   int i = Integer.parseInt(month);
		switch (i) {
		  case 1:
		    System.out.println("will display January");
		    break;
		  case 2:
		    System.out.println(" will display February");
		    break;
		  case 3:
		    System.out.println("will display March");
		    break;
		  case 4:
		    System.out.println("will display april");
		    break;
		  case 5:
		    System.out.println("will display may");
		    break;
		  case 6:
		    System.out.println("will display june");
		    break;
		  case 7:
		    System.out.println("will display july");
		    break;
		  case 8:
		    System.out.println("will display august");
		    break;
		    case 9:
		    System.out.println("will display sep");
		    break;
		    case 10:
		    System.out.println("will display oct");
		    break;
		    case 11:
		    System.out.println("will display Nov");
		    break;
		    case 12:
		    System.out.println("will display Dec");
		    break;
		    default:System.out.println("Invalid");
		}
		
		  }
	
	
		}
		// TODO Auto-generated method stub

	

	
