/*
   Project 1 - TextDriver.java; Driver for the Sample1 class

   CT01498 - Beginning Java; Fairfax County Public Schools,
                             Adult And Community Education
*/

/*
 * A driver (main method) to test your solution class.  Put this class
 * in the same directory as your class.  Compile both and run the
 * main() method in this class.
 *
 * This test driver will produce no 'ERROR' output messages when run
 * against a correct solution.
 */
class TextDriver
{

   public static void main(String[] inArgs)
   {
      System.out.println( "Object vs. Class sample program" );
      System.out.println( "" );

//  validation of class values
      int actualIntValue = Sample1.getIntClassFieldValue();
      if ( actualIntValue != 0 ) {
         System.err.println( "ERROR! expected class value of 0, found " +
                             actualIntValue );
      }
      float actualFloatValue = Sample1.getFloatClassFieldValue();
      if ( actualFloatValue != 0.0 ) {
         System.err.println( "ERROR! expected class value of 0.0, found " +
                             actualFloatValue );
      }
      Sample1.setIntClassFieldValue( 66 );
      actualIntValue = Sample1.getIntClassFieldValue();
      if ( actualIntValue != 66 ) {
         System.err.println( "ERROR! expected class value of 66, found " +
                             actualIntValue );
      }
      Sample1.setFloatClassFieldValue( 2.73f );
      actualFloatValue = Sample1.getFloatClassFieldValue();
      if ( actualFloatValue != 2.73f ) {
         System.err.println( "ERROR! expected class value of 2.73, found " +
                             actualFloatValue );
      }
      Sample1.dumpClassValues();

//  validation of object values
      Sample1 subject = new Sample1();
      if ( subject == null ) {
         System.err.println( "ERROR! expected non-null reference" );
      }
      actualIntValue = subject.getIntObjectFieldValue();
      if ( subject.getIntObjectFieldValue() != 0 ) {
         System.err.println( "ERROR! expected object value of 0, found " +
                             actualIntValue );
      }
      actualFloatValue = subject.getFloatObjectFieldValue();
      if ( actualFloatValue != 0.0 ) {
         System.err.println( "ERROR! expected object value of 0.0, found " +
                             actualFloatValue );
      }
      subject.setIntObjectFieldValue( 38 );
      actualIntValue = subject.getIntObjectFieldValue();
      if ( subject.getIntObjectFieldValue() != 38 ) {
         System.err.println( "ERROR! expected object value of 38, found " +
                             actualIntValue );
      }
      subject.setFloatObjectFieldValue( 1.414f );
      actualFloatValue = subject.getFloatObjectFieldValue();
      if ( actualFloatValue != 1.414f ) {
         System.err.println( "ERROR! expected object value of 1.414, found " +
                             actualFloatValue );
      }
      subject.dumpObjectValues();

//  class values through object reference
      actualIntValue = subject.getIntClassFieldValue();
      if ( actualIntValue != 66 ) {
         System.err.println( "ERROR! expected class value of 66 via " +
                             "ref, found " + actualIntValue );
      }
      actualFloatValue = subject.getFloatClassFieldValue();
      if ( actualFloatValue != 2.73f ) {
         System.err.println( "ERROR! expected class value of 2.73 via " +
                             "ref, found " + actualFloatValue );
      }
      subject.setIntClassFieldValue( 1357 );
      actualIntValue = subject.getIntClassFieldValue();
      if ( actualIntValue != 1357 ) {
         System.err.println( "ERROR! expected class value of 1357 via " +
                             "ref, found " + actualIntValue );
      }
      subject.setFloatClassFieldValue( ( float ) Math.PI );
      actualFloatValue = subject.getFloatClassFieldValue();
      if ( actualFloatValue != ( float ) Math.PI ) {
         System.err.println( "ERROR! expected class value of PI via " +
                             "ref, found " + actualFloatValue );
      }
      subject.dumpClassValues();

//  object values through class reference
//    Sample1.setIntValue( 1357 );
//    Sample1.setFloatValue( 98.6f );
//    Sample1.dumpValues();

      System.out.println( "" );
      System.out.println( "program ends" );

      return;

   }   //   main()

}   //   TextDriver class


/*   Output from driver program
 
 Object vs. Class sample program

  class int field value: 66, class float field value: 2.73
  int field value: 38, float field value: 1.414
  class int field value: 1357, class float field value: 3.1415927
  
  program ends
*/


/*  other test cases:

  - Each of the lines under 'object values through class reference' should
    cause a compile error.  Verify this by uncommenting each line and
    attempting to recompile.
*/


/*  further investigation, after your solution passes this test:

  - For each of the potential errors this test driver may detect,
    update your solution class to trigger the error message.
*/
