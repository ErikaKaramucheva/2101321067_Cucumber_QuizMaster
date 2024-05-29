package uni.pu.fmi.db;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import uni.pu.fmi.models.*;
import uni.pu.fmi.models.Class;

public class MainRepo {
	private static List<User> users=new ArrayList<User>();
	private static List<Subject> subjects=new ArrayList<Subject>();
	private static List<Class> classes=new ArrayList<Class>();
	private static List<Test> tests=new ArrayList<Test>();
	private static List<Shared> shared=new ArrayList<Shared>();
	private static List<Result> results= new ArrayList<Result>();
	private static List<Question> questions=new ArrayList<Question>();
	private static List<Contact> contacts=new ArrayList<Contact>();
	private static List<Comments> comments=new ArrayList<Comments>();
	private static List<Answer> answers=new ArrayList<Answer>();
	
	static {
		User user1=new User(1,"Иван","ivan@abv.bg","ivan1234",false);
		User user2=new User(2,"Мария","mp@gmial.com","petrovaa!4",false);
	    Subject subject1=new Subject(1,"Математика");
	    Subject subject2=new Subject(2,"Български език");
	    Class class1= new Class(1,"8 клас");
	    Class class2= new Class(2,"5 клас");
	    Close closeAns1=new Close(1,1,"спрях",null,"видяли",null,"желязна",null,"видение", null, 2);
	    Close closeAns2=new Close(2,1,"властник",null,"беззаконие",null,"наддаване",null,"предверие", null, 4);
	    Test test1=new Test(1, "Правописна норма","",1,1,2,"st34p56",false, LocalDate.now());
	    Question q1= new Question(1, 1, "В кой ред е допусната правописна грешка?", null, 1, false, 1);
	    Question q2= new Question(2, 1, "В кой ред е допусната правописна грешка?", null, 1, false, 2);
	    Shared s1=new Shared(2,1,LocalDate.now());
	users.add(user2);
	users.add(user1);
	subjects.add(subject2);
	subjects.add(subject1);
	classes.add(class2);
	classes.add(class1);
	answers.add(closeAns2);
	answers.add(closeAns1);
	tests.add(test1);
	questions.add(q2);
	shared.add(s1);
	questions.add(q1);
	}
	public static List<Test> getPublicTests(){
		return tests.stream().filter(test-> test.isPrivate()==false).toList();
	}
	public List<Question> getQuestionsForTest(int test_id){
		return questions.stream().filter(question-> question.getTest_id()==test_id).toList();
	}
	public static void addTest(Test test) {
		tests.add(test);
	}
	public static List<Test> getPublicAndSharedTests(int user_id){
		List<Test> sharedWithUser=new ArrayList<>();
		if(shared!=null) {
		for(int i=0;i<shared.size();i++) {
			int temp= shared.get(i).getTest_id();
		   if(shared.get(i).getUser_id()==user_id) {
			   sharedWithUser.addAll(tests.stream().filter(test-> test.getId()==temp).toList());
		   }
			
		}
		}
		sharedWithUser.addAll(getPublicTests());
		return sharedWithUser;
	}
	public static List<Test> getTestsByClass(int i) {		
		return tests.stream().filter(test-> test.getClass_id()==i).toList();
	}

	static int id=0;
	public static List<Test> getTestBySubject(String string) {
		
		for(int i=0;i<subjects.size();i++) {
			if(subjects.get(i).getName().equals(string)) {
				id=i;
			}
		}
		return getPublicTests().stream().filter(t->t.getSubject_id()==id).toList();
	}
	public static List<Test> getTestsByName(String testName) {
		return getPublicTests().stream().filter(t->t.getName().contains(testName)).toList();
	}
	public static void addAnswer(Answer a1) {
		answers.add(a1);
		
	}
	public static Answer getAnswerById(int id) {
		Answer answer;
		answer=answers.get(id);
		return answer;
	

}
	public static void addClass(Class c) {
		classes.add(c);
	}
}
