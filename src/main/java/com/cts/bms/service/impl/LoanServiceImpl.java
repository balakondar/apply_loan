package com.cts.bms.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bms.entity.Loan;
import com.cts.bms.repo.LoanRepository;
import com.cts.bms.services.LoanService;

import reactor.core.publisher.Mono;


@Service
public class LoanServiceImpl implements LoanService{
	
	@Autowired
	LoanRepository loanRepository;
	
	@Override
	public Mono<Loan> applyLoan(Loan loan) {
		return loanRepository.save(loan);
	}


}
