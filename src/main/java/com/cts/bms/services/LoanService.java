package com.cts.bms.services;

import com.cts.bms.entity.Loan;

import reactor.core.publisher.Mono;

public interface LoanService {
	public Mono<Loan> applyLoan(Loan loan);
}
