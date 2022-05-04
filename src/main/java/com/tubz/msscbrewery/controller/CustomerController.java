package com.tubz.msscbrewery.controller;

import com.tubz.msscbrewery.service.CustomerService;
import com.tubz.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    /**
     * API to create customer details.
     *
     * @param customerDto customer info to save.
     * @return location to the saved customer.
     */
    @PostMapping
    public ResponseEntity handlePost(@RequestBody final CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.saveNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        // TODO: Add hostname to URL
        headers.add("Location", "/api/v1/customer/" + savedCustomer.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    /**
     * API to update customer details.
     *
     * @param customerDto customer info to update.
     */
    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handlePut(@PathVariable final UUID customerId, @RequestBody final CustomerDto customerDto) {
        customerService.updateCustomer(customerId, customerDto);
    }

    /**
     * API to delete a customer info.
     *
     * @param customerId customer id to delete.
     */
    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable UUID customerId) {
        customerService.deleteCustomer(customerId);
    }
}
