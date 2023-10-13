package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public interface ProductRepository {
    // Interfaces que determinan las reglas que debe cumplir
    // la persistencia para actuar entre los objetos de dominio y la DB.
    // los métodos deben ser capaces de guardar objetos de
    // dominio en la base de datos y recuperar objetos de dominio de la base de datos.

    // También hace la conexión con el service mediante el usage y
    // la conexión con el ProductoRepository es mediante el implementation

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
