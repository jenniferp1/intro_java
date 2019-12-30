
public class Person {
	
	private String personName = " ";
	private String firstName = null;
	private String lastName = null;
	
	private int age = 21;
	
	public Person(String firstAndLastName)  {
		personName = firstAndLastName;
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
		return age;
	}
	
	public void setAge(int newAge) {		
			
		if (newAge < 1 || newAge > 100) {
			age = 21;
		}
		else {
			age = newAge;
		}
	}
	
	public String dump() {
		StringBuilder buff = new StringBuilder(28);
	    dump( buff );
	    return buff.toString();
	}
	
	public void dump(StringBuilder inBuff){
		inBuff.append("Name: ");
		
		getFirstName();
		getLastName();
		getAge();
		
		inBuff.append(lastName);
		inBuff.append(", ");
		inBuff.append(firstName);
		inBuff.append(System.getProperty("line.separator"));
		inBuff.append(" ...age: ");
		inBuff.append(age);
		inBuff.append(System.getProperty("line.separator"));
	}

}
