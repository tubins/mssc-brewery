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

    /**
     * Save new customer details.
     *
     * @param customerDto new customer details to save.
     * @return saved customer details.
     */
    CustomerDto saveNewCustomer(CustomerDto customerDto);

    /**
     * Update customer details.
     *
     * @param customerId  customer id to update.
     * @param customerDto customer details to update.
     */
    void updateCustomer(UUID customerId, CustomerDto customerDto);

    /**
     * Delete customer details.
     *
     * @param customerId customer id to update.
     */
    void deleteCustomer(UUID customerId);
}
