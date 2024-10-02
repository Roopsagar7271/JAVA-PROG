/*
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
*/

/*class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
}
}*/

/*
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4

*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=4;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
}
}
*/
/*
4 4 4 4 
3 3 3 3
2 2 2 2 
1 1 1 1 
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=4;i>=1;i--)
		{
			for (int j=1;j<=4;j++)
			{
				System.out.print(i+" ");	
			}
			System.out.println();
		}
}
}
*/
/*
    4 3 2 1 
	4 3 2 1
	4 3 2 1
	4 3 2 1
*/
/*
 class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4;i++)
		{
			for (int j=4;j>=1;j--)
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}
}
}
*/

/*
A A A A
B B B B 
C C C C 
D D D D 
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (char i='D';i>='A';i--)
		{
			for (char j='A';j<='D';j++ )
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		}
}
*/

/*
D D D D
C C C C
B B B B
A A A A
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (char i='D';i>='A';i--)
		{
			for (char j='A';j<='D';j++ )
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		}
}
*/

/*
A B C D
A B C D
A B C D
A B C D
*/
/*


class Pattern
{
	public static void main(String[]args)
	{
		for (char i='D';i>='A';i--)
		{
			for (char j='A';j<='D';j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		}
}

*/
/*
D C B A
D C B A
D C B A
D C B A
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (char i='A';i<='D';i++)
		{
			for (char j='D';j>='A';j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		}
}
*/



/*
* * * * 
* * * *
* * * *
* * * * 
*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
}
}
*/
/*
* * * * 
*     *
*     *
* * * * 
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++)
			{
				if (i==1 || i==4 || j==1 || j==4)
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
}
}
*/

/*
1 1 1 1
2     2
3     3
4 4 4 4
*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++)
			{
				if (i==1 || i==4 || j==1 || j==4)
				{
					System.out.print(i+" ");
				}
				else
				System.out.print("  ");
			}
			System.out.println();
		}
}
}



/*
4 4 4 4
3     3
2     2
1 1 1 1
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=4;i>=1 ;i-- )
		{
			for (int j=1;j<=4;j++)
			{
				if (i==1 || i==4 || j==1 || j==4)
				{
					System.out.print(i+" ");
				}
				else
				System.out.print("  ");
			}
			System.out.println();
		}
}
}
*/

/*
4 3 2 1
4     1
4     1
4 3 2 1
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=4;i>=1 ;i-- )
		{
			for (int j=4;j>=1;j--)
			{
				if (i==1 || i==4 || j==1 || j==4)
				{
					System.out.print(j+" ");
				}
				else
				System.out.print("  ");
			}
			System.out.println();
		}
}
}
*/

/*
1 2 3 4
1     4
1     4
1 2 3 4

*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++)
			{
				if (i==1 || i==4 || j==1 || j==4)
				{
					System.out.print(j+" ");
				}
				else
				System.out.print("  ");
			}
			System.out.println();
		}
}
}
*/

/*
* - - - 
- * - - 
- - * - 
- - - * 
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++)
			{
				if (i==j)
				{
					System.out.print("* ");
				}
				else
				System.out.print("- ");
			}
			System.out.println();
		}
}
}
*/


/*
1 * * *
* 2 * *
* * 3 *
* * * 4
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++)
			{
				if (i==j)
				{
					System.out.print(i+" ");
				}
				else
				System.out.print("* ");
			}
			System.out.println();
		}
}
}
*/

/*
* - - - * 
- * - * - 
- - * - - 
- * - * -
* - - - * 

*//*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++)
			{
				if (i==j || i+j=6)
				{
					System.out.print("* ");
				}
				else
				System.out.print("- ");
			}
			System.out.println();
		}
}
}
*/
//Left side triangle patterns
/*
*
* *
* * *
* * * *
* * * * *
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
				System.out.println();
		}
}
}
*/









/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
				System.out.println();
		}
}
}
*/
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
				System.out.println();
		}
}
}
*/


/*
1
3 5
7 9 11
13 15 17 19
*/


/*
class Pattern
{
	public static void main(String[]args)
	{    
		int num=1;
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num+=2;
			}
				System.out.println();
		}
}
}
*/


/*
2
4 6
8 10 12
14 16 18 20
22 24 26 28 30
32 34 36 38 40 42
*/
/*
class Pattern
{
	public static void main(String[]args)
	{    
		int num=2;
		for (int i=1;i<=6;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num+=2;
			}
				System.out.println();
		}
}
}
*/






/*

//daigonalsquare

class Pattern  
{
	public static void main(String[] args) 
	{
		int n=5;
		//rows
		for(int i=1;i<=n;i++)
		{
			//cols
			for(int j=1;j<=n;j++)
			{
				if (i == j || i + j == n + 1)
					{
					System.out.print(j+" ");
					}
				else
					System.out.print(" ");
			}
			//new line
			System.out.println();
		}
	}
}
*/


/*

*  *  *
 *  *
*  *  *
 *  *
*  *  *

*/
/*
class Pattern 
{
	public static void main(String[] args) 
	{
		//rows
		for(int i=1;i<=5;i++)
		{
			//cols
			for(int j=1;j<=5;j++)
			{
				if((i+j)%2==0)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			//new line
			System.out.println();
		}
	}
}
*/
/*
1
2 2 
3 3 3 
4 4 4 4
*//*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4;i++ )
		{
		for (int j=1;j<=i ;j++ )
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		}
}
}
*/

/*
*
* *
* * *
* * * *
*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4;i++ )
		{
		for (int j=1;j<=i ;j++ )
		{
			System.out.print("* ");
			
		}
		System.out.println();
		}
	}
}
/*
4 4 4 4 
3 3 3 
2 2 
1 
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for(int i=4;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
				System.out.println();
		}
}
}
*/
/*
* * * *
* * *
* *
*
*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		for(int i=4;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
				System.out.println();
		}
}
}
/*
/*
1 2 3 4
1 2 3
1 2
1
*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		for(int i=4;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
				System.out.println();
		}
}
}
*/

/*
1
2 3
4 5 6
7 8 9 10
*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
				System.out.println();
		}
}
}
*/

/*
1
2 3
4 5 6
7 8 9 0
*/

/*


class Pattern
{
	public static void main(String[]args)
	{
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				if(k<=9)
				{
				System.out.print(k+" ");
				}
				k++;
				else
				{
					System.out.print("0");
				}
			}
				System.out.println();
				
				
		}
}
}
*/
/*
2
4 6
8 10 12
14 16 18 20
*/

/*
class Pattern
{
	public static void main(String[]args)
	{
		int k=2;
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
			
				System.out.print(k+" ");
				k+=2;
				}
				System.out.println();
			}
				
				
				
		}
}
*/
/*
1
3 5
7 9 11
13 15 17 19
*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
			
				System.out.print(k+" ");
				k+=2;
				}
				System.out.println();
			}
				
				
				
		}
}
*/
/*
2
3 5
5 7 11
13 17 19 23
*/
/*

class Pattern
{
	public static void main(String[]args)
	{
		int num=2;
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
			  while (true)
			  {
				  boolean flag=true;
				  for (int k=2;k<=num/2 ;k++)
				  {
					  if (num%k==0)
					  {
						  flag=false;
						  break;
					  }
					  
				  }
				  if (flag==true)
				  {
					  System.out.print(num+" ");
						  num++;
						  break;
				  }
				  num++;
			  }
				
				}
				System.out.println();
			}
				
				
				
		}
}

*/
/*
1
1 2
3 2 1
1 2 3 4
*/
/*

class Pattern
{
public static void main(String[]args)
{
	for (int i=1;i<=5 ;i++)
	{
		
				for (int j=i;j>=1;j-- )
				{
				System.out.print(j+" ");
				}
				System.out.println();
	}
	}
}
*/

/*
A 
A B 
A B C 
A B C D 
A B C D E 
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print((char)('A' + j - 1) + " ");
			}
				System.out.println();
		}
	
	}
	
}
*/
/*
A
B A
C B A
D C B A
E D C B A
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=i;j>=1;j--)
			{
				System.out.print((char)('A'+j-1)+" ");
	
	}
	System.out.println();
		}
	
}
}

*/
/*
*
* *
* * *
* * * *
* * *
* *
*

*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=i ;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		for (int i=4;i>=1;i--)
		{
			for (int j=1;j<i ;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
}
}
*/


/*
   *
  * *
 * * *
* * * *
*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=4;i++)
		{
			for (int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		}
}
*/

/*

* * * *
 * * *
  * *
   *
   */
/*

class Pattern
{
	public static void main(String[]args)
	{
		for (int i=4;i>=1;i--)
		{
			for (int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		}
}
*/


/*

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/
/*
class Pattern
{
	public static void main(String[]args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j>i ;j-- )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for (int i=4;i>=1;i--)
		{
			for (int j=5;j>i ;j-- )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		}
}
*/



class Pattern 
{
	public static void main(String[] args) 
	{
		//rows
		for(int i=1;i<=4;i++)
		{
			//space 
			for(int j=4;j>i;j--)
			{
				System.out.print("  ");
			}
			
			//right elements 
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			//new line
			System.out.println();
		}
		
	}
}
/*
  class Pattern 
{
	public static void main(String[] args) 
	{
		//rows
		for(int i=1;i<=4;i++)
		{
			//space 
			for(int j=4;j>i;j--)
			{
				System.out.print("");
			}
			
			//right elements 
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			//new line
			System.out.println();
		}
		
	}
}
*/