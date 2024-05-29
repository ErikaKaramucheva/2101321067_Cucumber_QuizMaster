package uni.pu.fmi;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateClassSteps {
	private final TestHelper helper;
	
	public CreateClassSteps(TestHelper help) {
		this.helper=help;
	}
	
	@When("потребителят натиска бутона Добави")
	public void addButton() {
		helper.addClass();
	}
	@When("потребителят въвежда в полето {string}")
	public void fillCorrect(String string) {
	    helper.createClass(string);
	}
	
	@Then("системата извежда съобщение {string}")
	public void messageForAddingClass(String string) {
		helper.showMessage();
	    //"Изглежда, че не сте добавили необходимата информация!"
	}
	
	 @DataTableType(replaceWithEmptyString = "[blank]")
	    public String stringType(String cell) {
	        return cell;
	    }





}
