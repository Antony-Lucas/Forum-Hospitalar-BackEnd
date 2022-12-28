package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Management;

@Repository
public interface ManagementRepositories extends JpaRepository<Management, Long>{

}
