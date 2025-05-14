package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Student extends User {
	private String academicDegree;
	
	@OneToMany(mappedBy="student")
	private List<FoodOrder> foodOrder;
}