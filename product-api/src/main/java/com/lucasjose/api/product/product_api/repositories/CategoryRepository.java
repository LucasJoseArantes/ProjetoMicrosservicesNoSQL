package com.lucasjose.api.product.product_api.repositories;

import com.lucasjose.api.product.product_api.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
