package stringHandlingConcepts;

public class StringHandling {




	public static void stringMethods()
	{
		String s1 = "Welcome to Java class";
		String s2 = "WelcometoJavaclass";


		String s3="Adi";
		boolean x=s1.equals(s2);
		System.out.println("Compare s1 and s2:"+x);
		System.out.println("Character at given position is:"+s1.charAt(5));
		System.out.println("Concat with given string: "+s1.concat(" the author"));
		System.out.println("Concat with string: "+s1.concat(s2));

		System.out.println("Length of String1: "+s1.length());
		System.out.println("String in uppercase:"+s1.toUpperCase());
		System.out.println("String in lowercase:"+s1.toLowerCase());
		System.out.println("Index of a given character:"+s1.indexOf('a'));
		System.out.println("Index of a given character"+s1.indexOf('o'));
		System.out.println("Substring with from and to index:"+s1.substring(0,4));
		System.out.println("Substring with starting index:"+s1.substring(4));
	}

	public static void main(String []args)
	{
		stringMethods();

	}
}





