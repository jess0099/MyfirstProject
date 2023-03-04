package JavaProgram;

public class substringmethod {
//Java Strings are Immutable
//	In Java, strings are immutable. This means, once we create a string, we cannot change that string.
	/*Creating strings using the new keyword
	So far we have created strings like primitive types in Java.
Since strings in Java are objects, we can create strings using the new keyword as well. For example,
// create a string using the new keyword
String name = new String("Java String");
In Java, the JVM maintains a string pool to store all of its strings inside the memory. The string pool helps in reusing the strings.
If the string already exists, the new string is not created. Instead, the new reference, example points to the already existed string (Java).
If the string doesn't exist, the new string (Java is created.
1. While creating strings using string literals,
String example = "Java";
2. While creating strings using the new keyword,
String example = new String("Java");*/
	public static void main(String[] args) {

		String abc="amit12345";
		String digit=abc.substring(4, 9);
		System.out.println(digit);
		System.out.println("=============");
		//join two strings
		String city="Delhi";
		String country="India";
		String add=city+country;
		System.out.println(add);
		System.out.println("=============");
		String add1=country.concat(city);
		System.out.println(add1);
		//compare two string
	boolean comparestring=	add.equals(add1);
	System.out.println(comparestring);
	}

}
