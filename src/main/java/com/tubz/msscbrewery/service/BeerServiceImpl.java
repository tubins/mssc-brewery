package com.tubz.msscbrewery.service;

import com.tubz.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Impl class of @{@link BeerService}.
 */
@Service
public class BeerServiceImpl implements BeerService {
    /**
     * Get beer by id.
     *
     * @param beerId beer id.
     * @return beer with matching id.
     */
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto
                .builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
