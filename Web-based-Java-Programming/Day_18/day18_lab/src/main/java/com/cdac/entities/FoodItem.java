package com.cdac.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="food_items",
uniqueConstraints = @UniqueConstraint (columnNames = {
		"item_name","restaurant_id"})) //composite unique constraint
@NoArgsConstructor

/*
 * Exclude association fields from toString - to avoid recursion , in a bi dir asso
 */
@ToString(callSuper = true,exclude ="myRestaurant")
@Getter
@Setter

public class FoodItem extends BaseEntity {
	@Column(name="item_name")
	private String itemName;
	@Column(name="item_description",length = 100)
	private String itemDescription;
	@Column(name="is_veg")
	private boolean isVeg;
	private int price;
	//FoodItem * ----> 1 Restaurant
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="restaurant_id")
	private Restaurant myRestaurant;
	public FoodItem(String itemName, String itemDescription, boolean isVeg, int price) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.isVeg = isVeg;
		this.price = price;
	}
	

}
