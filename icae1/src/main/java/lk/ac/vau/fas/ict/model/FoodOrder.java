package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class FoodOrder {
	@Id
	private String id;
	private String datePlaced;
	
	@ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private DailyMenu dailyMenu;

    @OneToMany(mappedBy = "foodOrder")
    private List<OrderLine> orderLines ;
	
}