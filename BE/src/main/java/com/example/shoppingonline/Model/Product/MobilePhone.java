package com.example.shoppingonline.Model.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "mobile_phone")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "product_id")
public class MobilePhone extends Product {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "brand_id")
	private Brand brand;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	@Column(name = "screen_size")
	private double screenSize;

	@Column(name = "storage_capacity")
	private double storageCapacity;
}