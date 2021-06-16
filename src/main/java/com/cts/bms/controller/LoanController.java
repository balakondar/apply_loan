package com.cts.bms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.cts.bms.entity.Loan;
import com.cts.bms.services.LoanService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/BMS")
@CrossOrigin("http://localhost:9091")
public class LoanController {

	@Autowired
	LoanService loanService;

	@Autowired
	WebClient.Builder webClientBuilder;

	@PostMapping("/ApplyLoan")
	public Mono<Object> applyLoan(@RequestBody Loan loan) {

		WebClient client = webClientBuilder.baseUrl("http://localhost:9091").build();		
		Optional<Boolean> iscustomerexist = client.get().uri("/Customer/" + loan.getCustomerId()).retrieve()
				.bodyToMono(Boolean.class).blockOptional();

		return loanService.applyLoan(loan).map(ln -> ResponseEntity.ok(ln.getLoanId()));

	}
}
