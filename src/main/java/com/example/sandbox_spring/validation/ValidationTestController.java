package com.example.sandbox_spring.validation;


import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("validation-test")
class ValidationTestController {

	@GetMapping
	String get() {
		return "result from validation test GET";
	}

	@PostMapping
	void create(@Valid @RequestBody CreateRequest request) {
	}

	@PostMapping("/bind")
	void create(@Valid @RequestBody CreateRequest request, BindingResult bindingResult) {
		log.debug("--------------------------");
		log.debug(request.getName());
		log.debug("++++++++++++++++++++++++++");
		log.debug(bindingResult.toString());
		log.debug("--------------------------");
	}
}
