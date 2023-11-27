package com.bnt.assignment.arithmatic.operation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bnt.assignment.arithmatic.operation.entity.RequestResponseEntity;

@Repository()
public interface CalculatorDao extends JpaRepository<RequestResponseEntity, Long> {

}
