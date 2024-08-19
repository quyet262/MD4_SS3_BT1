package com.example.managerproduct.service;

import com.example.managerproduct.model.Product;

import java.util.*;

public class ProductService implements IProductService {
    private static final Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Nokia911",10000,"Bền vĩnh cửu","Nokia"));
        products.put(2,new Product(2,"Samsung",2000.34,"Bền vĩnh cửu","Samsung"));
        products.put(3,new Product(3,"IphoneX",234235,"Bền vĩnh cửu","Apple"));
        products.put(4,new Product(4,"Iphone12promax",23425,"Bền vĩnh cửu","Apple"));
        products.put(5,new Product(5,"Iphone15",7868,"Bền vĩnh cửu","Apple"));
        products.put(6,new Product(6,"Redmi",67868,"Bền vĩnh cửu","Nokia"));
        products.put(7,new Product(7,"Samsung22",45636,"Bền vĩnh cửu","Nokia"));
        products.put(8,new Product(8,"RealMi",576,"Bền vĩnh cửu","Nokia"));
        products.put(9,new Product(9,"Iphone14Plus",345345,"Bền vĩnh cửu","Apple"));
        products.put(10,new Product(10,"Iphone15Promax",6757,"Bền vĩnh cửu","Apple"));
        products.put(11,new Product(11,"Nokia91",3453,"Bền vĩnh cửu","Nokia"));

    }



    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
    products.put(product.getId(),product);
    }

    @Override
    public void delete(int id) {
    products.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> nameProducts = new  ArrayList<>(products.values());
        List<Product> resultProducts = new ArrayList<>();
        for (Product product : nameProducts) {
            if (product.getName().contains(name)) {
                resultProducts.add(product);
            }
        }
        return resultProducts;
    }
}
