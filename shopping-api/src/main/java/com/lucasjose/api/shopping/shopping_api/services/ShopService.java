package com.lucasjose.api.shopping.shopping_api.services;

import com.lucasjose.api.shopping.shopping_api.model.DTO.ShopDTO;
import com.lucasjose.api.shopping.shopping_api.model.Shop;
import com.lucasjose.api.shopping.shopping_api.repositories.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    @Autowired
    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public List<ShopDTO> getAll() {
        List<Shop> shops = shopRepository.findAll();
        return shops.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public ShopDTO save(ShopDTO shopDTO) {
        Shop shop = convertToEntity(shopDTO);
        Shop savedShop = shopRepository.save(shop);
        return convertToDTO(savedShop);
    }

    public ShopDTO findById(String id) {
        Shop shop = shopRepository.findById(id).orElse(null);
        return shop != null ? convertToDTO(shop) : null;
    }

    public List<ShopDTO> findByUser(String userIdentifier) {
        List<Shop> shops = shopRepository.findByUserIdentifier(userIdentifier);
        return shops.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public List<ShopDTO> findByDate(Date start, Date end) {
        List<Shop> shops = shopRepository.findByDateBetween(start, end);
        return shops.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private ShopDTO convertToDTO(Shop shop) {
        return ShopDTO.builder()
            .id(shop.getId())
            .userIdentifier(shop.getUserIdentifier())
            .date(shop.getDate())
            .items(shop.getItems())
            .total(shop.getTotal())
            .build();
    }

    private Shop convertToEntity(ShopDTO shopDTO) {
        return Shop.builder()
            .id(shopDTO.getId())
            .userIdentifier(shopDTO.getUserIdentifier())
            .date(shopDTO.getDate())
            .items(shopDTO.getItems())
            .total(shopDTO.getTotal())
            .build();
    }
}
