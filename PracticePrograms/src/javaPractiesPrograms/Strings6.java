package javaPractiesPrograms;

public class Strings6 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * (all output should be one per line)
		 * Output 1: print str starting at index 5 and going to the end Output 2: print
		 * str starting at index 7 and ending at index 10 Output 3: print "harambe" this
		 * must not be a new string must be from str Output 4: print "t f" this must not
		 * be a new string must be from str on one line
		 * output ps out for harambe ou harambe t f
		 */
         	
	String s = "laptops out for harambe";
	
	System.out.println(s.substring(5));            //ps out for harambe
													// harambe
	System.out.println(s.substring(7, 10));
	System.out.println(s.substring(16, 23));
	System.out.print(s.charAt(3));
	System.out.print(s.charAt(12));
	
	
	
	
	
	
	
	
	
	
	}

}
