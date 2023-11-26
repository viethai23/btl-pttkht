package com.example.shoppingonline.Model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "payment_by_cash")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "payment_id")
public class PaymentByCash extends Payment {

	@Column(name = "payment_address")
	private String paymentAddress;
}