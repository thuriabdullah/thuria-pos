package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Order")


public class OrderEntity {
    @Id
    @Column(name="orderId")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private  Integer orderId;
    @Column(name="total ")

    private  double total ;

}
