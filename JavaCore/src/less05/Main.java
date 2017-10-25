package less05;

import java.nio.charset.Charset;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
//		System.out.println(s1==s2);
//		System.out.println(s1==s3.intern());
		String s4 = s1;
		s1+="!";
		System.out.println(s4);
		System.out.println(s2.equals(s3));
		System.out.println(s2.charAt(1));
		System.out.println(s2.indexOf("lo")!=-1);
		System.out.println(s2.contains("lo"));
		System.out.println(s2.compareTo("Aello"));
		System.out.println(s2.length());
		System.out.println(s2.substring(0,1));
		System.out.println(Charset.defaultCharset());
	}
}