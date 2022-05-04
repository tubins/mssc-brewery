package com.tubz.msscbrewery.controller;

import com.tubz.msscbrewery.service.BeerService;
import com.tubz.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Beer controller.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    /**
     * Constructor.
     *
     * @param beerService beer service.
     */
    public BeerController(final BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable final UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    /**
     * API to create a new beer.
     *
     * @param beerDto beer info to save.
     * @return location to the saved beer.
     */
    @PostMapping
    public ResponseEntity handlePost(@RequestBody final BeerDto beerDto) {
        BeerDto savedBeerDto = beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        // TODO: Add hostname to URL
        headers.add("Location", "/api/v1/beer/" + savedBeerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    /**
     * API to update beer details.
     *
     * @param beerDto beer info to update.
     */
    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handlePut(@PathVariable final UUID beerId, @RequestBody final BeerDto beerDto) {
        beerService.updateBeer(beerId, beerDto);
    }

    /**
     * API to delete a beer info.
     *
     * @param beerId beer id to delete.
     */
    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable UUID beerId) {
        beerService.deleteBeer(beerId);
    }
}
