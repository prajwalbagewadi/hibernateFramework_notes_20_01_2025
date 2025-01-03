package pkg;

public class Notes {
	public static void main(String[] args) {
		//String
		String str1="hello";
		String str2=new String("world");
		
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
	
	
		//concatenation
		String str3="hello";
		String str4="world";
		//+ opr
		
		//concat() str_var.concat().concat();
		
		//immutability
		String str5="hello";
		str5=str5+" world";
		
		//mutable
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb.toString());
		
		//compare
		//equals()
		//compareTo()
		
		//reverse
//		String str = "Java";
//		String reversed = new StringBuilder(str).reverse().toString();
//		System.out.println(reversed); // "avaJ"

		//split join
//		String str = "apple,banana,orange";
//		String[] fruits = str.split(",");
//		String joined = String.join(" | ", fruits);
//		System.out.println(joined); // "apple | banana | orange"

	}
}
