package com.lucasjose.api.shopping.shopping_api.repositories;

import com.lucasjose.api.shopping.shopping_api.model.Shop;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ShopRepository extends MongoRepository<Shop, String> {

    /**
     * Buscar compras pelo identificador do usuário.
     */
    List<Shop> findByUserIdentifier(String userIdentifier);

    /**
     * Buscar compras pelo identificador do produto.
     */
    List<Shop> findByItems_ProductIdentifier(String productIdentifier);

    /**
     * Buscar compras em um intervalo de datas com valor total maior que o mínimo informado.
     */
    List<Shop> findByDateBetweenAndTotalGreaterThan(Date start, Date end, Double totalMin);

    /**
     * Buscar compras no intervalo de datas para gerar relatório.
     */
    List<Shop> findByDateBetween(Date dataInicio, Date dataFim);
}
