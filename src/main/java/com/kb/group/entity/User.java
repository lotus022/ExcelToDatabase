package com.kb.group.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "userdata")
@Data
public class User {
	@Id
	@GeneratedValue
	@Column(name = "uid")
	private Long userId;
	private String name;
	private double amount;
	private String number;

}
