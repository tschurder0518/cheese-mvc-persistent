package org.launchcode.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Menu {

	@NotNull
	@Size(min=3, max=15)
	private String name;
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToMany
	private List<Cheese> cheeses;
	
	public Menu() {}
	
	public Menu(String name) {
		this.name = name;
	}
	
	public void addItem(Cheese item) {
		cheeses.add(item);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public List<Cheese> getCheese() {
		return cheeses;
	}
	

}
