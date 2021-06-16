package com.cts.bms.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cts.bms.entity.Loan;

public interface LoanRepository extends ReactiveCrudRepository<Loan, Integer>{
	
}
