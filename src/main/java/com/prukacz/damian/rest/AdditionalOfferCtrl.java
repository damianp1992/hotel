package com.prukacz.damian.rest;

import com.prukacz.damian.entity.AdditionalOffer;
import com.prukacz.damian.repository.AdditionalOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/AdditionalService")
public class AdditionalOfferCtrl {

    private final AdditionalOfferRepository additionalServiceRepository;

    @Autowired
    public AdditionalOfferCtrl(AdditionalOfferRepository additionalServiceRepository) {
        this.additionalServiceRepository = additionalServiceRepository;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<AdditionalOffer> save(@RequestBody final AdditionalOffer additionalService){
        additionalServiceRepository.save(additionalService);

        return additionalServiceRepository.findAll();
    }

    @RequestMapping(value = "/delete/{offerId}", method = RequestMethod.GET)
    public List<AdditionalOffer> deleteService(@PathVariable final long offerId){
        additionalServiceRepository.delete(offerId);

        return additionalServiceRepository.findAll();
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<AdditionalOffer> findAllService() {

        return additionalServiceRepository.findAll();
    }

    @RequestMapping(value = "/type/{typeOfOffer}", method = RequestMethod.GET)
    public List<AdditionalOffer> findByTypeOfOffer(@PathVariable final String typeOfOffer) {

        return additionalServiceRepository.findByTypeOfOffer(typeOfOffer);
    }

    @RequestMapping(value = "/price/{priceOfOffer}", method = RequestMethod.GET)
    public List<AdditionalOffer> findByPriceOfOffer(@PathVariable final double priceOfOffer) {

        return additionalServiceRepository.findByPriceOfOffer(priceOfOffer);
    }
}
