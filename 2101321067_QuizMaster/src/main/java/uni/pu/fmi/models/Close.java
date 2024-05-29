package uni.pu.fmi.models;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Close extends Answer{
	//private int answer_id=this.getAnswer_id();
	//private String answer_one=this.getAnswer();
	//private byte[] Image_one=this.getImage();
	private String answer_two;
	private byte[] image_two;
	private String answer_three;
	private byte[] image_three;
	private String answer_four;
	private byte[] image_four;
	private int correct_answer;
	
	public Close(int id, int question_id, String answer, byte[] image, String answer_two,
			byte[] image_two, String answer_three, byte[] image_three, 
			String answer_four, byte[] image_four, int correct_answer) {
		super(id,question_id, answer, image);
		this.answer_two=answer_two;
		this.answer_three=answer_three;
		this.answer_four=answer_four;
		this.image_two=image_two;
		this.image_three=image_three;
		this.image_four=image_four;
	}
	
	
}
