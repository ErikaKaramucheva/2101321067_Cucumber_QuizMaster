package uni.pu.fmi.models;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
	private int id;
	private int test_id;
	private String name; //quiz 
	private byte[] image;
	private double points;
	private boolean isOptional;
	private int question_number;

}
