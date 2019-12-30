/*
   Project 3 - Person.java; Simple person emulator

   CT01498 - Beginning Java; Fairfax County Public Schools,
                             Adult And Community Education
*/

import java.util.Calendar;
import java.util.Date;

import java.text.DateFormat;


class Person
{
   private String    firstName;
   private String    lastName;
   private String[]  address;
   private Date      dob;

   public Person(String inFullName)
   {
     parseUsingStringSplit( inFullName );
     dob = Calendar.getInstance().getTime();
     address = new String[ 4 ];
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
      Accessor for date of birth
   */
   public Date getBirthday()
   {
      return dob;
   }

   /**
      Accessor for date of birth
   */
   public void setBirthday(Date inDob)
   {
      if ( inDob != null ) {
        dob = inDob;
      }
   }

   /**
      Accessor for age
   */
   public int getAge()         
   {
      return calculateAge();
   }

   /**
      Accessor for street address
   */
   public String getStreet()
   {
      return address[ 0 ];
   }

   /**
      Accessor for city, state and zip
   */
   public String getCityStateZip()
   {
      return address[ 1 ] + ", " + address[ 2 ] + "  " + address[ 3 ];
   }

   /**
      Accessor for street address
   */
   public void setStreet(String inStreet)
   {
      address[ 0 ] = inStreet;
   }

   /**
      Accessor for city
   */
   public void setCity(String inCity)
   {
      address[ 1 ] = inCity;
   }

   /**
      Accessor for state
   */
   public void setState(String inState)
   {
      address[ 2 ] = inState;
   }

   /**
      Accessor for zip code
   */
   public void setZip(String inZip)
   {
      address[ 3 ] = inZip;
   }

   /**
      Utility to calculate number of years between the current date of
        birth and today.
   */
   private int calculateAge()         
   {
      Calendar today =  Calendar.getInstance();
      Calendar dobAsCalendar =  Calendar.getInstance();
      dobAsCalendar.setTime( dob );
      
      int todayElement = today.get( Calendar.YEAR );
      int dobElement = dobAsCalendar.get( Calendar.YEAR );

      int age = todayElement - dobElement;
      
      todayElement = today.get( Calendar.MONTH );
      dobElement = dobAsCalendar.get( Calendar.MONTH );

      if ( todayElement < dobElement ) {
        age--;
      }
      else if ( todayElement == dobElement ) {
        todayElement = today.get( Calendar.DAY_OF_MONTH );
        dobElement = dobAsCalendar.get( Calendar.DAY_OF_MONTH );

        if ( todayElement < dobElement ) {
          age--;
        }
        else if ( todayElement == dobElement ) {
          System.out.println("  HAPPY BIRTHDAY!!!" );
        }
      }
      return age;
   }

   /**
      Dump personal information to standard output
   */
   public void dump(StringBuffer inBuff)
   {
      if ( inBuff != null ) {
        inBuff.append( "Name: " + lastName + ", " + firstName + "\n" );
        String dobString = formatDate( dob );
        inBuff.append( "...age: " + calculateAge() );
        inBuff.append( ", dob: " + dobString + "\n" );
        inBuff.append( "...address: " + getStreet() + "\n" );
        inBuff.append( "            " + getCityStateZip() + "\n" );
      }
   }

   private String formatDate(Date inDate) {
     //  using toString...
//     return inDate.toString();

     //  using DateFormat...
//     DateFormat df = DateFormat.getDateInstance( DateFormat.SHORT );
//     return df.format( inDate );

     //  using Formatter...
     return String.format( "%tm/%<td/%<tY", inDate );

   }

}   //   Person class

