package strings_java;

//package pkg;

public class Main {
	public static void main(String[] args) {
		//String
		
		String str1="hello";
		String strTri=new String(" hello ");
		String str2=new String("world");
		String cart="apple,cherry,pineapple";
		
		//methods
//		length()	Returns the length of the string	"Java".length() → 4
//		charAt(index)	Returns the character at the specified index	"Java".charAt(2) → 'v'
//		substring(start, end)	Returns a substring from start (inclusive) to end (exclusive)	"Hello".substring(1, 4) → "ell"
//		equals(str)	Compares two strings for equality	"Java".equals("java") → false
//		equalsIgnoreCase(str)	Compares two strings ignoring case differences	"Java".equalsIgnoreCase("java") → true
//		toUpperCase()	Converts the string to uppercase	"java".toUpperCase() → "JAVA"
//		toLowerCase()	Converts the string to lowercase	"JAVA".toLowerCase() → "java"
//		trim()	Removes leading and trailing spaces	" Java ".trim() → "Java"
//		replace(old, new)	Replaces occurrences of a character or string	"Java".replace('a', 'o') → "Jovo"
//		split(delimiter)	Splits the string into an array	"A,B,C".split(",") → ["A", "B", "C"]
//		contains(str)	Checks if the string contains a specific substring	"Java".contains("av") → true
//		indexOf(char/str)	Returns the index of the first occurrence of a character or substring	"Java".indexOf('a') → 1
//		isEmpty()	Checks if the string is empty	"".isEmpty() → true
	
	
			System.out.println("");
			System.out.println("str1.length() "+str1.length());
			System.out.println("str1.charAt(3) "+str1.charAt(3));
			System.out.println("str1.substring(2,4) "+str1.substring(2,4));
			System.out.println("str1.equals(\"hello\") "+str1.equals("hello"));
			System.out.println("str1.equalsIgnoreCase(\"HELLO\") "+str1.equalsIgnoreCase("HELLO"));
			System.out.println("str1.toUpperCase() "+str1.toUpperCase());
			System.out.println("str1.toLowerCase() "+str1.toLowerCase());
			System.out.println("str3.trim() "+strTri.trim());
			System.out.println("str5.replace(\"ll\",\"RR\") "+strTri.replace("ll","RR"));
			//System.out.println("cart.split(\",\") "+cart.split(","));
			System.out.println("cart.contains(\"apple\") "+cart.contains("apple"));
			System.out.println("cart.indexOf(\"cherry\") "+cart.indexOf("cherry"));
			String strEmpty="";
			System.out.println("strEmpty.isEmpty() "+strEmpty.isEmpty());
		
		//concatenation
		String str3="hello";
		String str4="world";
		//+ opr
		System.out.println("str3+str4 "+str3+str4);
		
		//concat() str_var.concat().concat();
		System.out.println("str3.concat(str4) "+str3.concat(str4));
		
		//immutability
//		String str5=new String("hello");
//		str5+" world";
//		System.out.println("str5 "+str5);
		String srt1=new String("cherry");
		srt1.replace('c', 'a');
		System.out.println("srt1 "+srt1);
		
		//mutable
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.replace(2, 3, "##");
		sb.append(" World");
		System.out.println(sb.toString());
		
		
		
		//compare
		//equals()
		//compareTo()
		String s1="hello";
		String s2="hello";
		String s3="world";
		String s4="helko";
		System.out.println("s1.equals(s2) "+s1.equals(s2));
		System.out.println("s1.equals(s3) "+s1.equals(s3));
		System.out.println("s1.compareTo(s2) "+s1.compareTo(s2));
		System.out.println("s1.compareTo(s3) "+s1.compareTo(s3));
		System.out.println("s1.compareTo(s4) "+s1.compareTo(s4));
		
		//reverse
//		String str = "Java";
//		String reversed = new StringBuilder(str).reverse().toString();
//		System.out.println(reversed); // "avaJ"
		String srt6="hello";
		StringBuilder obj=new StringBuilder(srt6);		
		System.out.println("obj.reverse().toString() "+obj.reverse().toString());
		
		//split join
//		String str = "apple,banana,orange";
//		String[] fruits = str.split(",");
//		String joined = String.join(" | ", fruits);
//		System.out.println(joined); // "apple | banana | orange"
		
		String strsplit= "apple,apple,apple";
		String[] cart1 =strsplit.split(",");
		//System.out.println("cart1 "+cart1);
		for(int i=0;i<cart1.length;i++) {
			System.out.println("cart1[] "+cart1[i]);
		}
		String strjoin=String.join("$", cart1);
		System.out.println("strjoin "+strjoin);
	}
}