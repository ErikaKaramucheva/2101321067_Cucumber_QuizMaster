package uni.pu.fmi.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private boolean isAdmin;
	
	

}
