package com.example.shoppingonline.Model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "payment_by_card")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "payment_id")
public class PaymentByCard extends Payment {

	@Column(name = "bank")
	private String bank;
}