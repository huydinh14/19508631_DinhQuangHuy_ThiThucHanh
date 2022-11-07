package com.example.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @Column(name = "customer_id")
    private int CustomerId;

    @Column(name = "name")
    private String Name;

    @Column(name = "diachi")
    private String Address;

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerId=" + CustomerId +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
