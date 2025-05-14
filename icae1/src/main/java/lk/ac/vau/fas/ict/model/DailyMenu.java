package lk.ac.vau.fas.ict.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class DailyMenu {
	@Id
	private String id;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="canteen_id")
	private Canteen canteen;
	
	@ManyToMany
    @JoinTable(
        name = "menu_food_item",
        joinColumns = @JoinColumn(name = "menu_id"),
        inverseJoinColumns = @JoinColumn(name = "food_item_id")
    )
	
    private List<FoodItem> foodItems ;
	
}