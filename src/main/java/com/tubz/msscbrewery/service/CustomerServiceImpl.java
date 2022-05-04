package com.tubz.msscbrewery.service;

import com.tubz.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Impl class @{@link CustomerService}.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    /**
     * Get customer details by id.
     *
     * @param customerId customer id.
     * @return customer details with matching id.
     */
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.
                builder()
                .id(customerId)
                .customerName("John Doe")
                .build();
    }

    /**
     * Save new customer details.
     *
     * @param customerDto new customer details to save.
     * @return saved customer details.
     */
    @Override
    public CustomerDto saveNewCustomer(final CustomerDto customerDto) {
        return customerDto
                .builder()
                .id(UUID.randomUUID())
                .build();
    }

    /**
     * Update customer details.
     *
     * @param customerId  customer id to update.
     * @param customerDto customer details to update.
     */
    @Override
    public void updateCustomer(final UUID customerId, final CustomerDto customerDto) {
        // TODO: Real impl will add later.
    }

    /**
     * Delete customer details.
     *
     * @param customerId  customer id to update.
     */
    @Override
    public void deleteCustomer(final UUID customerId) {
        // TODO: Real impl will add later.
    }
}
