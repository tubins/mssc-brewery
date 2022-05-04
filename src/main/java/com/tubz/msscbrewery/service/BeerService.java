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
}
