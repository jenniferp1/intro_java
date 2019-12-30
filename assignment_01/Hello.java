/*
 * Sample 1 - Hello.java; A simple 'Hello, world' program, Java O-O style
 *
 * CT01498 - Beginning Java; Fairfax County Public Schools,
 *                           Adult And Community Education
 */

/*
 * An Object-Oriented Hello World demonstration.
 */
public class Hello                            //  begin class definition -  1
{
   private static String GREETING = "Hello"; //  class field             -  2

   private              String      myTarget;//  instance field          -  3
// visibility qualifier, data type, field name

   private String myGrt;
      
   public Hello(String inTarget)             //  constructor             -  4
/* constructors not methods - there's no return type and the name matches
 class name exactly.  That's how distinguish constructor from method */
   {
      myTarget = inTarget;                   //  constructor body        -  5
   }

   public void displayGreeting()             //  define a method         -  6
 //     void = return type (no results returned).  methods have ()  
   {
      System.out.print( GREETING );          //  body - what's being done-  7
      System.out.print( ", " );
      System.out.println( myTarget );        // println has carriage return
   }                                         //  end of method body      -  8
   
   public void newGreeting(String inpt)
   {
      myGrt = inpt;
      System.out.println(myGrt);
      return;
   }

   public static void main(String[] inArgs)   //  main method, static = class level-  9
   {
      Hello hw;                               //  allocate a reference   - 10
// when defining a class it becomes a brand new data type

      hw = new Hello("world");         // invoking  constructor
/* creating an instance of the class by calling constructor - 
hw is now a Hello object */
// one line option:  Hello hw = new Hello("world");

      Hello hp = new Hello("planet!");        // new instance of Hello         
                
      hw.newGreeting("Hola!");
      hw.displayGreeting();                   //  invoke a method        - 12
      
      hp.displayGreeting();
            
      return;                                 //  return to caller       - 13

   }   //   main()

}   //   Hello class                          end class definition       - 14

/*  expected output:

Hello, world

*/

/*  try this:

  - Add an exclamation point, to the printed message is 'Hello, world!'.

  - Add another instance of Hello to main() and initialize it with 'planet':
    Hello hp = new Hello( "planet" );
    - Add a call to displayGreeting on this new object; hp.displayGreeting().
    - Compile and run the result.

  - Add these lines to main(), following the planet lines above:
    hw.GREETING = "Howdy";
    hw.displayGreeting();
    hp.displayGreeting();
    hp.GREETING = "Hola";
    hw.displayGreeting();
    hp.displayGreeting();
    Hello.GREETING = "Hello";
    hw.displayGreeting();
    hp.displayGreeting();
    - What output do you expect from these changes?
    - Compile and run the result.

  - Add each of these lines to main(), followIng line 12.  Compile & run the
    result after adding each new line.  For each line answer these questions:
    - Will it compile without error?
    - If not, why not?
    - How do you expect it change the program output?

    System.out.println( "class greeting field is: " + GREETING );

    System.out.println( "class greeting field is: " + Hello.GREETING );

    System.out.println( "myTarget field is: " + myTarget );

    System.out.println( "Hello.myTarget field is: " + Hello.myTarget );

    System.out.println( "hw.myTarget field is: " + hw.myTarget );

    System.out.println( "planet.myTarget field is: " + hp.myTarget );

    Hello.displayGreeting();

    System.out.println( "hw.GREETING field is: " + hw.GREETING );  //bad coding pract.

    System.out.println( "planet.GREETING field is: " + hp.GREETING );  //bad coding pract.
*/
