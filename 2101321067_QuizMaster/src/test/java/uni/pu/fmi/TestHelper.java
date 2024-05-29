package uni.pu.fmi;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import services.TestService;
import uni.pu.fmi.db.MainRepo;
import uni.pu.fmi.models.Answer;
import uni.pu.fmi.models.Close;
import uni.pu.fmi.models.Open;
import uni.pu.fmi.models.Question;
import uni.pu.fmi.models.Test;
import uni.pu.fmi.models.Class;

@Getter
@Setter

public class TestHelper {
	private TestService service=new TestService();
	private int user_id;
	private String testName;
	private String _class;
	private String subject;
	private int result;
	List<Test> tests=new ArrayList<>();
	List<Question> questions=new ArrayList<>();
	List<Answer> answers=new ArrayList<>();
	Class cl=new Class();
	String regex = ".*[;_@$%€].*";
	
	public void setClass(String string) {
		this._class=string;
	}
	
public void setSubject(String string) {
		this.subject=string;
	}

public boolean checkStringLength(String string) {
	if(string.length()>=20) {
		return false;
	}else {
		return true;
	}
}
public boolean checkInvalidSymbol(String string) {
	if(string.matches(regex)) {
		return false;
	}else {
		return true;
	}
		
}

public void createClass(String name) {
	cl.setId(3);
	cl.setName(name);
}

public void addClass() {
	service.addClass(cl);
}

public void visualizeTests() {
	if(tests==null) {
		tests = new ArrayList<>();
		tests.addAll(MainRepo.getPublicTests());
	}
	for(Test t : tests) {
		System.out.println(t.getName());
	}
}
String actualMessage="";
public void showMessage() {
	if(cl.getName().length()>20) {
		actualMessage.concat(" Името на класа трябва да е с дължина под 20 символа!");
	} 
	if(cl.getName().matches(regex)) {
		actualMessage.concat("Името на класа не може да съдържа символите ';_@$%€'!");
	}
	if(cl.getName().equals("")) {
		actualMessage.concat("Изглежда, че не сте добавили необходимата информация. Моля, опитайте отново!");
	}
	if(actualMessage.equals("")) {
		actualMessage="Записът беше добавен успешно!";
	}
	System.out.println(actualMessage);
	
}

/*
	//public void addTest(Test t3) {
		public void addTest() {
		if(tests.size()!=0) {
		Test lastTest=tests.get(tests.size());
		service.addTest(lastTest);
		}else {
			System.out.println("There is no test to add.");
		}
		//List<Question> qFromLastT=
		//logic for adding questions in db
		//logic for adding answers to db
		
	}
	
	
	public void addQuestion(Answer ans1) {
		answers.add(ans1);
		
	}

	
	public void addCondition(Question q1) {
		questions.add(q1);
	}
	
	public void addAnswer(Answer a1) {
		service.addAnswer(a1);
		
	}
	public Answer getAns(int id) {
		return service.getAnswer(id);
	}*/

	
}
