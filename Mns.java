/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String rev="";
		String [] sarr=str.split(" ");
		
			
			for(int i=sarr.length-1;i>=0;i--)
			{
				rev+=sarr[i];
			}
		System.out.println(rev);
	}
}


*/
/*

import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the string:");
	String str=sc.next();
	String duplicates="";
	String uniques="";
	
	for(int i=0;i<=str.length()-1;i++)
	{
		
		String current=Character.toString(str.charAt(i));
		//String current=Character.toString(str.charAt(i));

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
	//System.out.println(duplicates);
	System.out.println(uniques);
}
}
*/
/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		
		int maxCount=0;
		char element=' ';
		for(int i=0;i<str.length();i++)
		{
			int cnt=0;
			
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					cnt++;
					
				}
				
				if(maxCount<cnt)
				{
					maxCount=cnt;
					element=str.charAt(j);
				}
				
			}
			System.out.println(element+"is repeating"+maxCount+"times");
		}
		}
	}
*/
/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		
	str.replaceAll(" //s"," ");
	System.out.println(str);
	}

*/
/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		//String str="i hub tale nt";
		
		String str1=str.replaceAll("\\s","");
		
		System.out.println(str1);
	}
}
*/
/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String delete="iss";
		str=str.replaceAll(delete,"");
		
		System.out.println(str);
	}
}
	*/
	
/*	
import java.util.Scanner;
class Mns
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
		System.out.println(rev);
	}
}
*//*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println(sb.reverse().toString());
	}
}
		
	*/
/*	
import java.util.Scanner;
class Mns
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
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
		
}*/
/*
import java.util.Scanner;
class Mns
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
*//*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		
		String str=sc.nextLine();
		
		String duplicates="";
		String uniques="";
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
		System.out.println(duplicates);System.out.println(uniques);
}
}
*/
/*
import java.util.Scanner;
import java.util.Arrays;
class Mns
{
	public static void main(String[] args)
	{
		Scaner sc=new Scanner(System.in);
		System.out.println("Enter the string1");
		String str1=sc.nextLie();
		System.out.println("Enter the second String2:");
		String str2=sc.nextLine();
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag=true;
		for(int i=0;ch1<length;i++ )
		{
			if (ch1[i]!=ch2[i])
			{
				flag=false;
				break;
			}
		}
		if (flag)
		{
			System.out.println("This is Anagram");
		}
		else
			System.out.println("This is not ana anagram");
	}
}
*/
/*
import java.util.Arrays;
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String str1=sc.nextLine();
		System.out.println("Enter the second String:");
		String str2=sc.nextLine();
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		boolean flag=true;
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				flag=false;
				break;
			}
				
		}
		if (flag)
		{
			System.out.println("this is anagram");
		}
		else
			System.out.println("This is not anagram");
	}
}
*//*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the new string");
		String str=sc.nextLine();
		
		String str1=str.replace("hii","bye");
		
		System.out.println(str1);
	}
		
		
		
}
*/
/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		
		for(int i=0;i<str.length();i++)
		{
			
			if (Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			
			else
			{
				int k=Character.getNumericValue(str.charAt(i));
				for (int j=1;j<k;j++)
				{
					System.out.print(str.charAt(i-1));
				}
				}
				
				
		}
}
}*/

/*

import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		
		for(int i=0;i<str.length();i++)
		{
			if (Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				int k=Character.getNumericValue(str.charAt(i));
				for (int j=1;j<k;j++)
				{
					System.out.print(str.charAt(i-1	));
					
				}
			}
		}
}
}
*/
/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
	for (int i=0;i<str.length();i++ )
	{
		for (int j=0;j<str.length();j++)
		{
			if (i!=j)
			{
				System.out.println(str.charAt(i)+""+str.charAt(j));
			}
		}
	}
	}
}
*/
/*
class Mns
{
	public static void main(String[] args)
	{
		String str="ABC";
		
		permutation(str.toCharArray(),0);
		
		
		
	}
	//calllie method
	public static void permutation(char[] arr,int fi)
	{
		if (fi==arr.length-1)
		{
				System.out.println(arr);
				return;
				
		}
		for (int i=fi;i<arr.length;i++)
		{
			swap(arr,fi,i);
			permutation(arr,fi+1);
			swap(arr,fi,i);
		}
		
	}
	public static void swap(char[] arr,int fi,int i)
	{
		char temp=arr[fi];
		arr[fi]=arr[i];
		arr[i]=temp;
	}
	
}
*/
/*

import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		for (int i=0;i<str.length();i++)
		{
			for (int j=0;j<str.length();j++)
			{
				if(i!=j)
				{
					System.out.println(str.charAt(i)+""+str.charAt(j));
				}
			}
		}
}
}
*/
/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();//This is Java Class
		
		
		String[] sarr=str.split(" "); //This   is   Java Class
		for(String s:sarr)
		{
			if(s.charAt(0)>='A' && s.charAt(0)<='Z')
			{
				System.out.println(s+"");
			}
		}
	}
	
}
*/
//Q) Write a java program to display the strings starting with uppercase letter?

/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		String[] sarr=str.split(" ");
		
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch+"");
			}
		}
	}
}
		
*/
////Q) Write a java program to display the strings starting with vowels?
/*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		String[] sarr=str.split(" ");
		
		for(String s:sarr)
		{
			char ch=s.charAt(0);
			if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(s+"");
			}
		}
	}
}*//*
import java.util.Scanner;
class Mns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		
		int count=0;
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}
}
*/

/*
class Mns
{
	
	public static void main(String[] args)
	{
		
		String str1="ABCAB";
		
		String str2="AECB";
		System.out.println(longestCommonSubsequence(str1,str2));
		
		
	}
	//calliemethod
	public static void longestCommonSubsequence(String s1,String s2)
	{
		return solve(s1,s2,0,0);
	}
	//calliemethod
	
	public static int solve(String s1,String s2,int i,int j)
	{
		if (i==s1.length())
		{
			return 0;
		}
		if (j==s2.length())
		{
			return 0;
		}
		int ans=0;
		if (s1.charAt(i)==s2.charAt(j))
		{
			ans=1+solve(s1,s2,i+1,j+1);
		}
		else
		{
			ans=Math.max(solve(s1,s2,i+1,j),solve(s1,s2,i,j+1));
		}
		
		return ans;
		
}
}
*//*
class Mns 
{
	public static void main(String[] args) 
	{
		String str1="ABCAB";
		String str2="AECB";
		
		//caller method
		System.out.println(longestCommSubsequence(str1,str2));
	}
	//callie method
	public static int longestCommSubsequence(String s1,String s2)
	{
		return solve(s1,s2,0,0);
	}
	//callie method
	public static int solve(String s1,String s2,int i,int j)
	{
		if(i==s1.length())
			return 0;
		
		if(j==s2.length())
			return 0;
		
		int ans=0;
		if(s1.charAt(i)==s2.charAt(j))
		{
			ans=1+solve(s1,s2,i+1,j+1);
		}
		else
		{
			ans=Math.max(solve(s1,s2,i+1,j),solve(s1,s2,i,j+1));
		}
		
		return ans;
	}
}
*/
/*

class Mns
{
	public static void main(String[] args)
	{
		String str="A1B2C3D4";
		
		for (int i=0;i<str.length();i++)
		{
			if (Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				int k=Character.getNumericValue(str.charAt(i));
				for (int j=1;j<k;j++)
				{
					System.out.print(str.charAt(i-1));
				}
		}
		}
	}
}
*//*
class Mns
{
	public static void main(String[] args)
	{
		String str="ABBCCDDD";
		
		int count=1;
		
		StringBuffer sb=new StringBuffer();
		
		for (int i=0;i<str.length();i++)
		{
			if (i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
			{
				count++;
				
			}
			
			else
			{
				sb.append(str.charAt(i)).append(count);
				count=1;
		}
		}
		System.out.println(sb.toString());
	}
}
*/

/*
class Mns
{
	public static void main(String[] args)
	{
		String str="ABC";
		permutation(str.toCharArray(),0);
			
	}
	
	
	//callie method
	public  static void permutation(char[] arr,int fi)
	{
		if (fi==arr.length-1)
		{
			System.out.println(arr);
			return;
			
		}
		for (int i=fi;i<arr.length ;i++ )
		{
			swap(arr,fi,i);
			permutation(arr,fi+1);
			swap(arr,fi,i);
		}
		
	}
	public static void swap(char[] arr,int fi,int i)
	{
		char temp=arr[fi];
		arr[fi]=arr[i];
		arr[i]=temp;
	}
}

*//*
import java.util.Arrays;
class Mns
{
	public static void main(String[] args)
	{
		int []arr={2,4,5,7,3,8,9,1};
		int element=2;
		
		int[] newArr=new int[arr.length-1];
		int j=0,cnt=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==element&&cnt==0)
			{
				cnt=1;
				continue;
			}
			newArr[j++]=arr[i];
		}
		Arrays.sort(newArr);
		for(int i:newArr)
		{
			System.out.print(i+" ");
		}
		}
}
*//*
import java.util.Arrays;
class Mns
{
	public static void main(String[] args)
	{
		int []arr={1,0,0,1,0,1,0,0,1,0,0,1};
		
		int []newArr=new int[arr.length];
		
		int j=0;
		for(int i:arr)
		{
			if(i==0)
			{
				newArr[j++]=i;
			}
		}
		while (j<arr.length)
		{
			
			newArr[j++]=1;
		}
		
		for(int i:newArr)
		{
			System.out.print(i+" ");
		}
		
	}
		
	
}
*/
/*
class Mns
{
	public static void main(String[] args)
	{
		int []arr={5,2,3,8,9,1,4,6};
		int sum=10;
		
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]+arr[j]==sum)
		{
			System.out.println(arr[i]+""+arr[j]);
		}
	}
	}
}
}







*/
class Mns
{
	public static void main(String[] args)
	{
		String str="HELLO";
		String rev=" ";
		for (int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.print(rev);
	}
	
}