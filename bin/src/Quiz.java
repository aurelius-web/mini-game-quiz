public class Quiz {
		
public static void main(String[] args) {


MultipleChoiceQuestion question = new MultipleChoiceQuestion ("What's the value of Pi?","3.28","2.21","3.14","9.99","Over 9000","c");
question.check();

MultipleChoiceQuestion question2 = new MultipleChoiceQuestion ("What's the distance between earth and Moon?","288.200 km","384.400 km","697.800 km","350.400 km","100.580 km","b");
question2.check();

MultipleChoiceQuestion question3 = new MultipleChoiceQuestion ("What's the biggest animal in the world?","Colossal Squid","Giraffe","Brown Bear","Whale Shark","Blue Whale","e");
question3.check();

MultipleChoiceQuestion question4 = new MultipleChoiceQuestion ("Who painted the Mona Lisa?","Leonardo da Vinci ","Michelangelo","Pablo Picasso","Vincent Van Gogh","Rembrandt","a");
question4.check();

MultipleChoiceQuestion question5 = new MultipleChoiceQuestion ("Where was the fortune cookie invented?","Beijing ","Shenzhen","San Francisco","Monaco","Tokyo","c");
question5.check();

Question question6 = new TrueFalseQuestion("A lion's roar can be heard up to eight kilometres away","TRUE");
question6.check();

Question question7 = new TrueFalseQuestion("Monaco is the smallest country in the world","FALSE");
question7.check();

Question question8 = new TrueFalseQuestion("There are five different blood groups","FALSE");
question8.check();

Question question9 = new TrueFalseQuestion("Coffee is made from berries","TRUE");
question9.check();

Question question10 = new TrueFalseQuestion("K is worth four points in Scrabble","FALSE");
question10.check();


Question.showResults();

}
}