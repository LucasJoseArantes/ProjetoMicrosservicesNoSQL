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

    /**
     * Endpoint básico para retornar todos os dados de compras.
     */
    @GetMapping
    public List<ShopDTO> getAll() {
        return shopService.getAll();
    }

    /**
     * Buscar uma compra por ID.
     */
    @GetMapping("/{id}")
    public ShopDTO findById(@PathVariable String id) {
        return shopService.findById(id);
    }

    /**
     * Salvar uma nova compra no banco de dados.
     */
    @PostMapping
    public ShopDTO save(@RequestBody ShopDTO shopDTO) {
        return shopService.save(shopDTO);
    }

    /**
     * Buscar compras por identificador de usuário.
     */
    @GetMapping("/shopByUser")
    public List<ShopDTO> getByUser(@RequestParam String userIdentifier) {
        return shopService.findByUser(userIdentifier);
    }

    /**
     * Buscar compras por intervalo de datas.
     */
    @GetMapping("/shopByDate")
    public List<ShopDTO> getByDate(@RequestParam Date start, @RequestParam Date end) {
        return shopService.findByDate(start, end);
    }

    /**
     * Buscar compras por identificador de produto.
     */
    @GetMapping("/{productIdentifier}")
    public List<ShopDTO> findByProductIdentifier(@PathVariable String productIdentifier) {
        return shopService.findByProductIdentifier(productIdentifier);
    }

    /**
     * Endpoint avançado: busca por filtro com base em data e valor mínimo.
     */
    @GetMapping("/search")
    public List<ShopDTO> getShopsByFilter(
            @RequestParam Date dataInicio,
            @RequestParam Date dataFim,
            @RequestParam Double valorMinimo) {
        return shopService.getShopsByFilter(dataInicio, dataFim, valorMinimo);
    }

    /**
     * Endpoint avançado: gerar relatório por intervalo de datas.
     */
    @GetMapping("/report")
    public List<ShopDTO> getReportByDate(
            @RequestParam Date dataInicio,
            @RequestParam Date dataFim) {
        return shopService.getReportByDate(dataInicio, dataFim);
    }
}
