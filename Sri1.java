/*class Sri1
{
	public static void main(String[] args) 
	{
		String str=new String("Roopsagar");
		str.concat("sali");
		System.out.println(str);//i.e strings are immutable
		
	}
}
*/
/*
class Sri1
{
	public static void main(String[] args) 
	{
		String str=new String("Roopsagar");
		str=str.concat("sali");
		System.out.println(str);//i.e strings are immutable
		
	}
}

*/

/*
class Sri1
{
	public static void main(String[]args)
	{
		String s="Roopsagar";
		int a=s.length();
		System.out.println(a);
	}
}*/
/*
class Sri1
{
	public static void main(String[]args)
	{
		String s="Roopsagar";
		char ch=s.charAt(4);
		System.out.println(ch);
	}
}
*/
/*
class Sri1
{
	public static void main(String[]args)
	{
		
		String str="HELLO";
		System.out.println(str.charAt(0));
		int a=str.length();
		System.out.println(str.charAt(a-1));
		
	/* int strLength = str.length();      
    // Fetching first character  
    System.out.println("Character at 0 index is: "+ str.charAt(0));      
    // The last Character is present at the string length-1 index  
    System.out.println("Character at last index is: "+ str.charAt(strLength-1));
	}
	}
*/

	/*
class Sri1
{
	public static void main(String[]args)
	{
		String str="HELLOHOWRU";
		for (int i=0;i<str.length()-1 ;i++)
		{
			if(i%2!=0)
			{
				System.out.println("char at"+i+"place is"+str.charAt(i));
				
			}
			else
			{
				System.out.println("Even number");
			}
		}
	}
}
*/
/*
class Sri1
{
	public static void main(String[]args)
	{
		String str="QualityThought";
		
		for (int i=0;i<str.length()-1 ;i++ )
		{
			char ch=str.charAt(i);
			System.out.println(ch);
		}
		
	}
}
*/

/*
class Sri1
{
	public static void main(String[]args)
	{
		String str1="QualityThought";
		String str2="iHub";
		System.out.println(str1.concat(str2));
	}
}
*/ 
/*
class Sri1
{
	public static void main(String[]args)
	{
		String str1="qualotythought";
		String str2="HEELOWORLD";
		str1=str1.toUpperCase();
		str2=str2.toLowerCase();
		System.out.println(str2);
		System.out.println(str1);
	}
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1:");
		String str1=sc.nextLine();
		System.out.println("Enter the string2:");
		String str2=sc.nextLine();
		
		
		
		str1=str1.toUpperCase();
		System.out.println(str1);
	
		str2=str2.toLowerCase();
		System.out.println(str2);
	}
	
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1:");
		String str1=sc.nextLine();
		System.out.println("Enter the string2:");
		String str2=sc.nextLine();
		System.out.println(str1.concat(str2));
	}
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1:");
		String str1=sc.nextLine();
		System.out.println("Enter the string2:");
		String str2=sc.nextLine();
		if (str1.equals(str2))
		{
			System.out.println("Both strings are equal");
			
		}
		else 
			System.out.println("both Strings are not equal");
		
		
	}
}
*/
/*
class Sri1
{
	public static void main(String[]args)
	{
		String s="HEELO";
		char ch='E';
		int a=s.indexOf(ch);
		System.out.println(a);
	}
	
}
*//*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		System.out.println("Enter the character value:");
		char ch=sc.next().charAt(0);
		int index=s.indexOf(ch);
		System.out.println( "the index value is "+index);
	}
	
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		
		int a=s.length();
		
		System.out.println(s.charAt(a-1));
	}
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		System.out.println("Enter the character value:");
		char ch=sc.next().charAt(0);
	
		int index=s.lastIndexOf(ch);
		System.out.println(index);
	}
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		s=s.replaceAll("[^A-Za-z0-9]","");
		System.out.println(s);
	}
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		s=s.replaceAll("[A-Za-z0-9]","");
		System.out.println(s);
	}
}
*/

// talent45
//hub34
/*

import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1=sc.nextLine();
		System.out.println("Enter the String:");
		String str2=sc.nextLine();
		

	    String word1=str1.replaceAll("[^A-Z,a-z]","");
		int num1=Integer.parseInt(str1.replaceAll("[^0-9]",""));
		String word2=str2.replaceAll("[^A-Za-z]","");
		int num2=Integer.parseInt(str2.replaceAll("[^0-9]",""));
		String word=word1+word2;
		int num=num1+num2;
		
		System.out.println(word+num);
	}
	
}

*/
/*
class Sri1
{
	public static void main(String[]args)
	{
		String str="ihubtalent";
		
		str=str.substring(0,4);
		System.out.println(str);
	}
}
*/
/*
class Sri1
{
	public static void main(String[]args)
	{
		String str="ihubtalent";
		
		str=str.substring(4);
		System.out.println(str);
		
	}
}
*/
/*

class Sri1
{
	public static void main(String[]args)
	{
		String str1="javaisindependent";
		String str2="platform";
		int index=6;
		String str3=str1.substring(0,index);
		String str4=str1.substring(index,str1.length());
		
		System.out.println(str3+str2+str4);
	}
}
*/
/*
//ihubtalent
//cnt=2
//op:ubtalentih

class Sri1
{
	public static void main(String[]args)
	{
		String str="ihubtalent";
		int cnt=2;
		String str1=str.substring(cnt,str.length());
		String str2=str.substring(0,cnt);
		System.out.println(str1+str2);
	}
	
}
*/

/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		String rev="";
		for (int i=str.length()-1;i>=0;i-- )
		{
			rev+=str.charAt(i);
			
		}
		System.out.println(rev);
		
	}
	
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		
		String rev=" ";
		for (int i=str.length()-1;i>=0 ;i-- )
		{
			rev+=str.charAt(i);
			
		}
		System.out.println(rev);
	}
}
*/

/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		char[] carr=str.toCharArray();
		String rev="";
		for (int i=carr.length-1;i>=0 ;i--)
		{
			rev+=carr[i];			
		}
		System.out.println(rev);
	}
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
	if (str.equals(rev))
	{
		System.out.println("the string is polindrome");
	}
	else
		{
		System.out.println("the string is not polindrome");
		
	}
}

}
	*/
	
	/*
	
import java.util.Scanner;
class Sri1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		String []sarr=str.split("");
		String rev="";
		for(int i=sarr.length-1;i>=0;i--)
		{
			rev+=sarr[i]+" ";
			
		}
		System.out.println(rev);
	}
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		String[] sarr=str.split(" ");
		String rev="";
		
		
		for(int i=sarr.length-1;i>=0;i--)
		{
			rev+=sarr[i]+" ";
		}
		System.out.println(rev);
	}
	
		}
	*/
	
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.nextLine();
		String[] sarr=str.split(" ");
		
		String rev="";
		for(String s:sarr)
		{
			char[] carr=s.toCharArray();
			for(int i=carr.length-1;i>=0;i--)
			{
				rev+=carr[i];
			}
			rev+=" ";
		}
		System.out.println(rev);
	}
}
*/
/*
import java.util.Scanner;
class Sri1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.nextLine();
		String[] sarr=str.split(" ");
		String rev="";
		for(String s:sarr)
		{
			char[] carr=s.toCharArray();
			
			
			for(int i=carr.length-1;i>=0;i--)
		{
			rev+=carr[i];
		}
		rev+=" ";
		}
		System.out.println(rev);
	}
}
*/
/*
//google 
//duplicates:og
//uniques:gle
import java.util.Scanner;
class Sri1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		String uniques="";
		String duplicates="";
		for(int i=0;i<str.length();i++)
		{
			String current=Character.toString(str.charAt(i));
			if(uniques.contains(current))
			{
			
					if (!duplicates.contains(current))
					{
						duplicates+=current;
						continue;
					}
			}
			uniques+=current;
		}
		
		System.out.println(uniques);
	}
  }
*//*
import java.util.Scanner;
class Sri1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
	
		String uniques="";
		String duplicates="";
		
		for(int i=0;i<str.length();i++)
		{
			String current=Character.toString(str.charAt(i));
			if(uniques.contains(current))
			{
				if(!duplicates.contains(current))
				{
					duplicates+=current;
					continue;
				}
			}
				uniques+=current;
			}
			System.out.println(duplicates+":are duplicate charactres");
			System.out.println(uniques+":are uniques characters");
			
		
	}
}
*//*
class Sri1
{
	public static void main(String[] args)
	{
		String str="ihubtalent";
		for(int i=0;i<=str.length();i++)
		{
			char ch=str.charAt(i);
		
		System.out.println(ch);
		}
	}
}
*/import java.util.Scanner;
class sri1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] sarr=str.split("");
		String rev="";
		
		for(String s:sarr)
		{
			char[] carr=s.toCharArray();
				
		for (int i=carr.length-1;i>=0;i--)
		{
			rev+=carr[i];
		}
		rev+="";
		}
		System.out.println(rev);		
		
		}
		
		
}