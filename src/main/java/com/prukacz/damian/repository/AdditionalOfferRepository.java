package com.prukacz.damian.repository;

import com.prukacz.damian.entity.AdditionalOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AdditionalOfferRepository extends JpaRepository<AdditionalOffer, Long> {

    List<AdditionalOffer> findByTypeOfOffer(String typeOfOffer);

    List<AdditionalOffer> findByPriceOfOffer(double priceOfOffer);
}
