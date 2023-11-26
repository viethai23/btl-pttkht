package com.example.shoppingonline.Model.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "clothe")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "product_id")
public class Clothe extends Product {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "producer_id")
	private Producer producer;

	@Column(name = "name")
	private String name;

	@Column(name = "color")
	private String color;

	@Column(name = "size")
	private String size;

	@Column(name = "material")
	private String material;

	@Column(name = "gender")
	private String gender;
}