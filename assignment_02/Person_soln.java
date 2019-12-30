/*
   Project 2 - Person.java; Simple person emulator

   CT01498 - Beginning Java; Fairfax County Public Schools,
                             Adult And Community Education
*/


/**
 * This sample shows two ways of extracting first and last names from an
 * input string, in the 'parseUsingIndexOf' and 'parseUsingStringSplit'
 * methods.  The constructor below uses one and comments the other.
 */
class Person
{
   private String  firstName;
   private String  lastName;
   private int     age;

   private static final int DEFAULT_AGE = 21;

	public Person(String inFullName)
   {
//     parseUsingIndexOf( inFullName );
     parseUsingStringSplit( inFullName );
	  age = DEFAULT_AGE;
   };

   private void parseUsingIndexOf(String inFullName)
   {
     int ndx = inFullName.indexOf( " " );
     if ( ndx < 0 ) {                          //  no embedded blank
       firstName = inFullName;
       lastName = "";
     }
     else {
       firstName = inFullName.substring( 0, ndx );
       lastName = inFullName.substring( ndx+1 );
     }
   }

   private void parseUsingStringSplit(String inFullName)
   {
     String[] parts = inFullName.split( " " );
     firstName = ( parts.length > 0 ) ? parts[ 0 ] : "";
     lastName = ( parts.length > 1 ) ? parts[ 1 ] : "";
   }

   /**
      Accessor for first name
   */
   public String getFirstName()         
   {
      return firstName;
   }

   /**
      Accessor for last name
   */
   public String getLastName()         
   {
      return lastName;
   }

   /**
      Accessor for date of age
   */
   public int getAge()
   {
      return age;
   }

   /**
      Accessor for date of age
   */
   public void setAge(int inAge)
   {
	   if ( inAge >= 1 && inAge <= 100 ) {
		    age = inAge;
		}
		//  alternate implementation, using ternary conditional operator
//		age = ( inAge < 1 || inAge > 100 ) ? age : inAge;
   }

   /**
      Dump personal information to a string
   */
   public String dump()
   {
     StringBuilder buff = new StringBuilder();
     dump( buff );
     return buff.toString();
   }

   /**
      Dump personal information to the input buffer
   */
   public void dump(StringBuilder inBuff)
   {
      if ( inBuff != null ) {
        inBuff.append( "Name: " ).append( lastName );
		  inBuff.append( ", " ).append( firstName ).append( "\n" );
        inBuff.append( "...age: " ).append( age ).append( "\n" );
      }
   }
}   //   Person class
