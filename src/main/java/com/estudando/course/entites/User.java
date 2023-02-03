package com.estudando.course.entites;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity //para o jpa converter o BD para o modelo relacional
@Table(name = "tb_user")
public class User implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//isso e usado para alto encremento
	private Long id;
	@EqualsAndHashCode.Exclude private String name;
	@EqualsAndHashCode.Exclude private String email;
	@EqualsAndHashCode.Exclude private String phone;
	@EqualsAndHashCode.Exclude private String password;
		

}
