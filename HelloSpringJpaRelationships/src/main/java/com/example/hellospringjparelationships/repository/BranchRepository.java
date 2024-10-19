package com.example.hellospringjparelationships.repository;

import com.example.hellospringjparelationships.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}
