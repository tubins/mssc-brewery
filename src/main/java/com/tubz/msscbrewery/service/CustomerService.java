package com.tubz.msscbrewery.service;

import com.tubz.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Customer service
 */
public interface CustomerService {
    /**
     * Get customer details by id.
     *
     * @param customerId customer id.
     * @return customer details with matching id.
     */
    CustomerDto getCustomerById(UUID customerId);
}
