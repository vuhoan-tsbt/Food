package com.example.food.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Entity
@Table(name="user_role")
@Accessors(chain = true)
public class UserRole {
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="role")
	private String role;

}
