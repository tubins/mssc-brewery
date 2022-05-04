package com.tubz.msscbrewery.controller;

import com.tubz.msscbrewery.service.CustomerService;
import com.tubz.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Customer controller.
 */

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    /**
     * Constructor.
     *
     * @param customerService customer service.
     */
    public CustomerController(final CustomerService customerService) {
        this.customerService = customerService;
    }


    /**
     * API to get customer details by id.
     *
     * @param customerId customer id.
     * @return customer details.
     */
    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getBeer(@PathVariable final UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }
}
