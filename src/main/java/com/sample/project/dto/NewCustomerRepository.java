package com.sample.project.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.project.entity.NewCustomer;

@Repository
public interface NewCustomerRepository extends JpaRepository<NewCustomer, String> {

}
