package com.lms.project.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AddressRequestDTO {

	@NotBlank(message = "Address Line 1 is required")
	@Size(max = 255, message = "Address Line 1 cannot exceed 255 characters")
	private String addressLine1;

	@Size(max = 255, message = "Address Line 2 cannot exceed 255 characters")
	private String addressLine2;

	@Size(max = 150, message = "Landmark cannot exceed 150 characters")
	private String landmark;

	@NotBlank(message = "City is required")
	@Size(max = 100)
	private String city;

	@Size(max = 100)
	private String district;

	@NotBlank(message = "State is required")
	@Size(max = 100)
	private String state;

	@NotBlank(message = "Country is required")
	@Size(max = 100)
	private String country;

	@NotBlank(message = "Pin code is required")
	@Pattern(regexp = "^[0-9]{6}$", message = "Please provide a valid 6-digit PIN code")
	private String pinCode;
}