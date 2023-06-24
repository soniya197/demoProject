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
@Table(name = "OWNER_DATA")
public class OwnerData {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQUENCE2")
	@SequenceGenerator(name= "SEQUENCE2", sequenceName = "Owner_Data_SEQ" , allocationSize = 1)//this is sequence name giving error because its not created in the DB
	//lets see how to create it
	private Long id;
	@Column(name = "First_name")//this is your column name
	private String firstName;
	@Column(name = "Second_name")
	private String secondName;
	@Column(name = "Mobile_number")
	private String mobileN;
}
