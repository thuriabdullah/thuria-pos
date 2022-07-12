package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Product")
 public class ProductEntity {
 @Id
 @Column(name="productId")
 @GeneratedValue(strategy =GenerationType.IDENTITY)
 private Integer productId;
 @Column(name="productPrice")

 private Double productPrice;
 @Column(name="productName")

 private String productName;


}
