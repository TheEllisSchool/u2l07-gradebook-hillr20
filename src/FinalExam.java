//December 6, 2017
//U2L07: Inheritance
public class FinalExam extends GradedActivity {
	//attributes
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	//methods
	//constructors = uppercase, public
	public FinalExam(int questions, int missed) {
		setNumQuestionsAndPoints(questions);
		setNumMissed(missed);
		
		double s = (numQuestions - numMissed) * pointsEach;
		setScore(s); //already written in GradedActivity
		
	}
	
	public void setNumQuestionsAndPoints(int q) {
		if (q > 0) {
			numQuestions = q;
			pointsEach = 100/q;
		}
		else {
			numQuestions = 50;
			pointsEach = 100/numQuestions;
			System.out.println("Num of Questions must be positive, default to 50 Questions.");
		}
		
	}
	
	public void setNumMissed(int m) {
		if (m >= 0 && m <= numQuestions) {
			numMissed = m;
		}
		else {
			numMissed = 0;
			System.out.println("Num Missed must be between 0 and num questions, default to no missed.");
		}
	}
	
	public double getPointsEach() {
		return pointsEach;
	}
	public double getNumMissed() {
		return numMissed;
	}
	public double getNumQuestions() {
		return numQuestions;
	}

}
