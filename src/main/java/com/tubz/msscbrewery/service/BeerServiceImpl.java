package com.tubz.msscbrewery.service;

import com.tubz.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Impl class of @{@link BeerService}.
 */
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    /**
     * Get beer by id.
     *
     * @param beerId beer id.
     * @return beer with matching id.
     */
    @Override
    public BeerDto getBeerById(final UUID beerId) {
        return BeerDto
                .builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    /**
     * Save new beer.
     *
     * @param beerDto beer info.
     * @return saved beer info.
     */
    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto
                .builder()
                .id(UUID.randomUUID())
                .build();
    }

    /**
     * Update a beer info.
     *
     * @param beerId  beer id.
     * @param beerDto beer info to update.
     * @return updated beer info.
     */
    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // TODO: Add real impl later.
        log.debug("updating beer info if id: {} with the new details : {}", beerId, beerDto);
    }

    /**
     * Delete beer info.
     *
     * @param beerId beer id.
     */
    @Override
    public void deleteBeer(UUID beerId) {
        // TODO: Add real impl later.
        log.debug("deleting beer info with id: {}", beerId);
    }

}
