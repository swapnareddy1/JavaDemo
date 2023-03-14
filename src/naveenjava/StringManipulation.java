package naveenjava;
import java.util.Arrays;

public class StringManipulation {
	
	
	public void reverseName()
	{
		String name="swapna";
		
		int length=name.length();
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		StringManipulation obj=new StringManipulation();
		obj.reverseName();
		System.out.println();
		
		String str="hello welcome to java";
		int length=str.length();
		int hi=length-1;
		System.out.println(hi);
		
		//equality of 2 strings
		String str1="swapna";
		String str2="SWAPNA";
		if(str1.equalsIgnoreCase(str2)) 
		{
			System.out.println("both strings are equal");
		}else 
		{
			System.out.println("both strings are not equal");
		}
		
		//remove all spaces
		
		String str3="  hello world  welcome ";
		System.out.println(str3.replace(" ",""));
		
		String dob="20-01-2003";
		
		System.out.println(dob.replace("-", "/"));
		System.out.println(dob.replaceAll("2", "9"));
		
		//write last char and first char of a word
		
		String a="Hyderabad";
		int ln=a.length();
		int hia=ln-1; //highest index
		System.out.println(a.charAt(0));//first char
		System.out.println(a.charAt(hia));//last char
		
		//To verify a word contained in the sentence
		
		String sentence="Java is object oriented programming language";
		if(sentence.contains("object"))
		{
			System.out.println("method is working");
		}
		else {
			System.out.println("bye bye string");
		}
		/*method to write last half of the string
		String s1="sanDiego";
		int l=s1.length();*/
		//3rd 'e' of the string
		
		String s2="enemies";
		System.out.println(s2.indexOf('e', 3));
		
		//breaks a string into small strings
		
		String s3="java-python-ruby-c++-dotnet-oracle";
		String arr[]=s3.split("-");
		
		System.out.println(Arrays.toString(arr));
		
		//string consists of 3 words n print middle word
		
		String s="hello welcome home";
		
		
		
		
		
		
	}

}
