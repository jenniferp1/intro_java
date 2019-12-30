
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Person {
	
	private String personName = " ";
	private String firstName = null;
	private String lastName = null;
	private String[] address = new String[5];
	private int age = 0;
	private Date dob;
	
	private static final Date DEFAULT_DOB = new Date();
	
	public Person(String firstAndLastName)  {
		personName = firstAndLastName;
		dob = DEFAULT_DOB;
	}
	
	public Person(String firstAndLastName, int dobYear, int dobMonth, int dobDay) {
		personName = firstAndLastName;
		String strDob = dobMonth + "/" + dobDay + "/" + dobYear;
		dob = createDate(strDob);
		
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
	
	public String getFirstName() {
		String[] splitName = personName.split("\\s+");
		firstName = splitName[0];
		return firstName;
	}
	
	public String getLastName() { 
		String[] splitName = personName.split("\\s+");
		if (splitName.length > 1) {
			lastName = splitName[1];
		}
		else {
			lastName = " ";
		}
		return lastName;
	}
	
	public int getAge() {
		Calendar c1 = Calendar.getInstance();
	    Calendar c2 = Calendar.getInstance();

	    c1.setTime(DEFAULT_DOB);
	    c2.setTime(dob);
	    
	    if (c1.before(c2)) {
	        age = countDiffDay(c1, c2);
	    } 
	    else {
	        age = countDiffDay(c2, c1);
	    }
	    age = (int) (((double)age)/365.24);
		return age;
	}
	
	public static int countDiffDay(Calendar c1, Calendar c2) {
	    int returnInt = 0;
	    while (!c1.after(c2)) {
	      c1.add(Calendar.DAY_OF_MONTH, 1);
	      returnInt++;
	    }

	    if (returnInt > 0) {
	      returnInt = returnInt - 1;
	    }

	    return (returnInt);
	  }
	
	
	public Date getBirthday() {
		return dob;
	}
	
	public void setBirthday(String newDob) {		
		dob = createDate(newDob);
	}
	
	public void setStreet(String newStreet) {
		address[0] = newStreet;
	}
	
	public String getStreet() {
		return address[0];
	}
	
	public void setCity(String newCity) {
		address[1] = newCity;
	}
	
	public void setState(String newState) {
		address[2] = newState;
	}
	
	public void setZip(String newZip) {
		address[3] = newZip;
	}
	
	public String getCityStateZip() {
		address[4] = address[1];
		address[4] = address[4].concat(", ");
		address[4] = address[4].concat(address[2]);
		address[4] = address[4].concat(" ");
		address[4] = address[4].concat(address[3]);
		return address[4];
	}
	
	
	public void dump(StringBuffer inBuff){
		
		DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String sDob = sdf.format(dob);
		
		inBuff.append("Name: ");
		
		getFirstName();
		getLastName();
		getAge();
		getStreet();
		getCityStateZip();
		
		inBuff.append(lastName);
		inBuff.append(", ");
		inBuff.append(firstName);
		inBuff.append(System.getProperty("line.separator"));
		inBuff.append(" ...age: ");
		inBuff.append(age);
		inBuff.append(", dob: ");
		inBuff.append(sDob);
		inBuff.append(System.getProperty("line.separator"));
		inBuff.append(" ...address: ");
		inBuff.append(address[0]);
		inBuff.append(System.getProperty("line.separator"));
		inBuff.append("             ");
		inBuff.append(address[4]);
		inBuff.append(System.getProperty("line.separator"));
		
	}


}
