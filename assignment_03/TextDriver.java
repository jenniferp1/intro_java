/*
   Project 3 - TextDriver.java; Driver for the person emulator class

   CT01498 - Beginning Java; Fairfax County Public Schools,
                             Adult And Community Education
*/


import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;


class TextDriver                              //  begin class definition -  1
{

   public static void main(String[] inArgs)            //   test driver  -  2
   {
      System.out.println( "Person demonstration program" + "\n" );

      Person p = initPerson( "John Doe", "1/1/1986", "123 Main Street",
                             "Anywhere", "VA", "20001" );
      System.out.print( getDumpString( p ) );

      p = initPerson( "Jane Doe", "12/15/1974", "123 Main Street",
                      "Anywhere", "VA", "20001" );
      System.out.print( getDumpString( p ) );

      p = initPerson( "Mary Smith", "9/16/1978", "123 Main Street",
                      "Nowhere", "MD", "00001" );
      System.out.print( getDumpString( p ) );

      System.out.println( "program ends" );

      return;

   }   //   main()

   private static Person initPerson(String inName, String inDob, String inStreet,
                                    String inCity, String inState, String inZip )
   {
      Person returnPerson = new Person( inName );

      Date dob = createDate( inDob );
      returnPerson.setBirthday( dob );
      returnPerson.setStreet( inStreet );
      returnPerson.setCity( inCity );
      returnPerson.setState( inState );
      returnPerson.setZip( inZip );

      return returnPerson;
   }

   private static Date createDate(String inString)
   {
     DateFormat df = DateFormat.getDateInstance( DateFormat.SHORT );
     Date returnDate = null;
     try {
       returnDate = df.parse( inString );
     }
     catch ( ParseException pe ) {
       System.err.println( "Oops! can't parse this date: " + inString );
     }
     return returnDate;
   }

   private static String getDumpString(Person inPerson)
   {
     StringBuffer dumpBuff = new StringBuffer();
     inPerson.dump( dumpBuff );
     return dumpBuff.toString();
   }

}   //   TextDriver class


/*   Output from test program

 Person demonstration program 
  
  Name: Doe, John
  ...age: 18, dob: 01/01/1986
  ...address: 123 Main Street
              Anywhere, VA  20001
  Name: Doe, Jane
  ...age: 34, dob: 12/15/1974
  ...address: 123 Main Street
              Anywhere, VA  20001
  Name: Smith, Mary
  ...age: 30, dob: 09/16/1978
  ...address: 123 Main Street
              Nowhere, MD  00001
program ends

*/


/*  other test cases:

  - What if one or more of the address fields is not set?
  - What if an address field is set with an empty string?
  - What if an address field is set with a null string?
  - What if a null date of birth is entered?
  - Does the age-from-dob calculation work properly?
    - What if a dob of this day, in 1980. is used as date of birth?
      - Is the calculated age 28?
    - What if a dob of yesterday, in 1980, is used as date of birth?
      - Is the calculated age 27?
    - What if a dob of tomorrow, in 1980, is used as date of birth?
      - Is the calculated age 28?
  - Change the date-of-birth dump to display the date in different formats,
    for example, including full moth name, day of week, etc.

*/
