
public class Student extends Person {
	
	private int[] testScore = new int[5];
	private float aveScore = 0f;
	private int scoreCount = 0;
	private int i = 0;
	
	public Student(String firstAndLastName) {
		super(firstAndLastName);
		setID();
	}
	
	public Student(String firstAndLastName, int dobYear, int dobMonth, int dobDay) {
		super(firstAndLastName, dobYear, dobMonth, dobDay);
		setID();
	}
	
	public void setID() {
		i = 0;
		scoreCount = 0;
	}
	
	
	public void addTestScore(int inScore) {
		testScore[i] = inScore;
		i = i + 1;
		scoreCount = i;
	}
	
	public void setAverage() {
		
		i = 0;
		
		if(scoreCount > 0) {
			do {
				aveScore = aveScore + testScore[i];
				i++;
			} while (i< scoreCount);
			
			aveScore = aveScore/(float)scoreCount;
		}
		else {
			aveScore = 0f;
		}
		
	}
	
	
	public void dump(StringBuffer inBuff){
		
		super.dump(inBuff);
		
		i=0;
		
		inBuff.append("..." + scoreCount + " tests, scores:");
		inBuff.append(System.getProperty("line.separator"));
		
		if(scoreCount > 0){
			do {
				inBuff.append("......test[" + i + "]: " + testScore[i]);
				inBuff.append(System.getProperty("line.separator"));	
				i++;
			} while (i< scoreCount);
		}
		
		setAverage();
		
		inBuff.append("...test average: " + aveScore);
		inBuff.append(System.getProperty("line.separator"));
		inBuff.append(System.getProperty("line.separator"));
		
	}

}
