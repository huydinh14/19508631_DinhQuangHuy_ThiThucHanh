package com.example.driverservice.service;

import com.example.driverservice.model.Driver;
import com.example.driverservice.repository.DriverRepository;
import com.example.driverservice.vo.Customer;
import com.example.driverservice.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class DriverService {
    @Autowired
    DriverRepository driverRepository;
    private RestTemplate restTemplate;

    public DriverService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Transactional(readOnly = true)
    public ResponseTemplate findDriverAndCustomer(int driverId){
        Driver driver = driverRepository.findById(driverId).orElse(null);
        System.out.println(driver.toString());
        int customerId = driver.getCustomerId();
        Customer customer = restTemplate.getForObject(
                "http://localhost:10000/customer/findById?id="+customerId,
                Customer.class
        );
        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setDriver(driver);
        responseTemplate.setCustomer(customer);

        return responseTemplate;
    }
}
