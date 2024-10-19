package com.example.hellospringjparelationships.repository;

import com.example.hellospringjparelationships.model.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, UUID> {
}
