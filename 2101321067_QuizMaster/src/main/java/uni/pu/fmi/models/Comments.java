package uni.pu.fmi.models;

import java.time.LocalDate;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
public class Comments {
	private int user_id;
	private int test_id;
	private String description;
	private LocalDate date;

}
