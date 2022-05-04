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
}
