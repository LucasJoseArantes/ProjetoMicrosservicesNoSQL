package com.lucasjose.api.shopping.shopping_api.repositories;

import com.lucasjose.api.shopping.shopping_api.model.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopRepository extends MongoRepository<Shop, String> {
    List<Shop> findByUserIdentifier(String userIdentifier);
    List<Shop> findByDateBetween(java.util.Date start, java.util.Date end);
}
