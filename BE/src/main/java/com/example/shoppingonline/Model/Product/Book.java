package com.example.shoppingonline.Model.Product;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "product_id") // Sử dụng PrimaryKeyJoinColumn để ánh xạ khóa chính của lớp cha (Product)
public class Book extends Product {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "publisher_id")
	private Publisher publisher;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id")
	private Author author;

	@Column(name = "title")
	private String title;

	@Column(name = "genre")
	private String genre;

	@Column(name = "type")
	private String type;

	@Column(name = "year_of_publisher")
	private Date yearOfPublisher;
}