package com.estudando.course.entites;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class User implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Long id;
	@EqualsAndHashCode.Exclude private String name;
	@EqualsAndHashCode.Exclude private String email;
	@EqualsAndHashCode.Exclude private String phone;
	@EqualsAndHashCode.Exclude private String password;
		

}
