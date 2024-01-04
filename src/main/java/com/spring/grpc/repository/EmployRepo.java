package com.spring.grpc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.grpc.dto.Employ;

public interface EmployRepo extends JpaRepository<Employ,Integer>
{

}
