package services;

import java.util.List;

import uni.pu.fmi.db.MainRepo;
import uni.pu.fmi.models.Answer;
import uni.pu.fmi.models.Test;

public class TestService {
	public List<Test> loadAllPublicTests(){
		return MainRepo.getPublicTests();
	}
	
	public List<Test> loadPublicAndSharedTestsForUser(int user_id){
		return MainRepo.getPublicAndSharedTests(user_id);
	}

	public List<Test> getTestsByClass(int i) {
		return MainRepo.getTestsByClass(i);
		
	}

	public List<Test> getTestsBySubject(String string) {
		// TODO Auto-generated method stub
		return MainRepo.getTestBySubject(string);
	}

	public List<Test> getTestsByName(String testName) {
		return MainRepo.getTestsByName(testName);
		
	}

	public void addTest(Test lastTest) {
		MainRepo.addTest(lastTest);
		
	}

	public void addAnswer(Answer a1) {
		MainRepo.addAnswer(a1);
		
	}
	
	public Answer getAnswer(int id) {
		return MainRepo.getAnswerById(id);
		
	}
	
	public void addClass(uni.pu.fmi.models.Class c) {
		MainRepo.addClass(c);
	}
	
	


}
