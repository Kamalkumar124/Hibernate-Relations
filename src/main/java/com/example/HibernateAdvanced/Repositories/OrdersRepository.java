package com.example.HibernateAdvanced.Repositories;

import com.example.HibernateAdvanced.Modal.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
