/*
   Project 3 - Address.java; Simple address emulator

   CT01498 - Beginning Java; Fairfax County Public Schools,
                             Adult And Community Education
*/


class Address
{
   private String    street;
   private String    city;
   private String    state;
   private String    zip;

   public Address(String inStreet, String inCity, String inState, String inZip)
   {
     street = inStreet;
     city = inCity;
     state = inState;
     zip = inZip;
   }

   /**
      Accessor for street address
   */
   public String getStreet()
   {
      return street;
   }

   /**
      Accessor for city, state and zip
   */
   public String getCityStateZip()
   {
	   //  simple to read, but less efficient
//      return city + ", " + state + "  " + zip;

	   //  not as simple to read, but more efficient
		StringBuilder buff = new StringBuilder( city );
		buff.append( ", " ).append( state ).append( " " ).append( zip );
      return buff.toString();
   }

   /**
      Accessor for street address
   */
   public void setStreet(String inStreet)
   {
      street = inStreet;
   }

   /**
      Accessor for city
   */
   public void setCity(String inCity)
   {
      city = inCity;
   }

   /**
      Accessor for state
   */
   public void setState(String inState)
   {
      state = inState;
   }

   /**
      Accessor for zip code
   */
   public void setZip(String inZip)
   {
      zip = inZip;
   }

   /**
      Dump personal information to standard output
   */
   public void dump(StringBuffer inBuff)
   {
      if ( inBuff != null ) {
        inBuff.append( "address: " + getStreet() + "\n" );
        inBuff.append( "            " + getCityStateZip() + "\n" );
      }
   }

}   //   Address class

