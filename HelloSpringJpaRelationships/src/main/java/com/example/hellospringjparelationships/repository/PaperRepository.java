package com.example.hellospringjparelationships.repository;

import com.example.hellospringjparelationships.model.Paper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperRepository extends JpaRepository<Paper, Long> {
}
