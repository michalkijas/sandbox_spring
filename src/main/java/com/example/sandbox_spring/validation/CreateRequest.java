package com.example.sandbox_spring.validation;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
class CreateRequest {

	@NotNull
	private String name;

	@NotNull
	private String description;

	@NotNull
	@NotBlank
	private String content;
}
