package uni.pu.fmi;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.TestService;
import uni.pu.fmi.models.Test;

public class TestViewSteps {
	private final TestHelper helper;
	TestService service=new TestService();
	
	public TestViewSteps(TestHelper help) {
		this.helper=help;
	}

	@Given("отваряне на приложението")
	public void openApp() {
	    // not implemented
	}
	@Given("Потребителят е влезнал в системата")
	public void isLoggedIn() {
		helper.setUser_id(2);
	}

	@Given("поребителят е в началния екран на приложението")
	public void isInMainPage() {
	    // we are in Main Page
	}

	@When("потребителят отваря началния екран на приложението")
	public void openMainPage() {
	    // opening...
	}

	@Then("системата визуализира всички публични тестове, както и тези, които са споделени с потребителя")
	public void LoadAllPublicAndSharedTests() {
	    helper.setTests(service.loadPublicAndSharedTestsForUser(helper.getUser_id()));
	    helper.visualizeTests();
	}

	@Given("потребителят не е влезнал в системата")
	public void isNotLoggedIn() {
		//0- не регистриран !0- регистриран
	   helper.setUser_id(0);
	}

	@Then("системата визуализира всички публични тестове")
	public void visualizeAllPublicTests() {
	    helper.setTests(service.loadAllPublicTests());
	    helper.visualizeTests();
	}

	@When("потребителят избира {string} от менюто за класове")
	public void filterTestsByClasses(String string) {
	   this.helper.setClass(string);
	}

	@Then("системата визуализира всички тестове за {int} клас")
	public void visualizeAllTestsByClasses(Integer int1) {
		helper.setTests(service.getTestsByClass(int1));
		helper.visualizeTests();
	}

	@When("потребителят избира {string} от менюто за предмети")
	public void filterTestsBySubjects(String string) {
	    this.helper.setSubject(string);
	}

	@Then("системата визуализира всички тестове по {string}")
	public void visualizeAllTestsBySubject(String string) {
		helper.setTests(service.getTestsBySubject(string));
		helper.visualizeTests();
	}

	@When("потребителят въвежда име на теста {string} в полето за търсене")
	public void enterNameForSearch(String string) {
	    helper.setTestName(string);
	}

	@When("натиска бутона за търсене")
	public void searchButton() {
	  helper.visualizeTests();
	}

	@Then("визуализира списък с тестовете, отговарящи на търсенето")
	public void visualizeTestsFromSearch() {
		helper.setTests(service.getTestsByName(helper.getTestName()));
		helper.visualizeTests();
	}
	
	


}
