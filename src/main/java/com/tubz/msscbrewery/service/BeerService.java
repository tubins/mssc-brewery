package com.tubz.msscbrewery.service;

import com.tubz.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    /**
     * Get beer by id.
     *
     * @param beerId beer id.
     * @return beer with matching id.
     */
    BeerDto getBeerById(UUID beerId);

    /**
     * Save new beer.
     *
     * @param beerDto beer info.
     * @return saved beer info.
     */
    BeerDto saveNewBeer(BeerDto beerDto);

    /**
     * Update a beer info.
     *
     * @param beerId  beer id.
     * @param beerDto beer info to update.
     * @return updated beer info.
     */
    void updateBeer(UUID beerId, BeerDto beerDto);

    /**
     * Delete beer info.
     * @param beerId beer id.
     */
    void deleteBeer(UUID beerId);
}
