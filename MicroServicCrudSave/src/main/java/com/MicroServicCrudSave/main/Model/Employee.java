package com.MicroServicCrudSave.main.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String eName;
	private String eAddress;
	private float eSalary;
	private int ecount;
}
