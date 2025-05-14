package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee extends User{
	
	private String jobPosition;
	
	@ManyToMany
    @JoinTable(
        name = "employee_canteen",
        joinColumns = @JoinColumn(name = "employee_id"),
        inverseJoinColumns = @JoinColumn(name = "canteen_id")
    )
    private List<Canteen> canteens ;

}