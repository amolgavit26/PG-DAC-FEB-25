package OOPJ.Practice;

public class StringClassDemo {

	public static void main(String[] args) {
		

		String s = "Hello World.!";
		System.out.println(s);
		
		
		String s1 = new String("Hello World.!");
		System.out.println(s1);
		
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(6));
		
		System.out.println(s1.substring(6));
		
		System.out.println(s1.substring(4, 8));
		
		System.out.println(s1.concat(s));
		
		System.out.println(s1.indexOf("World"));
		
		System.out.println(s1.indexOf("Wr"));
		
		System.out.println(s1.indexOf("o",6));
		
		System.out.println(s1.lastIndexOf("o"));
		
		System.out.println(s == s1);
		
		System.out.println(s.equals(s1));
		
		String s2 = "hello world.!";
		System.out.println(s2.equals(s1));
		System.out.println(s2.equalsIgnoreCase(s1));
		
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));	// lexicographically
		
		System.out.println(s.compareToIgnoreCase(s2));
		
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String s3 = " hello world.! ";
		System.out.println(s3.trim());
		
		
		System.out.println(s1.replace("o", "b"));
		
		System.out.println(s.contains("@"));
		
		char sarr[] = s.toCharArray();
		System.out.println(sarr);
		
		
	}

}
