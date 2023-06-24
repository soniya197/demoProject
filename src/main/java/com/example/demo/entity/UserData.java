package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User_Data")//this is your table name 
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name= "SEQUENCE1", sequenceName = "User_Data_SEQ" , allocationSize = 1)//this is sequence name giving error because its not created in the DB
	//lets see how to create it
	private Long id;
	@Column(name = "First_name")//this is your column name
	private String firstName;
	@Column(name = "Second_name")
	private String secondName;
	@Column(name = "Email_id")
	private String email;
	
}
