package com.lms.project.dto.response;

import lombok.Data;

@Data
public class AddressResponse {

    private Long id;

    private String addressLine1;

    private String addressLine2;

    private String landmark;

    private String city;

    private String district;

    private String state;

    private String country;

    private String pinCode;

}