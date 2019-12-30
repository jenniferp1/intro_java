/*
   Project 2 - TextDriver.java; Driver for the person emulator class

   CT01498 - Beginning Java; Fairfax County Public Schools,
                             Adult And Community Education
*/

class TextDriver
{
   public static void main(String[] inArgs)            //   test driver  -  2
   {
      System.out.println( "Person demonstration program" + "\n" );
      Person p = new Person( "John Doe" );
      p.setAge( 38 );
      System.out.println( p.dump() );

      p = new Person( "Jane Doe" );
      p.setAge( 26 );
      System.out.println( p.dump() );

      p = new Person( "Bill Gates" );
      System.out.println( p.dump() );

      p.setAge( 0 );
      System.out.println( p.dump() );

      p.setAge( 101 );
      System.out.println( p.dump() );
		System.out.println( "program ends" );
      return;

   }   //   main()
   
}   //   TextDriver class

/*   Output from demo program

 Person demonstration program   
 
Name: Doe, John
 ...age: 38
 
 Name: Doe, Jane
 ...age: 26
 
 Name: Gates, Bill
 ...age: 21
 
 Name: Gates, Bill
 ...age: 21
 
 Name: Gates, Bill
 ...age: 21
 
 program ends

*/

/*  other test cases:
  - What if a negative age is entered?
  - What if an invalid name is input to the ctor; i.e having no space,
    or empty, or null?
  - Add an optional middle name or initial.  Which name parsing scheme is
    easier to adapt for this change?
  - What other fields and methods might be added to this class to more
    closely model a 'real' person?
*/
