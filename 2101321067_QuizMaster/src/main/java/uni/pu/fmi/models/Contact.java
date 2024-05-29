package uni.pu.fmi.models;

import java.time.LocalDate;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Contact {

	private int id;
	private int user_id;
	private String description;
	private LocalDate date;
}
