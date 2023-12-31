package com.ecommerce.backendone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.backendone.entity.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE section_sequence SET next_val = 1", nativeQuery = true)
    void resetSequence();
    
}
