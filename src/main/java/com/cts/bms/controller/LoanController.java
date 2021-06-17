package com.cts.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.cts.bms.entity.Loan;
import com.cts.bms.services.LoanService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/Bms")
public class LoanController {

	@Autowired
	LoanService loanService;

	@Autowired
	WebClient webClient;

	@PostMapping("/ApplyLoan")
	public Mono<Object> applyLoan(@RequestBody Loan loan) {

		Mono<Boolean> flagCustId = webClient.get().uri("/Customer/", loan.getCustomerId()).retrieve()
				.bodyToMono(Boolean.class);

		return loanService.applyLoan(loan).map(ln -> ResponseEntity.ok(ln.getLoanId()));

		// }
	}
}
