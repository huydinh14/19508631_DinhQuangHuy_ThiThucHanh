package com.example.driverservice.vo;

import com.example.driverservice.model.Driver;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ResponseTemplate {
    private Driver driver;
    private Customer customer;
}
