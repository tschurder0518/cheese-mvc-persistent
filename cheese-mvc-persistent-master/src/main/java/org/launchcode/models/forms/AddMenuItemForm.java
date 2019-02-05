package org.launchcode.models.forms;

import javax.validation.constraints.NotNull;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

public class AddMenuItemForm {
	
	@NotNull
	private int menuId;
	
	@NotNull
	private int cheeseId;
	
	private Menu menu;
	
	private Iterable<Cheese> cheeses;
	
	public AddMenuItemForm() {}
	
	public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu) {
		this.cheeses = cheeses;
		this.menu = menu;
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public int getMenuId() {
		return menuId;
	}
	
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	
	public int getCheeseId() {
		return cheeseId;
	}
	
	public void setCheeseId(int cheeseId) {
		this.cheeseId = cheeseId;
	}
	
	public Iterable<Cheese> getCheeses() {
		return cheeses;
	}
}
