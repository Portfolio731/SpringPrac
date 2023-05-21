package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customers")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Customer {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String firstName;
	@Column
	private String lastName;
}
