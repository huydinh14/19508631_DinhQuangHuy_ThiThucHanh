package com.example.driverservice.controller;

import com.example.driverservice.service.DriverService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverService driverService;
    @GetMapping("/findDriverAndCustomer")
    @Cacheable(value = "driver_customer", key = "#id")
    @RateLimiter(name = "SERVICE_A")
    public ResponseEntity findDriverAndCustomer(@RequestParam("id") int id){
        return new ResponseEntity(driverService.findDriverAndCustomer(id), HttpStatus.OK);
    }
}
