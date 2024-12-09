package com.lucasjose.api.shopping.shopping_api.controller;

import com.lucasjose.api.shopping.shopping_api.model.DTO.ShopDTO;
import com.lucasjose.api.shopping.shopping_api.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/shopping")
public class ShopController {

    private final ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<ShopDTO> getAll() {
        return shopService.getAll();
    }

    @GetMapping("/{id}")
    public ShopDTO findById(@PathVariable String id) {
        return shopService.findById(id);
    }

    @PostMapping
    public ShopDTO save(@RequestBody ShopDTO shopDTO) {
        return shopService.save(shopDTO);
    }

    @GetMapping("/shopByUser")
    public List<ShopDTO> getByUser(@RequestParam String userIdentifier) {
        return shopService.findByUser(userIdentifier);
    }

    @GetMapping("/shopByDate")
    public List<ShopDTO> getByDate(@RequestParam Date start, @RequestParam Date end) {
        return shopService.findByDate(start, end);
    }
}
