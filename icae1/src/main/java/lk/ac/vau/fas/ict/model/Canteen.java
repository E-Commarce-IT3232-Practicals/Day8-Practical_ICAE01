package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Canteen {
	@Id
	private String id;
	private String location;
	
	@OneToMany(mappedBy="canteen")
	private List<DailyMenu> dailyMenus;
	
	
	@ManyToMany(mappedBy="canteens")
	private List<Employee>employees;
	
}