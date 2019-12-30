/*
   Project 4 - TextDriver.java; Driver for the student emulator class

   CT01498 - Beginning Java; Fairfax County Public Schools,
                             Adult And Community Education
*/


class TextDriver
{

   public static void main(String[] inArgs)
   {
      System.out.println( "Student demonstration program" + "\n" );

      Student s = initStudent( "John Doe", 1986, 1, 1 );
      s.addTestScore( 95 );
      s.addTestScore( 92 );
      s.addTestScore( 88 );
      s.addTestScore( 85 ); 
      System.out.print( getDumpString( s ) );

      s = initStudent( "Jane Doe", 1974, 9, 16 );
      s.addTestScore( 75 );
      s.addTestScore( 82 );
      s.addTestScore( 78 );
      s.addTestScore( 85 );
      System.out.print( getDumpString( s ) );

      s = new Student( "Mary Smith" );
      s.setBirthday( "9/15/1974" );
      setAddress( s );
      System.out.print( getDumpString( s ) );

      System.out.println( "program ends" );

      return;

   }   //   main()

   private static Student initStudent(String inName, int inYear, int inMon, int inDay)
   {
      Student returnStudent = new Student( inName, inYear, inMon, inDay );
      setAddress( returnStudent );
      return returnStudent;
   }

   private static void setAddress(Person inPerson)
   {
      inPerson.setStreet( "123 Main Street" );
      inPerson.setCity( "Anywhere" );
      inPerson.setState( "VA" );
      inPerson.setZip( "20001" );
   }

   private static String getDumpString(Person inPerson)
   {
     StringBuffer dumpBuff = new StringBuffer();
     inPerson.dump( dumpBuff );
     return dumpBuff.toString();
   }

}   //   TextDriver class


/*   Output from test program

 Student demonstration program

  Name: Doe, John
  ...age: 23, dob: 01/01/1986
  ...address: 123 Main Street
              Anywhere, VA  20001
  ...4 tests, scores:
  ......test[0]: 95
  ......test[1]: 92
  ......test[2]: 88
  ......test[3]: 85
  ...test average: 90.0
  Name: Doe, Jane
  ...age: 34, dob: 09/16/1974
  ...address: 123 Main Street
              Anywhere, VA  20001
  ...4 tests, scores:
  ......test[0]: 75
  ......test[1]: 82
  ......test[2]: 78
  ......test[3]: 85
  ...test average: 80.0
  Name: Smith, Mary
  ...age: 34, dob: 09/15/1974
  ...address: 123 Main Street
            Anywhere, VA  20001
  ...0 tests, scores:
  ...test average: 0.0

  program ends

*/


/*  other test cases:

  - What if a negative test score is entered?
  - What if a test score over 100 is entered?
  - Suppose initStudent() is changed to create and return a Person instance.
    [ since Person has no ctor combining name and dob, use setBirthday() ]
    - What result do you expect?
    - What is the actual result?
  - Change the declaration of the variable s, in main(), to Person.
    - What result do you expect?
    - What is the actual result?
  - Add a method to the Student class to calculate a grade based on test scores;
    e.g. char calculateTestGrade().
    - Assign a letter grade to various ranges of average test scores.
    - Update Student.dump() to include the letter grade.

*/
