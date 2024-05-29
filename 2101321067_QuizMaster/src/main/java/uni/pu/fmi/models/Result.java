package uni.pu.fmi.models;
import java.time.LocalDate;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Result {
	private int test_id;
	private int user_id;
	private double result;
	private double percent;
	private LocalDate date;

}
