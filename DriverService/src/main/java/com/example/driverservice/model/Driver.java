package com.example.driverservice.model;

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
@Table(name = "driver")
public class Driver {
    @Id
    @Column(name = "driver_id")
    private int DriverId;

    @Column(name = "name")
    private String Name;

    @Column(name = "price")
    private String Price;

    @Column(name = "km")
    private String Km;

    @Column(name = "customer_id")
    private int CustomerId;

    @Override
    public String toString() {
        return "Driver{" +
                "DriverId=" + DriverId +
                ", Name='" + Name + '\'' +
                ", Price='" + Price + '\'' +
                ", Km='" + Km + '\'' +
                ", CustomerId=" + CustomerId +
                '}';
    }
}
