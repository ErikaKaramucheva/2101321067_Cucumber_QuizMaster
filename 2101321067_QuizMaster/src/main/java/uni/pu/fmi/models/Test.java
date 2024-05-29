package uni.pu.fmi.models;
import java.time.LocalDate;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Test {
	private int id;
	private String name;
	private String description;
	private int user_id;
	private int class_id;
	private int subject_id;
	private String unique_code;
	private boolean isPrivate;
	private LocalDate creation_date;

}
