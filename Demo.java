//ESCAPE CHARACTERS

// \n===> newline
/*class Demo
{
public static void main(String[]args)
{
  System.out.println("ROOP\nSAGAR");     //It seperates the new line of the output;
}
}*/

// \t====>HORIZONTAL TAB
           /*
           class Demo
          {
               public static void main(String[]args)
                {
                 System.out.println("ROOP\tSAGAR");      //it returns the horizontaltab
                 }


            } */

// \r====>CARRIAGE RETURN

/*class Demo
{
  public static void main(String[]args) 
   {
       System.out.println("ROOP\rSAGAR");        // it returns the carriage return
    }

}*/


//\b====>BACKSPACE
     
/* class Demo
{
    public static void main(String[]args)
    {
System.out.println("ROOP\bSAGAR");          //it delete the character before the escape character we mentioned
}

}*/


//HELLOWORLD PROGRAM
/*class Demo
{
  public static void main(String[]args)
  {
     System.out.println("HELLO WORLD");
   }
}

*/
//====================================================================

// varibles and datatypes
//=====================================================================
 
// numeric datatypes=======>int
/*
	class Demo
	{  
  	  public static void main(String[]args)
   	 {
     	 int i=10;
          System.out.println(i);       // it returns output=10
  	  }
	}
*/
/*
	class Demo
	{
 		 public static void main(String[]args)
 		 {
			int i=false;
			System.out.println(i);  // error: incompatible types: boolean cannot be converted to int
       
		}
	}
*/
  /*
	class Demo
	{
	  public static void main(String[]args)
         {
	    int i="false";
            System.out.println(i);   //error: incompatible types: String cannot be converted to int
            int i="false";
	}
   }

*/
/* 	class Demo
	{
		public static void main(String[]args)
		{
			int i='a';
			System.out.println(i); // it retuns Universal unicode values output;97
		}
       }
*/


//=============>byte datatype
/*
	class Demo
	{
  		
  	 public static void main(String[]args)
 	{
         byte b=10;
         System.out.println(b);		//it returns output;10			
	}
	}
*/
/*	class Demo
	{
          public static void main(String[]args)
	  {
            byte b=27;
            int i=b;
            long l=i;
            System.out.println(l);         // It returns output;27
          }
        }
*/


//In java,numeric datatypes doest store the string ,boolean values and floating values but allows only integer values and characters.


//=========>short data type
/*    
   class Demo
   {
	public static void main(String[]args)
    {
        short s=10;
        System.out.println(s);   // it returns output ;10

   }
}      
        
*/
/*
      class Demo
   {
	public static void main(String[]args)
    {
        short s=10.5;
        System.out.println(s);   //error: incompatible types: possible lossy conversion from double to short
     }
    } 
*/

 /*       

	class Demo
   	{
        	public static void main(String[]args)
                {
                 short s=false;
                 System.out.println(s);          //error: incompatible types: boolean cannot be converted to short
                 }
           }

*/
/*
       class Demo
   	{
        	public static void main(String[]args)
                {
                 short s='a';
                 System.out.println(s);         //it returns output;97                  }
           }

*/


//==========>long datatype
/*
 		class Demo
   	        {
        	public static void main(String[]args)
                {
                 long l=10;
                 System.out.println(l);       //it returns output;10 
                 long l="true";
                 System.out.println(l);    // it returns compile time error because strings are not allowed in long
                 long l='z';
                 System.out.println(l);   // it returns universal unicode value output;122
                 long l=3.5;
                 System.out.println(l);  //error: incompatible types: possible lossy conversion from double to long
                 }
                }
*/

// floating datatype=======>floating datatype
        
/*

	class Demo
        {
         public static void main(String[]args)
	{
		float f=10f;
		System.out.println(f);    //it returns output;10.0
                float f=10;
	        System.out.println(f);      //it returns output;10.0
                float f=TRUE;
	        System.out.println(f);        // error: cannot find symbol
                float f='a';
	        System.out.println(f);          // it returns universal unicode value with decimal value output;97.0
	   
	        float f="true";
	        System.out.println(f);        // error: incompatible types: String cannot be converted to float
		}
	 }
*/
//=======>Double data type

/*
	class Demo
        {
         public static void main(String[]args)
	{
		double d=10f;
		System.out.println(d);    //it returns output;10.0
                double d=10;
	        System.out.println(d);      //it returns output;10.0
                double d=TRUE;
	        System.out.println(d);        // error: cannot find symbol
                double d='a';
	        System.out.println(d);          // it returns universal unicode value with decimal value output;97.0
	   
	        double d="true";
	        System.out.println(d);        // error: incompatible types: String cannot be converted to double
		}
	 }

*/
// In java,floating data types are not allowed string and boolean values.it allows float and char values.

//======>boolean datatype
 /*    
  
      class Demo
	{
	  public static void main(String[]args)
	{ 
		boolean b=true;
		System.out.println(b);     // it returns output;true
		boolean b="true";
		System.out.println(b);	// error: incompatible types: String cannot be converted to boolean
		boolean b='a';
		System.out.println(b);		// error: incompatible types: char cannot be converted to boolean
         
	}
	}

*/

//=======>character datatype

/*   	class Demo
	{
		public static void main(String[]args)
		{
			 char ch='a';
			 System.out.println(ch);   //it returns output;a
		
                         char ch=45;
			 System.out.println(ch);  //it returns universal code output;_

                         char ch="a";
			 System.out.println(ch);  //error: incompatible types: String cannot be converted to char
                        
                }
	}
*/
/* Types of Variables
=======================
1.instance variables
2.static variables
3.Local variables
*/


//1.instance variables
/*	class Demo
	{
		int i=10;   // instance variable
		public static void main(String[]args)
		{
			System.out.println(i);   // error: non-static variable i cannot be referenced from a static context
                       
		}
	}

*/
/*
	class Demo
	{
	 int i=20;
	public static void main(String[]args)
	{
	     Demo d=new Demo();
		System.out.println(d.i);   // it returns output;20
	}	
	}



*/
/*

	class Demo
	{
		int i;
		float f=23.6f;               // instance variable declaration
		String s;
		boolean b;
		public static void main(String[]args)
		{
			Demo d=new Demo();
			System.out.println(d.i);     // it returns output ;0
		        System.out.println(d.f);     // it returns output;23'6
			System.out.println(d.b);     // it returns output;false
			System.out.println(d.s);     // it returns output;null


		}
	}

// In instance variables if we not assign value to variable then JVM will automatically assigns the default values.
*/
/*
 class Demo
 {
  int i='a';
  int k;
  float f=35.10f;
  String s="ROOPSAGAR";
  boolean b=true;
  char ch='d';

    public static void main(String[]args)
	{
          Demo d=new Demo();
	  System.out.println(d.i);       //output;97   universal unicode value
          System.out.println(d.f);       //output;0      default value
          System.out.println(d.s);       //output;35.10
          System.out.println(d.b);       //output;ROOPSAGAR
          System.out.println(d.ch);      //output;true
          System.out.println(d.k);       //output;d
          d.m1();

 	}
  
 public void m1()
 {
    int j=10;              
    float r=23.9f;                 
    boolean p=false;               
    String l="SAGAR sali";         
    System.out.println(j);           //output;10
    System.out.println(r);           //output;23.9
    System.out.println(p);           //output;false
    System.out.println(l);           //output;SAGAR sali

   }

}
*/

/*

class Demo
{
 void m1()
{
   int i=10;
   float f=20.5f;
   boolean b=true;
   char ch='a';
   System.out.println(i);          //output;10
   System.out.println(f);          //output;20.5
   System.out.println(b);          //output;true
   System.out.println(ch);         //output;a
}
public void m2()
{
    int j=20;
    String s="SAGAR";
    System.out.println(j);             //output;20
    System.out.println(s);             //SAGAR
    System.put.println("Hello man");   //Hello man
  
}
public static void main(String[]args)
{   
     Demo d=new Demo();
     d.m1();
     d.m2();

}



}

*/


/*
class Demo
{
     int i=10;
     public static void main(String[]args)
     {

       Demo d1=new Demo();
       Demo d2=new Demo();
       Demo d3=new Demo();
       System.out.println(d1.i);    //10
       System.out.println(d2.i);    //10
       d1.i=100;
       System.out.println(d1.i);    //100
       System.out.println(d2.i);    //10
       System.out.println(d3.i);    //10
       d2.i=200;
       d3.i=300;
      System.out.println(d1.i);    //100
      System.out.println(d2.i);    //200
      System.out.println(d3.i);    //300
      d3.i=400;
      System.out.println(d3.i);    //400

     }



}
*/
// Static variables
/*
                                class Demo
				{
  				static int i=10;
 			        public static void main(String[]args)
 				 {
    					Demo d=new Demo();
   				         System.out.println(i);             //10
   					 System.out.println(Demo.i);        //10
   					 System.out.println(d.i);           //10
				  }
				}

*/
/*
class Demo
{
 static String s;
 public static void main(String[]args)
{
  
System.out.println(s);         //null
System.out.println(Demo.s);    // null
Demo d=new Demo();
System.out.println(d.s);    //null
}
}
*/

   
/*
class Demo
{
 static int i=100;

   public static void main(String[]args)
   {
     
	m1();
       Demo d=new Demo();
       d.m1();
       Demo.m1();
   }

public static void m1()
{
  
   System.out.println(i);
   System.out.println("hello");

}

}
*/

/*
class Demo
{
 static int i=100;
public static void main(String[]args)
{
  Demo d1=new Demo();
  Demo d2=new Demo();
System.out.println(d1.i);    //100
System.out.println(d2.i);    //100
d1.i=10;
System.out.println(d1.i);    //10          
System.out.println(d2.i);    //10
}
}
*/
//Local Variables
/*
class Demo
{
public static void main(String[]args)
{
 int i=10;
 boolean b=true;
 char ch='A';
System.out.println(i);     //10
System.out.println(b);     //true
System.out.println(ch);    //A
}
}
*/
class Demo
{
 public static void main(String[]args)
{
 int i;
System.out.println(i);              //error: variable i might not have been initialized
}
}

/* in local variables if you not assign the any value to variable then the JVM will not provide any value.it shows error.
*/


















