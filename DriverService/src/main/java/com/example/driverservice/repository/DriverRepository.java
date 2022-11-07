package com.example.driverservice.repository;

import com.example.driverservice.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {
    @Query(nativeQuery = true, value = "select * from driver where customer_id = :customerId")
    public List<Driver> findByMayBayId(@Param("customerId") int customerId);
}
