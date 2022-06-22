package com.example.HibernateAdvanced.Repositories;

import com.example.HibernateAdvanced.Modal.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
