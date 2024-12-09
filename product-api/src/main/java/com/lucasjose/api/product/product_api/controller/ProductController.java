package com.lucasjose.api.product.product_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lucasjose.api.product.product_api.model.Product;
import com.lucasjose.api.product.product_api.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Endpoints para /product

    // GET /product - Retorna todos os produtos
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // GET /product/{id} - Retorna um produto pelo ID
    @GetMapping("/{id}")
    public Product findById(@PathVariable String id) {
        return productService.findProductById(id);
    }

    // POST /product - Cria um novo produto
    @PostMapping
    public String saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    // PUT /product/{id} - Atualiza um produto pelo ID
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable String id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    // DELETE /product/{id} - Deleta um produto pelo ID
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable String id) {
        return productService.deleteProduct(id);
    }

    // GET /product/pageable - Retorna todos os produtos paginados
    @GetMapping("/pageable")
    public List<Product> getAllProductsPageable() {
        return productService.getAllProductsPageable();
    }

    // GET /product/category/{categoryId} - Retorna produtos por categoria
    @GetMapping("/category/{categoryId}")
    public List<Product> getProductByCategoryId(@PathVariable String categoryId) {
        return productService.getProductsByCategoryId(categoryId);
    }

    // GET /product/{productIdentifier} - Retorna um produto pelo identificador único
    @GetMapping("/identifier/{productIdentifier}")
    public Product findByProductIdentifier(@PathVariable String productIdentifier) {
        return productService.findByProductIdentifier(productIdentifier);
    }

    // Endpoints para /category

    // GET /category - Retorna todas as categorias
    @GetMapping("/category")
    public List<Product> getAllCategories() {
        return productService.getAllCategory();
    }

    // POST /category - Cria uma nova categoria
    @PostMapping("/category")
    public String saveCategory(@RequestBody Product product) {
        return productService.saveCategory(product);
    }

    // PUT /category/{id} - Atualiza uma categoria pelo ID
    @PutMapping("/category/{id}")
    public String updateCategory(@PathVariable String id, @RequestBody Product product) {
        return productService.updateCategory(id, product);
    }

    // DELETE /category/{id} - Deleta uma categoria pelo ID
    @DeleteMapping("/category/{id}")
    public String deleteCategory(@PathVariable String id) {
        return productService.deleteCategory(id);
    }

    // GET /category/pageable - Retorna todas as categorias paginadas
    @GetMapping("/category/pageable")
    public List<Product> getAllCategoriesPageable() {
        return productService.getAllCategoryPageable();
    }
}
