package uni.pu.fmi.models;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
public abstract class Answer {

	private int id;
	private int question_id;
	private String answer;
	private byte[] Image;
	
	public Answer(int id,int question_id, String answer, byte[] image) {
		this.id = id;
		this.question_id=question_id;
		this.answer = answer;
		Image = image;
	}
	
}
